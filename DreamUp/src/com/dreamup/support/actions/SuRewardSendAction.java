package com.dreamup.support.actions;

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

public class SuRewardSendAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("������Ʈ��ȣ: "+request.getParameter("pro_no"));
		System.out.println("������ ��ȣ: "+request.getParameter("re_no"));
		System.out.println("���̵�: "+request.getSession().getAttribute("login_id"));
		System.out.println("�Է±ݾ�:"+ request.getParameter("re_money"));
		
		ProjectDAO pdao = new ProjectDAO();
		ProjectDTO project = new ProjectDTO();
		project = pdao.selectProject(Integer.parseInt(request.getParameter("pro_no")));
		
		
		RewardDTO reward = new RewardDTO();
		RewardDAO rdao = new RewardDAO();
		
		if(request.getParameter("reCheck").equals("true")){
			reward = rdao.selectReward(Integer.parseInt(request.getParameter("re_no")));
		}else{
			//������� �Ŀ��ϰ�� reward = null;
			reward=null;		
			request.setAttribute("reward", reward);
		}
		request.setAttribute("project", project);
		request.setAttribute("su_money", request.getParameter("re_money"));
		
		return mapping.findForward("scs");
	}
}
