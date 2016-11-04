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
import com.dreamup.support.dao.SupportDAO;
import com.dreamup.support.dto.SupportDTO;

public class SelectMysupportAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		String m_id = request.getParameter("m_id");
		SupportDAO dao = new SupportDAO();
		List<SupportDTO> supportList;
		supportList = dao.selectMysupport(m_id);
		for (int i = 0; i < supportList.size(); i++) {
			SupportDTO support;
			support = supportList.get(i);
			System.out.println("11" + support.toString());
		}
		request.setAttribute("supportList",supportList );
		
		ProjectDAO pdao = new ProjectDAO();
		List<ProjectDTO> supportProList;
		supportProList = pdao.selectProjectById(m_id);
		request.setAttribute("supportProList", supportProList);
		
		ActionForward actionForward;
		actionForward = mapping.findForward("scs");
		return actionForward;

	}
}
