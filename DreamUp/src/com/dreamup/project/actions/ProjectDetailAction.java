package com.dreamup.project.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.project.dao.ProjectDAO;
import com.dreamup.project.dto.ProjectDTO;

public class ProjectDetailAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int pro_no = Integer.parseInt(request.getParameter("pro_no"));

		ProjectDAO dao = new ProjectDAO();
		ProjectDTO project = dao.selectProject(pro_no);
		
		request.setAttribute("project", project );
		
		
		
		return mapping.findForward("scs");
	}

}
