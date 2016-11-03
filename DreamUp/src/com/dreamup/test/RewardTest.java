package com.dreamup.test;

import com.dreamup.reward.dao.RewardDAO;
import com.dreamup.reward.dto.RewardDTO;

public class RewardTest {
	
	public static void main(String[] args) {
		
		RewardDAO dao = new RewardDAO();
		RewardDTO reward = new RewardDTO();
		
//		reward.setPro_no(15);
//		reward.setRe_money(20000);
//		reward.setRe_title("나는 제목이다");
//		reward.setRe_item("아이템1");
//		reward.setRe_delivery("2016/10/30");
//		reward.setRe_limite(0);
//		
//		System.out.println(dao.insertReward(reward));
		
//		System.out.println(dao.deleteReward(2));
		
//		System.out.println(dao.selectReward(4));
		
//		reward.setRe_no(3);
//		reward.setRe_title("바뀌라");
//		reward.setRe_item("아이템");
//		reward.setRe_money(5555);
//		reward.setRe_delivery("2016/11/11");
//		
//		System.out.println(dao.updateReward(reward));
		
		System.out.println(dao.selectProReward(36));
		
		
		
	}

}
