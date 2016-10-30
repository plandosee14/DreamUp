package com.dreamup.test;

import com.dreamup.project.dao.ProjectDAO;
import com.dreamup.project.dto.ProjectDTO;

public class ProjectTest {
	public static void main(String[] args) {
		ProjectDTO project = new ProjectDTO();
		ProjectDAO dao = new ProjectDAO();
		
		System.out.println(dao.submitProject());
		
		project.setM_id("test3");
		project.setPro_thumbnail("thumbnail");
		project.setPro_title("test입니당");
		project.setPro_catagory("음악");
		project.setPro_days(30);
		project.setPro_goal(300000);
		project.setPro_state(0);
		
		System.out.println(dao.insertBacic2(project));
//		
//		project.setPro_no(2);
//		project.setPro_video("https://www.youtube.com/");
//		project.setPro_content("이 프로젝트는 테스트다 졸리당");
//		project.setPro_link("www.naver.com");
//		project.setPro_image("dfsdf");
//		
//		System.out.println(dao.updateStory(project));

			
		
	}
}
