package com.dreamup.project.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.project.dao.ProjectListDAO;
import com.dreamup.project.dto.ProjectListDTO;

public class ProjectListAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ProjectListDAO dao = new ProjectListDAO();
		ProjectListDTO projectListDTO = new ProjectListDTO();
		List<ProjectListDTO> projectList;
		projectList = dao.projectListData();
		request.setAttribute("projectList", projectList);

		ActionForward actionForward;
		actionForward = mapping.findForward("success");
		return actionForward;
	}

}
