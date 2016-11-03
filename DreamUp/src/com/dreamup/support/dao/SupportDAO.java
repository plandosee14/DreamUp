package com.dreamup.support.dao;

import java.sql.SQLException;
import java.util.List;

import com.dreamup.ibatis.SqlMapConfig;
import com.dreamup.support.dto.SupportDTO;
import com.ibatis.sqlmap.client.SqlMapClient;

public class SupportDAO {
	SqlMapClient sqlMap;

	public SupportDAO() {
		sqlMap = SqlMapConfig.getSqlMapInstance();
	}

	// �Ŀ����� �Է� ok
	public boolean insertSupport(SupportDTO support) {

		try {
			System.out.println("before insert to support : " + support.toString());
			sqlMap.insert("support.insertSupport", support);

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// ������Ʈ ok
	public boolean updateSupport(SupportDTO support) {

		try {
			int result;
			result = sqlMap.update("support.updateSupport", support);
			if (result == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// �Ŀ���� ���� ok
	public boolean deleteSupport(int suNO) {
		int result;

		try {
			result = sqlMap.delete("support.delete", suNO);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// ������Ʈ �Ŀ��� �������� ��� ok
	public List<SupportDTO> selectSupporter(int pro_no) {

		try {
			List<SupportDTO> supportlist;
			supportlist = sqlMap.queryForList("support.selectSupporter", pro_no);
			return supportlist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// ��� �������� ��
	public List<SupportDTO> selectAllSupporter() {
		try {
			List list;
			list = sqlMap.queryForList("support.selectAllSupporter");
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	public int selectProNo(int su_no){
		try {
			int pro_no = (int) sqlMap.queryForObject("support.selectProNo",su_no);
			return pro_no;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public boolean upProjectSupporter(int pNo) {

		return false;
	}

	public boolean upUserSupporter(int pNo) {

		return false;

	}

	public boolean upUserSupporting(String id) {

		return false;
	}
}
