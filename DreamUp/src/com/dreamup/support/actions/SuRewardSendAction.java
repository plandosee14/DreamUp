package com.dreamup.support.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SuRewardSendAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("������Ʈ��ȣ: "+request.getParameter("pro_no"));
		System.out.println("������ ��ȣ: "+request.getParameter("re_no"));
		System.out.println("���̵�: "+request.getSession().getAttribute("login_id"));
		System.out.println("�Է±ݾ�:"+ request.getParameter("re_money"));
		
		return mapping.findForward("scs");
	}
}
