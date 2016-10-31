package com.dreamup.reward.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RewardAddAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		System.out.println("cnt°¹¼ö: "+request.getParameter("cnt"));
		System.out.println("»èÁ¦list: "+request.getParameter("deleteList"));
		
		for(int i=0; i<cnt; i++){
			
		}
		
		return mapping.findForward("scs");
	}

}
