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

public class ProfileAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ActionForward forward=null;
		
		int maxSize=5*1024*1024;//1kb--> 1mb  5Mb 사이즈 제한
	     String saveDirectory=request.getSession().getServletContext().getRealPath("profile");
	     
	     MultipartRequest mr = 
	    		 new MultipartRequest(request,saveDirectory,maxSize,"UTF-8",
	    				new DefaultFileRenamePolicy());
	     String filename= mr.getFilesystemName("myfile");
		
	     ProjectDAO dao = new ProjectDAO();
	     int pro_No = dao.selectinsertingProjectNo(mr.getParameter("m_id"));
	     String pro_fileIntro =  mr.getParameter("pro_fileIntro");
	     //mr.getParameter("Pro_zip")
	     String pro_address = mr.getParameter("pro_address");
	     String pro_fileSns =  mr.getParameter("pro_fileSns");
		
	     ProjectDTO project = new ProjectDTO();
	     project.setPro_fileImage(filename);
	     project.setPro_fileIntro(pro_fileIntro);
	     project.setPro_fileSns(pro_fileSns);
	     project.setPro_address(pro_address);
	     project.setPro_no(pro_No);
	     
	     if(dao.updateProfile(project)){
	    	 forward = mapping.findForward("scs");
	     }else{
	    	 forward = mapping.findForward("fail");
	     }
	     
		return forward;
	}

}
