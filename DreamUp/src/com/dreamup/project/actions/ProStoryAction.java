package com.dreamup.project.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class ProStoryAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int maxSize=5*1024*1024;//1kb--> 1mb  5Mb 사이즈 제한
	     //String saveDirectory=request.getSession().getServletContext().getRealPath("img/thumnail").getRealPath("upload");
	     String filename="";
	     
	   /*   MultipartRequest mr = 
	    		 new MultipartRequest(request,saveDirectory,maxSize,"euc-kr",
	    				new DefaultFileRenamePolicy());
	     */
		//System.out.println(mr.getParameter(""));
	      //mr.getFilesystemName("myfile");
		return super.execute(mapping, form, request, response);
	}
}
