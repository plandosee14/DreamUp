package com.dreamup.reward.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.project.dao.ProjectDAO;
import com.dreamup.reward.dao.RewardDAO;
import com.dreamup.reward.dto.RewardDTO;

public class RewardAddAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ActionForward forward = mapping.findForward("fail");
		
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		String deleteStr = request.getParameter("deleteList");
		String delList[] = deleteStr.split(",");
		
		ProjectDAO pdao = new ProjectDAO();
		int pro_No = pdao.selectinsertingProjectNo(request.getParameter("m_id"));
		for(int i=0; i<cnt; i++){
			for(int j=0; j<delList.length; j++){
				System.out.println(delList[j]);
				if(i != Integer.parseInt(delList[j])){
					RewardDTO reward = new RewardDTO();
					reward.setPro_no(pro_No);
					reward.setRe_money(Integer.parseInt(request.getParameter("re_money"+i)));
					reward.setRe_title(request.getParameter("title"+i));
					reward.setRe_item(request.getParameter("item"+i));
					reward.setRe_delivery(request.getParameter("duedate"+i));
					reward.setRe_limite(Integer.parseInt(request.getParameter("amount"+i)));
					
					RewardDAO dao = new RewardDAO();
					if(dao.insertReward(reward)){
						forward = mapping.findForward("scs");
					}else{
						forward = mapping.findForward("fail");					
					}
				}
			}
			
			
		}
		
		return forward;
	}

}
