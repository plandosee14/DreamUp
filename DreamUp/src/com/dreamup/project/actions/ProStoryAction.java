package com.dreamup.project.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dreamup.project.dto.ProjectDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class ProStoryAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int maxSize=5*1024*1024;//1kb--> 1mb  5Mb 사이즈 제한
	     String saveDirectory=request.getSession().getServletContext().getRealPath("video");
	     
	     MultipartRequest mr = 
	    		 new MultipartRequest(request,saveDirectory,maxSize,"UTF-8",
	    				new DefaultFileRenamePolicy());
	     String filename=mr.getFilesystemName("myfile");
	    
		System.out.println(filename);
		System.out.println("링크가져오기: "+mr.getParameter("link"));
		
		System.out.println("내용: "+mr.getParameter("content"));
		
		ProjectDTO project = new ProjectDTO();
		//project.set
		return mapping.findForward("scs");
	}
}
