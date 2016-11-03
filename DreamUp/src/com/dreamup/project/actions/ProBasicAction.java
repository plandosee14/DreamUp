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
			
		
		ProjectDTO project = new ProjectDTO();
		project.setM_id(mr.getParameter("m_id"));
		System.out.println(mr.getParameter("m_id"));
		project.setPro_title(mr.getParameter("pro_title"));
		project.setPro_catagory(mr.getParameter("pro_category"));
		project.setPro_goal(Integer.parseInt(mr.getParameter("pro_goal")));
		project.setPro_thumbnail(mr.getFilesystemName("myfile"));
		
		ProjectDAO dao = new ProjectDAO();
		
		ActionForward forward;
		
		System.out.println(mr.getParameter("day-type"));
		//day-type이 기간으로 체크되어있을 경우 기간insertDAO 호출
		if(mr.getParameter("day-type").equals("days")){
			System.out.println("days 찍어보기: "+mr.getParameter("pro_days"));
			project.setPro_days(Integer.parseInt(mr.getParameter("pro_days")));
			System.out.println(project.toString());
			
			if(dao.insertBacic2(project)){
				
				forward = mapping.findForward("scs");
			}else{
				forward = mapping.findForward("fail");
			}
		}else{
			project.setPro_end(mr.getParameter("pro_End"));
		   if(dao.insertBacic(project)){
			   System.out.println("프로젝트입력성공: "+project.toString());	
			   forward = mapping.findForward("scs");
		   }else{	   
			   forward = mapping.findForward("fail");
		   }
		    
		}
		
		int pro_No = dao.selectinsertingProjectNo(mr.getParameter("m_id"));
		request.setAttribute("pro_No", pro_No);
		
		
		return forward;
	}

}
