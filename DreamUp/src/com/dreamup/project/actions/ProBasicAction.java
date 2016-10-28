package com.dreamup.project.actions;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.project.dao.ProjectDAO;
import com.dreamup.project.dto.ProjectDTO;

public class ProBasicAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		 
		ProjectDAO dao = new ProjectDAO();
		String path = dao.insertProImage(request);
		
		ProjectDTO project = new ProjectDTO();
		project.setM_id(request.getParameter("m_id"));
		project.setPro_title(request.getParameter("pro_title"));
		project.setM_id(request.getParameter("m_id"));
		project.setM_id(request.getParameter("m_id"));
		project.setM_id(request.getParameter("m_id"));
		project.setM_id(request.getParameter("m_id"));
		
		
		return super.execute(mapping, form, request, response);
	}

}
