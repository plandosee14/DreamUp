package com.dreamup.dao.project;

import java.sql.SQLException;
import java.util.List;

import com.dreamup.dto.project.ProjectDTO;
import com.dreamup.ibatis.SqlMapConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class ProjectDAO {
	SqlMapClient sqlMap;

	public ProjectDAO() {
		sqlMap = SqlMapConfig.getSqlMapInstance();
	}

	public boolean insertBacic(ProjectDTO project) {
		int result;
		try {
			result = (int) sqlMap.insert("project.insertBasic", project);
			if (result == 1) {
				System.out.println("DAO : 프로젝트 기본정보 입력 성공");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateStory(ProjectDTO project) {
		int result;
		try {
			result = sqlMap.update("prject.updateStory", project);
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

	public boolean deleteProject(int pro_no) {
		try {
			if (1 == (sqlMap.delete("project.deleteProject", pro_no))) {
				System.out.println("DAO : 프로젝트 삭제 성공");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	//프로젝트 사진or타이틀 클릭시 보이는 상세화면
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
}
