package com.dreamup.test;

import java.util.List;

import com.dreamup.member.dto.MemberDTO;
import com.dreamup.project.dao.ProjectDAO;
import com.dreamup.project.dto.ProjectDTO;

public class ProjectTest {

	public static void main(String[] args) {
		// ProjectDTO project = new ProjectDTO();
		ProjectDAO dao = new ProjectDAO();

		// System.out.println(dao.submitProject());

		// project.setM_id("test4");
		// project.setPro_thumbnail("thumbnail");
		// project.setPro_title("test�Դϴ�");
		// project.setPro_catagory("����");
		// project.setPro_days(30);
		// project.setPro_goal(300000);
		// project.setPro_state(0);
		//
		// System.out.println(dao.insertBacic2(project));
		//
		// project.setPro_no(15);
		// project.setPro_video("https://www.youtube.com/");
		// project.setPro_content("�� ������Ʈ�� �׽�Ʈ�� ������");
		// project.setPro_link("www.naver.com");
		// project.setPro_image("dfsdf");
		//
		// System.out.println(dao.updateStory(project));

		// project.setPro_no(18);
		// project.setPro_fileImage("����url");
		// project.setPro_fileIntro("���� ���ٿ��̴�");
		// project.setPro_address("���m�� �Ǽ���");
		// project.setPro_fileSns("snsurl");
		//
		//
		// System.out.println(dao.updateProfile(project));

		// project.setPro_no(18);
		// project.setPro_bank("�츮����");
		// project.setPro_account("10002-536-4444");
		//
		// System.out.println(dao.updateAccount(project));

		// System.out.println(dao.selectinsertingProjectNo("test1"));

		// List<ProjectDTO> projcetList = dao.selectProjectById("test1");
		//
		// for (int i = 0; i < projcetList.size(); i++) {
		// ProjectDTO project;
		// project=projcetList.get(i);
		// System.out.println(project);
		//
		// }

//		List<ProjectDTO> projectList = dao.selectProjectByTitle("D");
//		if (projectList != null) {
//			System.out.println(projectList.size());
//			for (int i = 0; i < projectList.size(); i++) {
//				ProjectDTO project;
//				project = projectList.get(i);
//				System.out.println(project);
//
//			}
//		}
		
//		List<ProjectDTO> projcetList = dao.selectNewProject();
//		
//		 for (int i = 0; i < projcetList.size(); i++) {
//		 ProjectDTO project;
//		 project=projcetList.get(i);
//		 System.out.println(project);
//		
//		 }
		
		List<ProjectDTO> projcetList = dao.selectPopProject();
		
		 for (int i = 0; i < projcetList.size(); i++) {
		 ProjectDTO project;
		 project=projcetList.get(i);
		 System.out.println(project.toString());
		
		 }
	
		// System.out.println(dao.selectProjectById("test1"));

		// System.out.println(dao.selectProject(20));
	}
}
