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

public class LoginAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		MemberDTO member = new MemberDTO();
		MemberDAO dao = new MemberDAO();
		member.setM_id(request.getParameter("id"));
		member.setM_password(request.getParameter("pass"));
		member.setM_name(request.getParameter("name"));
		member.setM_email(request.getParameter("email"));

		System.out.println("[LoginAction] ���� ������ Ȯ�� : " + member.toString());

		System.out.println("�Է� �н������ ��� �н����� �� ");
		System.out.println("�Է� �н����� : " + member.getM_password());
		System.out.println("��� �н����� : " + dao.getPwd(member.getM_id()));

		EncryptionPwd encryptionPwd = new EncryptionPwd();

		ActionForward forward;

		if (BCrypt.checkpw(encryptionPwd.shaPwd(member), dao.getPwd(member.getM_id()))) {
			System.out.println("�α��� ����");
			request.getSession().setAttribute("login_id", request.getParameter("id"));
			forward = mapping.findForward("scs");
		} else {
			request.setAttribute("login-fail", "fail");
			forward = mapping.findForward("fail");
		}
		/*
		 * if (dao.login(member)) { System.out.println("�α��� ����"); request.getSession().setAttribute("login_id", request.getParameter("id")); forward =
		 * mapping.findForward("scs");
		 * 
		 * } else { request.setAttribute("login-fail", "fail"); forward = mapping.findForward("fail"); }
		 */
		return forward;
	}

}
