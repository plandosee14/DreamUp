package com.dreamup.test;

import java.util.List;

import com.dreamup.reward.dao.RewardDAO;
import com.dreamup.reward.dto.RewardDTO;

public class RewardListTest {
	
	public static void main(String[] args) {
		RewardDAO rdao = new RewardDAO();
		RewardDTO reward = new RewardDTO();
		List<RewardDTO> rewardList;
		rewardList = rdao.selectProReward(26);
		System.out.println(rewardList.toString());
	}

}
