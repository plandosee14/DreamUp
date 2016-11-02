package com.dreamup.member.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.encryption.BCrypt;
import com.dreamup.member.dao.MemberDAO;
import com.dreamup.member.dto.MemberDTO;

public class MemberInfoAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String m_id = request.getParameter("m_id");
		System.out.println("현재 로그인 아이디 : " +m_id);
		MemberDAO dao = new MemberDAO();
		MemberDTO member = new MemberDTO();
		member = dao.selectMember(m_id);
		
		EncryptionPwd encryptionPwd = new EncryptionPwd();
		ActionForward actionForward = null;
		System.out.println("shaPwd() : " +encryptionPwd.shaPwd(member));
		System.out.println("dao.getPwd() : " +dao.getPwd(member.getM_password()));
		
		if (BCrypt.checkpw(encryptionPwd.shaPwd(member), dao.getPwd(member.getM_id()))) {
			System.out.println("비밀번호 확인 성공");
			member = dao.selectMember(m_id);
			System.out.println("[MemberInfoAction] 비밀번호 확인 이후 사용자 정보");
			request.setAttribute("memberInfo", member);
			actionForward = mapping.findForward("success");
		}/* else {
			request.setAttribute("비밀번호 확인 실패", "fail");
			forward = mapping.findForward("fail");
		}*/
		
		return actionForward;
	}

}
