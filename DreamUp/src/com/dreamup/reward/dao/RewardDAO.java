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
	
	public boolean insertTempReward(RewardDTO reward) {
		return false;
	}

	public boolean updateTempReward(RewardDTO reward) {
		return false;
	}

	public boolean deleteTempReward(int rtNo) {
		return false;
	}

	public RewardDTO selectTempReward(int rtNo) {
		return null;
	}

	public List<RewardDTO> selectAllTempReward(int pno) {
		return null;
	}

	public boolean insertReward(RewardDTO reward) {
		List<RewardDTO> rewardList;
		
		try {
			rewardList = (List<RewardDTO>) sqlMap.insert("reward.insertReward");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public List<RewardDTO> selectAllReward() {
		return null;
	}

	public boolean selectReward(int reNo) {
		return false;
	}
}
