package com.dreamup.support.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SuPaySendAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		request.getParameter("pro_no");
		request.getParameter("su_money");
		request.getParameter("name");
		request.getParameter("address");
		request.getParameter("phone1");
		request.getParameter("phone2");
		request.getParameter("phone3");
		request.getParameter("add1");
		request.getParameter("add2");
		request.getParameter("pay");
		request.getParameter("bank");
		request.getParameter("account");

		return super.execute(mapping, form, request, response);
	}
}
