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
	public ProjectListDTO projcetData(int pro_no){
		ProjectListDTO listDTO;
		try {
			listDTO = (ProjectListDTO) sqlMap.queryForObject("projectList.projcetData",pro_no);
			return listDTO;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//����ȭ�鿡 ������Ʈ ����Ʈ �Ѹ���(ProjectListDTO)
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
	
	public ProjectListDTO myProjectInfo(String m_id){
		ProjectListDTO myProject;
		try {
			myProject = (ProjectListDTO) sqlMap.queryForObject("projectList.myProjectInfo",m_id);
			return myProject;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
