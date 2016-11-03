package com.dreamup.project.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.project.dao.ProjectDAO;
import com.dreamup.project.dto.ProjectDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class ProStoryAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ActionForward forward;
		int maxSize=50*1024*1024;//1kb--> 1mb  5Mb 사이즈 제한
	     String saveDirectory=request.getSession().getServletContext().getRealPath("video");
	     
	     MultipartRequest mr = 
	    		 new MultipartRequest(request,saveDirectory,maxSize,"UTF-8",
	    				new DefaultFileRenamePolicy());
	     String filename=mr.getFilesystemName("myfile");
	    
	     
		System.out.println(filename);
		System.out.println("링크가져오기: "+mr.getParameter("link"));
		
		System.out.println("내용: "+mr.getParameter("content"));
		
		
		ProjectDAO dao = new ProjectDAO();
		
		int pro_No = dao.selectinsertingProjectNo(mr.getParameter("login_id"));

		ProjectDTO project = new ProjectDTO();
		project.setPro_no(pro_No);
		project.setPro_video(filename);
		project.setPro_link(mr.getParameter("link"));
		project.setPro_content(mr.getParameter("content"));
		
		if(dao.updateStory(project)){
			forward = mapping.findForward("scs");
		}else{
			forward = mapping.findForward("fail");		
		}
			
		return mapping.findForward("scs");
	}
}
