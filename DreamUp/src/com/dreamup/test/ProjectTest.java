package com.dreamup.test;

import com.dreamup.dao.project.ProjectDAO;
import com.dreamup.dto.project.ProjectDTO;

public class ProjectTest {
	public static void main(String[] args) {
		ProjectDAO dao = new ProjectDAO();
		//System.out.println(dao.deleteProject(5));
		//System.out.println(dao.selectProject(6));
		ProjectDTO project = new ProjectDTO();
		
		System.out.println(dao.insertBacic(project));
		
	}
}
