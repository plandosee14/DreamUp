package com.dreamup.test;

import com.dreamup.dao.project.ProjectDAO;
import com.dreamup.dto.project.ProjectDTO;

public class ProjectTest {
	public static void main(String[] args) {
		ProjectDAO dao = new ProjectDAO();
		//System.out.println(dao.deleteProject(5));
		//System.out.println(dao.selectProject(6));
		ProjectDTO project = new ProjectDTO();
		
		project.setM_id("daemang25");
		project.setPro_thumbnail("thumbnailURL");
		project.setPro_title("DAO TEST1");
		project.setPro_catagory("TEST");
		project.setPro_goal(300000);
		
		
		System.out.println(dao.insertBacic(project));
		
	}
}
