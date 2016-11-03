package com.dreamup.reward.dao;

import java.sql.SQLException;
import java.util.List;


import com.dreamup.ibatis.SqlMapConfig;
import com.dreamup.project.dto.ProjectDTO;
import com.dreamup.reward.dto.RewardDTO;
import com.ibatis.sqlmap.client.SqlMapClient;

public class RewardDAO {
	SqlMapClient sqlMap;
	
	public RewardDAO() {
		sqlMap = SqlMapConfig.getSqlMapInstance();
	}
	
	public boolean insertReward(RewardDTO reward) {
		
		try {
			 sqlMap.insert("reward.insertReward",reward);
			 System.out.println("DAO : ������ �Է� ����");
			 return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
//	//������ �ϳ� ����
//	public ProjectDTO selectReward(int re_no) {
//		ProjectDTO result;
//		try {
//			result = (ProjectDTO) sqlMap.queryForObject("project.selectReward", re_no);
//			return result;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
//	//�� ������Ʈ���� �����ϴ� ������ ����Ʈ(where�� ������Ʈ ��ȣ��ġ��)
//	public List<RewardDTO> selectProReward(int pro_no) {
//		List<RewardDTO> rewardlist=null;
//		try {
//			rewardlist=sqlMap.queryForList("reward.selectProReward", pro_no);
//			return rewardlist;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	public boolean updateReward(RewardDTO reward) { //�����������Ʈ
//		int result;
//		try {
//			result=sqlMap.update("reward.updateReward", reward);
//			if(result==1){
//				return true;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
//	}
//	
//	public boolean deleteReward(int re_no) {//���������
//		try {
//			sqlMap.delete("reward.deleteReward", re_no);
//			return true;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
//	}
}
