package com.dreamup.support.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.support.dao.SupportDAO;
import com.dreamup.support.dto.SupportDTO;

public class SuInsertAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ActionForward forward;
		
		SupportDTO support = new SupportDTO();
		
		support.setM_id((String)request.getSession().getAttribute("login_id"));
		support.setPro_no(Integer.parseInt(request.getParameter("pro_no")));
		support.setRe_no(Integer.parseInt(request.getParameter("re_no")));
		support.setSu_money(Integer.parseInt(request.getParameter("su_money")));
		support.setSu_name(request.getParameter("su_name"));
		support.setSu_zip(request.getParameter("su_zip"));
		support.setSu_address(request.getParameter("su_address"));
		support.setSu_phone(request.getParameter("su_phone"));
		support.setPaymentPlan(request.getParameter("su_paymentPlan"));
		support.setSu_refundAccount(request.getParameter("su_refundAccount"));
		support.setSu_refundBank(request.getParameter("su_refundBank"));
		System.out.println("잘 전달되었나요?: "+support.toString());
		
		SupportDAO dao = new SupportDAO();
		
		if(dao.insertSupport(support)){
			forward = mapping.findForward("scs");
		}else{
			forward = mapping.findForward("fail");
			
		}
		return forward;
	}
}
