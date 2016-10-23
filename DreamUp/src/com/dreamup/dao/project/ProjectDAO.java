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
			result = (int) sqlMap.insert("project.insertBasic",project);
			if (result == 1) {
				System.out.println("DAO입력 성공");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean updateStory(ProjectDTO project) {
		return false;
	}

	public boolean updateProfile(ProjectDTO project) {
		return false;
	}

	public boolean updateAccount(ProjectDTO project) {
		return false;
	}

	public boolean insertProject(ProjectDTO project) {
		return false;
	}

	public boolean deleteProject(int pro_no) {
		try {
			if (1 == (sqlMap.delete("project.deleteProject", pro_no))) {
				System.out.println("ProjectDAO _deleteProject :  NO=" + pro_no + " 삭제성공");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

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

	public List<ProjectDTO> selectNewProject() {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectNewProject");
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<ProjectDTO> selectPopProject() {
		return null;
	}

	public List<ProjectDTO> selectProjectById(String id) {
		return null;
	}

	public List<ProjectDTO> selectCatagoryProject(String catagory) {
		return null;
	}
}
