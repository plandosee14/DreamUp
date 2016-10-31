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
		System.out.println(sqlMap);
	}
	

	// ������Ʈ �⺻ ���� �Է� ok
	public boolean insertBacic(ProjectDTO project) {
		 
		try {
			sqlMap.insert("project.insertBasic", project);
			
				System.out.println("DAO : ������Ʈ �⺻���� �Է� ����");
				return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//ok
	public boolean insertBacic2(ProjectDTO project) {
		 
		try {
			sqlMap.insert("project.insertBasic2", project);
			
				System.out.println("DAO : ������Ʈ �⺻���� �Է� ����");
				return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


	//������Ʈ ���丮 ���� �Է� ok
	public boolean updateStory(ProjectDTO project) {
		int result;
		try {
			result = sqlMap.update("project.updateStory", project);
			if (result == 1) {
				System.out.println("DAO : ������Ʈ ���丮���� �Է� ����");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	//������Ʈ ������ ���� �Է� ok
	public boolean updateProfile(ProjectDTO project) {
		int result;
		try {
			result = sqlMap.update("project.updateProfile", project);
			if (result == 1) {
				System.out.println("DAO : ������Ʈ ����� ���������� �Է� ����");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	//������ ���� ���� �Է� ok
	public boolean updateAccount(ProjectDTO project) {
		int result;
		try {
			result = sqlMap.update("project.updateAccount", project);
			if (result == 1) {
				System.out.println("DAO : ������Ʈ �������� �Է� ����");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	//������Ʈ ���� or Ÿ��Ʋ Ŭ�� �� ���̴� ������Ʈ �� ȭ��ok
	public ProjectDTO selectProject(int pro_no) {
		
		ProjectDTO result;
		try {
			result = (ProjectDTO) sqlMap.queryForObject("project.selectProject", pro_no);
			System.out.println(result);
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	
	//���������� �ڽ��� ���̵�� ����� ������Ʈ ���
	public List<ProjectDTO> selectProjectById(String id) {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectNewProject");
			System.out.println("DAO : �ű� ������Ʈ ��� ��ȸ ����");
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
			System.out.println("DAO : �ű� ������Ʈ ��� ��ȸ ����");
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
			System.out.println("DAO : �ű� ������Ʈ ��� ��ȸ ����");
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
			System.out.println("DAO : �ű� ������Ʈ ��� ��ȸ ����");
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
			System.out.println("DAO : �ű� ������Ʈ ��� ��ȸ ����");
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	//��Ϲ�ư �������� state�� 1�� �ٲ� ok
	public boolean submitProject(){
		int result;
		try {
			result = sqlMap.update("project.submitProject");
			if (result == 1) {
				System.out.println("����");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	//������̾��� ������Ʈ���� ���� �ֱٿ� ����ϴٰ� �� ������Ʈ �ѹ��� ��ȸ
	public boolean selectinsertingProjectNo(){
		return false;
	}
	
/*	public List<ProjectDTO> searchProjectBy*/
}
