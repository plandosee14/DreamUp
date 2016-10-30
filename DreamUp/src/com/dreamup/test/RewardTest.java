package com.dreamup.test;

import com.dreamup.reward.dao.RewardDAO;
import com.dreamup.reward.dto.RewardDTO;

public class RewardTest {
	
	public static void main(String[] args) {
		
		RewardDAO dao = new RewardDAO();
		RewardDTO reward = new RewardDTO();
		
		reward.setPro_no(15);
		reward.setRe_money(20000);
		reward.setRe_title("나는 제목이다");
		reward.setRe_item("아이템1");
		reward.setRe_delivery("2016/10/30");
		reward.setRe_limite(0);
		
		System.out.println(dao.insertReward(reward));
		
		
		
	}

}
