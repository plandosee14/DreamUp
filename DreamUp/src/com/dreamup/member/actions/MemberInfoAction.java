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
		System.out.println("���� �α��� ���̵� : " +m_id);
		MemberDAO dao = new MemberDAO();
		MemberDTO member = new MemberDTO();
		member = dao.selectMember(m_id);
		
		EncryptionPwd encryptionPwd = new EncryptionPwd();
		ActionForward actionForward = null;
		System.out.println("shaPwd() : " +encryptionPwd.shaPwd(member));
		System.out.println("dao.getPwd() : " +dao.getPwd(member.getM_password()));
		
		if (BCrypt.checkpw(encryptionPwd.shaPwd(member), dao.getPwd(member.getM_id()))) {
			System.out.println("��й�ȣ Ȯ�� ����");
			member = dao.selectMember(m_id);
			System.out.println("[MemberInfoAction] ��й�ȣ Ȯ�� ���� ����� ����");
			request.setAttribute("memberInfo", member);
			actionForward = mapping.findForward("success");
		}/* else {
			request.setAttribute("��й�ȣ Ȯ�� ����", "fail");
			forward = mapping.findForward("fail");
		}*/
		
		return actionForward;
	}

}
