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
		return false;
	}

	public boolean insertStory(ProjectDTO project) {
		return false;
	}

	public boolean insertProfile(ProjectDTO project) {
		return false;
	}

	public boolean insertAccount(ProjectDTO project) {
		return false;
	}

	public ProjectDTO selectTempProject(int ptNo) {
		return null;
	}

	public boolean insertProject(ProjectDTO project) {
		return false;
	}

	public boolean deleteProject(int pro_no) {
		try {
			if (1 == (sqlMap.delete("project.deleteProject", pro_no))) {
				System.out.println("ProjectDAO _deleteProject :  NO="+pro_no+" 삭제성공");
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
			project = (ProjectDTO) sqlMap.queryForObject("project.selectProject",pro_no);
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
