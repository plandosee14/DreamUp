package com.dreamup.support.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.reward.dao.RewardDAO;
import com.dreamup.reward.dto.RewardDTO;
import com.dreamup.support.dto.SupportDTO;

public class SuPaySendAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		     
		SupportDTO support = new SupportDTO();
		support.setM_id((String)request.getSession().getAttribute("login_id"));
		support.setPro_no(Integer.parseInt(request.getParameter("pro_no")));
		support.setSu_money(Integer.parseInt(request.getParameter("su_money")));
		support.setSu_name(request.getParameter("name"));
		support.setSu_zip(request.getParameter("add1")+"-"+request.getParameter("add2"));
		support.setSu_address(request.getParameter("address"));
		support.setSu_phone(request.getParameter("phone1")+"-"+request.getParameter("phone2")+"-"+request.getParameter("phone3"));
		support.setPaymentPlan(request.getParameter("pay"));
		support.setSu_refundAccount(request.getParameter("account"));
		support.setSu_refundBank(request.getParameter("bank"));
		
		//reward가 true 일경우에만 리워드 넘김!
		if(request.getParameter("rewardCheck").equals("true")){
			support.setRe_no(Integer.parseInt(request.getParameter("re_no")));

			RewardDTO reward = new RewardDTO();
			RewardDAO rdao = new RewardDAO();
			reward = rdao.selectReward(Integer.parseInt(request.getParameter("re_no")));
			request.setAttribute("reward", reward);
		}
		request.setAttribute("support", support);
		return mapping.findForward("scs");
	}
}
