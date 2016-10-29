package com.dreamup.member.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.member.dao.MemberDAO;
import com.dreamup.member.dto.MemberDTO;

public class JoinAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		MemberDTO member = new MemberDTO();
		member.setM_id(request.getParameter("id"));
		member.setM_password(request.getParameter("pass"));
		member.setM_name(request.getParameter("name"));
		member.setM_email(request.getParameter("email"));

		System.out.println(member.toString());
		MemberDAO dao = new MemberDAO();
		
		ActionForward forward;
		
		if(dao.insert(member)){
			forward = mapping.findForward("scs");
		}else{
			forward = mapping.findForward("fail");
			
		}

		return mapping.findForward("scs");
	}

}
