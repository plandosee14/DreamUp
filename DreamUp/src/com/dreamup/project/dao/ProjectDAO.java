package com.dreamup.project.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


import javax.servlet.http.HttpServletRequest;

import com.dreamup.ibatis.SqlMapConfig;
import com.dreamup.project.dto.ProjectDTO;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class ProjectDAO {
	SqlMapClient sqlMap;

	public ProjectDAO() {
		sqlMap = SqlMapConfig.getSqlMapInstance();
	}
	

	// 프로젝트 기본 정보 입력 ok
	public boolean insertBacic(ProjectDTO project) {
		 
		try {
			sqlMap.insert("project.insertBasic", project);
			
				System.out.println("DAO : 프로젝트 기본정보 입력 성공");
				return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean insertBacic2(ProjectDTO project) {
		 
		try {
			sqlMap.insert("project.insertBasic2", project);
			
				System.out.println("DAO : 프로젝트 기본정보 입력 성공");
				return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


	//프로젝트 스토리 정보 입력 ok
	public boolean updateStory(ProjectDTO project) {
		int result;
		try {
			result = sqlMap.update("project.updateStory", project);
			if (result == 1) {
				System.out.println("DAO : 프로젝트 스토리정보 입력 성공");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	//프로젝트 프로필 정보 입력
	public boolean updateProfile(ProjectDTO project) {
		int result;
		try {
			result = sqlMap.update("prject.updateProfile", project);
			if (result == 1) {
				System.out.println("DAO : 프로젝트 등록자 프로필정보 입력 성공");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	//프로필 계좌 정보 입력
	public boolean updateAccount(ProjectDTO project) {
		int result;
		try {
			result = sqlMap.update("prject.updateAccount", project);
			if (result == 1) {
				System.out.println("DAO : 프로젝트 계좌정보 입력 성공");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	//프로젝트 사진 or 타이틀 클릭 시 보이는 프로젝트 상세 화면
	public ProjectDTO selectProject(int pro_no) {
		ProjectDTO project;
		try {
			project = (ProjectDTO) sqlMap.queryForObject("project.selectProject", pro_no);
			return project;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	//마이페이지 자신의 아이디로 등록한 프로젝트 목록
	public List<ProjectDTO> selectProjectById(String id) {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectNewProject");
			System.out.println("DAO : 신규 프로젝트 목록 조회 성공");
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ProjectDTO> selectProjectByTitle(String id) {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectNewProject");
			System.out.println("DAO : 신규 프로젝트 목록 조회 성공");
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ProjectDTO> selectNewProject() {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectNewProject");
			System.out.println("DAO : 신규 프로젝트 목록 조회 성공");
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<ProjectDTO> selectPopProject() {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectPopProject");
			System.out.println("DAO : 신규 프로젝트 목록 조회 성공");
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<ProjectDTO> selectCatagoryProject(String catagory) {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectCatagoryProject");
			System.out.println("DAO : 신규 프로젝트 목록 조회 성공");
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
/*	public List<ProjectDTO> searchProjectBy*/
}
