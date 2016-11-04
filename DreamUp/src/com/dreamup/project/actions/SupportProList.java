package com.dreamup.project.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.project.dao.ProjectDAO;
import com.dreamup.project.dto.ProjectDTO;

public class SupportProList extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
			String m_id = request.getParameter("m_id");
			System.out.println("m_id " + m_id );
			ProjectDAO dao = new ProjectDAO();
			List<ProjectDTO> supportProList;
			supportProList = dao.selectProjectById(m_id);
			for (int i = 0; i < supportProList.size(); i++) {
				System.out.println("여기라고 ");
				ProjectDTO project = new ProjectDTO();
				project = supportProList.get(i);
				System.out.println(project.toString());
			}
			request.setAttribute("supportProList", supportProList);
		return mapping.findForward("scs");
	}

}
