package com.dreamup.support.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.project.dao.ProjectDAO;
import com.dreamup.project.dto.ProjectDTO;
import com.dreamup.reward.dao.RewardDAO;
import com.dreamup.reward.dto.RewardDTO;

public class SuRewardListAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ActionForward forward;
		if(request.getSession().getAttribute("login_id")==null){
			forward = mapping.findForward("fail");
		}else{
			
			
		
		
	    int pro_no = Integer.parseInt(request.getParameter("pro_no"));
		ProjectDAO pdao = new ProjectDAO();
	    ProjectDTO project = pdao.selectProject(pro_no);
		request.setAttribute("project", project);
	    
		RewardDAO rdao = new RewardDAO();
		
		List<RewardDTO> rewardList;
		rewardList = rdao.selectProReward(pro_no);
		for (int i = 0; i < rewardList.size(); i++) {
			System.out.println(rewardList.get(i).toString());
		}
		
		request.setAttribute("rewardList", rewardList);
		forward = mapping.findForward("scs");
		}
		return forward;
	}
}
