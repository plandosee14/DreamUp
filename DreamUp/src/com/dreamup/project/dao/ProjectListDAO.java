package com.dreamup.project.dao;

import java.sql.SQLException;
import java.util.List;

import com.dreamup.ibatis.SqlMapConfig;
import com.dreamup.project.dto.ProjectListDTO;
import com.ibatis.sqlmap.client.SqlMapClient;

public class ProjectListDAO {
	SqlMapClient sqlMap;
	public ProjectListDAO() {
		sqlMap = SqlMapConfig.getSqlMapInstance();
	}
	
	//메인화면에 프로젝트 리스트 뿌리기(ProjectListDTO)
	public List<ProjectListDTO> projectListData(){
		List<ProjectListDTO> projectListDTO;
		try {
			projectListDTO = sqlMap.queryForList("projectList.projectListData");
			return projectListDTO;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
