package com.dreamup.project.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


import javax.servlet.http.HttpServletRequest;

import com.dreamup.ibatis.SqlMapConfig;
import com.dreamup.project.dto.ProjectDTO;
import com.dreamup.support.dto.SupportDTO;
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
		
		ProjectDTO project;
		try {
			project = (ProjectDTO) sqlMap.queryForObject("project.selectProject", pro_no);
			System.out.println("DAO : "+project.toString());
			return project;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	
	//���������� �ڽ��� ���̵�� ����� ������Ʈ ���ok
	public List<ProjectDTO> selectProjectById(String m_id) {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectProjectById",m_id);
		
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//���� ȭ�鿡�� ������Ʈ �˻� ok
	public List<ProjectDTO> selectProjectByTitle(String pro_title) {
		List<ProjectDTO> projectList = null;
		try {

			projectList = (List<ProjectDTO>)sqlMap.queryForList("project.selectProjectByTitle","%"+pro_title+"%");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return projectList;
	}
	//���� �űԾ��̵�� ��ǰ (�ֽż�)ok
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
	//���� �̴��� ���̵�� ��ǰ(�Ŀ��ڰ� ���� ��)ok
	public List<ProjectDTO> selectPopProject() {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectPopProject");
			
			return projcetList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//ī�װ��� ������Ʈok
	public List<ProjectDTO> selectCatagoryProject(String catagory) {
		List<ProjectDTO> projcetList;
		try {
			projcetList = sqlMap.queryForList("project.selectCatagoryProject",catagory);
			
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
	
	//���� ������Ʈ�� �Ŀ����� �� ī��Ʈ ok
	public boolean proSupportingCount(int pro_no){
		int result;
		try {
			result = sqlMap.update("project.proSupportingCount",pro_no);
			if (result == 1) {
				System.out.println("����");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	//���� ������Ʈ�� �Ŀ����� �ݾ�
	public boolean proSupportMoney(SupportDTO support){
		int result;
		try {
			result = sqlMap.update("project.proSupportMoney",support);
			if (result == 1) {
				System.out.println("����");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	//������̾��� ������Ʈ���� ���� �ֱٿ� ����ϴٰ� �� ������Ʈ �ѹ��� ��ȸok
	public int selectinsertingProjectNo(String m_id){
		int pro_no=0;
		try {
			pro_no = (int) sqlMap.queryForObject("project.selectinsertingProjectNo",m_id);
			return pro_no;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro_no;
	}
	
	
	
/*	public List<ProjectDTO> searchProjectBy*/
}
