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
		 
		
		//�̹��� ����
		
		int maxSize=15*1024*1024; //ũ��
		String saveDirectory = request.getSession().getServletContext().getRealPath("img/thumnail");
		//���丮����
		MultipartRequest mr = 
				 new MultipartRequest(request,saveDirectory,maxSize,"UTF-8",
						new DefaultFileRenamePolicy());
		//��������
		
		String filename = mr.getFilesystemName("myfile");
		//�����̸� ������
		
		System.out.println("�����̸�: "+filename);
			
		
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
		//day-type�� �Ⱓ���� üũ�Ǿ����� ��� �ⰣinsertDAO ȣ��
		if(mr.getParameter("day-type").equals("days")){
			System.out.println("days ����: "+mr.getParameter("pro_days"));
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
			   System.out.println("������Ʈ�Է¼���: "+project.toString());	
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
