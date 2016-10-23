package com.dreamup.actions.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.dao.member.MemberDAO;
import com.dreamup.dto.member.MemberDTO;

public class JoinAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		MemberDTO member = new MemberDTO();
		          member.setM_id(request.getParameter("id"));
		          member.setM_id(request.getParameter("pass"));
		          member.setM_id(request.getParameter("name"));
		          member.setM_id(request.getParameter("email"));
		  
		MemberDAO dao = new MemberDAO(); 
		System.out.println(member.toString());
		
		return mapping.findForward("scs");
	}

}
