package com.dreamup.member.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.member.dao.MemberDAO;
import com.dreamup.member.dto.MemberDTO;

public class MemberUpdateAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			System.out.println("1111");
			String m_id = request.getParameter("m_id");
			String m_password = request.getParameter("pass");
			String m_name = request.getParameter("m_name");
			String m_email = request.getParameter("email");
			
			MemberDTO member = new MemberDTO(m_id, m_password, m_email, m_name);
			System.out.println(member.toString());
			
			EncryptionPwd encryptionPwd = new EncryptionPwd();
			String shaPwd = encryptionPwd.shaPwd(member);
			String bcryptPwd = encryptionPwd.bCryptPwd(shaPwd);
			
			member.setM_password(bcryptPwd);
			
			
			MemberDAO dao = new MemberDAO();

			if(dao.updateInfo(member)){
				System.out.println("수정성공");
			}else{
				System.out.println("수정실패");
			}
		
		return mapping.findForward("scs");
	}

}
