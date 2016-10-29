package com.dreamup.project.actions;

import java.sql.Date;

import javax.servlet.ServletContext;
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

public class ProBasicAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		 
		
		//이미지 저장
		
		int maxSize=15*1024*1024; //크기
		String saveDirectory = request.getSession().getServletContext().getRealPath("img/thumnail");
		//디렉토리설정
		MultipartRequest mr = 
				 new MultipartRequest(request,saveDirectory,maxSize,"UTF-8",
						new DefaultFileRenamePolicy());
		//사진저장
		
		String filename = mr.getFilesystemName("myfile");
		//사진이름 얻어오기
		
		System.out.println("파일이름: "+filename);
		System.out.println(mr.getParameter("m_id"));
		System.out.println(mr.getParameter("pro_title"));
		System.out.println(mr.getParameter("pro_title"));
		System.out.println(mr.getParameter("pro_title"));
	
		
		ProjectDTO project = new ProjectDTO();
		project.setM_id(mr.getParameter("m_id"));
		project.setPro_title(mr.getParameter("pro_title"));
		project.setPro_catagory(mr.getParameter("pro_category"));
		project.setPro_goal(Integer.parseInt(mr.getParameter("pro_goal")));
		project.setPro_end(mr.getParameter("pro_End"));
		project.setPro_thumbnail(mr.getFilesystemName("myfile"));
		
		System.out.println(project.toString());
		
		ProjectDAO dao = new ProjectDAO();
		dao.insertBacic(project);
		
		return mapping.findForward("scs");
	}

}
