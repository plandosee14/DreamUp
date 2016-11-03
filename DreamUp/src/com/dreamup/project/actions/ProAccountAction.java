package com.dreamup.project.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.project.dao.ProjectDAO;
import com.dreamup.project.dto.ProjectDTO;

public class ProAccountAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ActionForward forward;
		ProjectDAO dao = new ProjectDAO();
		
		System.out.println(request.getParameter("m_id"));
		int pro_no = dao.selectinsertingProjectNo(request.getParameter("m_id"));
		
		ProjectDTO project = new ProjectDTO();
		project.setPro_no(pro_no);
		project.setPro_bank(request.getParameter("bank"));
		project.setPro_account(request.getParameter("account"));
		
		if(dao.updateAccount(project)){
			forward = mapping.findForward("scs");
			
			project = dao.selectProject(pro_no);
			//System.out.println(project.toString());
			request.setAttribute("project", dao.selectProject(pro_no));
		}else{
			forward = mapping.findForward("fail");
		}
		
		return forward;
	}

}
