package com.dreamup.reward.dao;

import java.sql.SQLException;
import java.util.List;


import com.dreamup.ibatis.SqlMapConfig;
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
			 System.out.println("DAO : 리워드 입력 성공");
			 return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	//리워드 하나 선택
	public boolean selectReward(int reNo) {
		return false;
	}
	
	//한 프로젝트에서 제공하는 리워드 리스트(where절 프로젝트 번호일치시)
	public List<RewardDTO> selectProReward() {
		return null;
	}

	public boolean updateReward(RewardDTO reward) {
		return false;
	}
	
	public boolean deleteReward(int rtNo) {
		return false;
	}
}
