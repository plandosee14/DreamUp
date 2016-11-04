package com.dreamup.project.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.project.dao.ProjectDAO;
import com.dreamup.project.dao.ProjectListDAO;
import com.dreamup.project.dto.ProjectDTO;
import com.dreamup.project.dto.ProjectListDTO;
import com.dreamup.reward.dao.RewardDAO;
import com.dreamup.reward.dto.RewardDTO;
import com.dreamup.support.dao.SupportDAO;
import com.dreamup.support.dto.SupportDTO;

public class MyProjectAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			String m_id = request.getParameter("m_id");
			System.out.println("mid" +m_id);
			
	/*		ProjectListDAO dao = new ProjectListDAO();
			ProjectListDTO myProject = new ProjectListDTO();
			myProject = dao.myProjectInfo(m_id);
			System.out.println(myProject.toString());
			request.setAttribute("myProject", myProject);
			System.out.println("pro_no : "+myProject.getPro_no());*/
			
			ProjectDAO dao = new ProjectDAO();
			ProjectDTO myProject = new ProjectDTO();
			
			myProject = dao.myProject(m_id);
			System.out.println("확인"+myProject.toString());
			request.setAttribute("myProject", myProject);
			
			SupportDAO sdao = new SupportDAO();
			List<SupportDTO> supportMoneyList = sdao.myProjectSupportInfo(myProject.getPro_no());
			request.setAttribute("supportMoneyList", supportMoneyList);
			System.out.println(supportMoneyList.toString());
			System.out.println("여기역이");
		
		
			ActionForward actionForward;
			actionForward = mapping.findForward("scs");
			
		return actionForward;
	}

}
