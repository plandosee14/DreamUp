package com.dreamup.test;

import java.util.List;

import com.dreamup.member.dto.MemberDTO;
import com.dreamup.project.dao.ProjectDAO;
import com.dreamup.project.dao.ProjectListDAO;
import com.dreamup.project.dto.ProjectDTO;
import com.dreamup.project.dto.ProjectListDTO;
import com.dreamup.subank.dao.SuBankDAO;
import com.dreamup.subank.dto.SuBankDTO;
import com.dreamup.support.dto.SupportDTO;

public class ProjectTest {

	public static void main(String[] args) {
		ProjectListDAO dao = new ProjectListDAO();
		ProjectListDTO listDTO = new ProjectListDTO();
		List<ProjectListDTO> projectList;
		projectList = dao.projectListData();
		for (int i = 0; i < projectList.size(); i++) {
			listDTO = projectList.get(i);
			System.out.println(listDTO.toString());
		}
	}
}
