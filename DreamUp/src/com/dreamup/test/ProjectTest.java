package com.dreamup.test;

import java.util.List;

import com.dreamup.member.dto.MemberDTO;
import com.dreamup.project.dao.ProjectDAO;
import com.dreamup.project.dto.ProjectDTO;
import com.dreamup.subank.dao.SuBankDAO;
import com.dreamup.subank.dto.SuBankDTO;
import com.dreamup.support.dto.SupportDTO;

public class ProjectTest {

	public static void main(String[] args) {
		ProjectDAO dao = new ProjectDAO();
		ProjectDTO project = new ProjectDTO();
		int pro_no = 4;
		project = dao.selectProject(pro_no);
		System.out.println(project.toString());
	}
}
