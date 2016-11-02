package com.dreamup.member.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.encryption.BCrypt;
import com.dreamup.encryption.SHA256;
import com.dreamup.member.dao.MemberDAO;
import com.dreamup.member.dto.MemberDTO;



public class EncryptionPwd extends Action {

	public String shaPwd(MemberDTO member) {
		SHA256 sha = SHA256.getInsatnce();
		String orgPwd = member.getM_password();
		System.out.println("orgPw(암호화전) : " + orgPwd);

		String shaPwd;
		try {
			shaPwd = sha.getSha256(orgPwd.getBytes());
			System.out.println("shaPwd(1차 암호화) : " + shaPwd);
			return shaPwd;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public String bCryptPwd(String shaPwd) {

		String bcryptPwd = BCrypt.hashpw(shaPwd, BCrypt.gensalt());
		System.out.println("bcrypt(2차 암호화) : " + bcryptPwd);

		return bcryptPwd;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		MemberDTO member = new MemberDTO();
		member.setM_id(request.getParameter("id"));
		member.setM_password(request.getParameter("pass"));
		

		String shaPwd = shaPwd(member);
		String bcryptPwd = bCryptPwd(shaPwd);

		ActionForward actionForward;
		MemberDAO dao = new MemberDAO();
		if (dao.encrytionPwd(bcryptPwd)) {
			actionForward = mapping.findForward("success");
		} else {
			actionForward = mapping.findForward("fail");
		}
		return actionForward;
	}
}
