package com.dreamup.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dreamup.dao.member.MemberDAO;
import com.dreamup.dto.member.MemberDTO;

public class memberTEST {

	public static void main(String[] args) {
		MemberDTO member = new MemberDTO();
		MemberDAO dao = new MemberDAO();
		System.out.println(dao.selectMember(18).toString());
/*		
		member.setM_no(0);
		member.setM_id("test1");
		member.setM_password("1234");
		member.setM_email("kancho33@navewr.com");
		member.setM_name("최용석");
		member.setM_date(null);

	

		if (dao.insert(member)) {
			System.out.println("main"+member.toString());
		} else {
			System.out.println("Action 입력 실패");
		}*/
	}
}
