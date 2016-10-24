package com.dreamup.test;

import com.dreamup.dao.project.ProjectDAO;
import com.dreamup.dto.project.ProjectDTO;

public class ProjectTest {
	public static void main(String[] args) {
		ProjectDTO project = new ProjectDTO();
		ProjectDAO dao = new ProjectDAO();
		project.setM_id("test1");
		project.setPro_thumbnail("thumbnail");
		project.setPro_title("ProjectTestTitle");
		project.setPro_catagory("game");
//		project.setPro_end(pro_end);
		project.setPro_goal(300000);
		project.setPro_state(0);
		
		
		dao.insertBacic(project);
	}
}
