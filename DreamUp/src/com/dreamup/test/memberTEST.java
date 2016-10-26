package com.dreamup.test;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dreamup.member.dao.MemberDAO;
import com.dreamup.member.dto.MemberDTO;
import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

import sun.print.resources.serviceui;

public class memberTEST {

	public static void main(String[] args) {

		// MemberDAO dao = new MemberDAO();
		//
		// member.setM_id("11");
		// member.setM_password("11");

		// System.out.println(dao.login(member));
		// System.out.println(dao.selectMember(40));
		// System.out.println(dao.selectMember(18).toString());

		// member.setM_id("test1");
		// member.setM_password("1234");
		// member.setM_email("kancho33@naver.com");
		// member.setM_name("최용석");

		// member.setM_id("test2");
		// member.setM_password("1234");
		// member.setM_email("hololoo@naver.com");
		// member.setM_name("기호창");
		//
		// member.setM_id("test3");
		// member.setM_password("1234");
		// member.setM_email("4eyes@naver.com");
		// member.setM_name("이하은");
		//
		// member.setM_id("test4");
		// member.setM_password("1234");
		// member.setM_email("frendly@naver.com");
		// member.setM_name("정다운");
		// MemberDTO member = new MemberDTO();
		// member.setM_id("test5");
		// member.setM_password("1234");
		// member.setM_email("what?@naver.com");
		// member.setM_name("전성원");

		// member.setM_date(null);

		// boolean t= dao.insert(member);

		//
		// if (t) {
		// System.out.println("after insert to member : "+member.toString());
		// } else {
		// System.out.println("Action 입력 실패");
		// // }
		// System.out.println(dao.selectMember(46).toString());

		// MemberDAO member = new MemberDAO();
		// member.listMember();
		// MemberDAO라는 클래스를 member라는 참조변수 명으로 객체 생성
		// member라는 참조변수 명으로 MemberDAO라는 클래스 내에 있는 listMember()메소드를 호출

		// MemberDAO dao = new MemberDAO();
		// 1.객체생성

		// dao.listMember();
		// 2.생성된 객체의 메소드 호출

		// 2-1.호출된 메소드의 종류를 확인

		// 2-1-1.파라미터x/ 리턴형o
		// 2-1-2.호출하는 메소드의 리턴형을 확인
		// 2-1-3.호출하는 메소드의 리턴값을 바구니를 생성
		// List<MemberDTO> list = new ArrayList<>();
		// 2-1-4.생성된 바구니에 메소드의 리턴값을 할당
		// 3.메소드의 리턴값을 출력

		MemberDAO dao = new MemberDAO();
		// 클래스다오 객체 생성
		MemberDTO dto = new MemberDTO();
		
		dto.setM_id("test1");
		dto.setM_name("최용대맹이");
		dto.setM_password("1234");
		dto.setM_email("kancho33@naver.com");
		dto.setM_phone(null);
		dto.setM_address(null);
		dto.setM_post(null);
		dto.setM_bankName(null);
		dto.setM_account(null);
		dao.updateInfo(dto);
		System.out.println(dao.selectMember(40));
		
//		dto.setM_id("test1");
//		dto.setM_password("1234");
//		System.out.println(dao.login(dto));
		
		//dao.IdDuplicationCheck("test1");
		
		
//		dto.setM_name("최용석");
//		dto.setM_email("kancho33@naver.com");
//		System.out.println(dao.findId(dto));

		
//		dao.delete("11");

		
//		dto.setM_id("test1");
//		dto.setM_email("kancho33@naver.com");
//		dto.setM_name("최용석");
//		dto.setM_password("1234");
//		dao.resetPwd(dto);
//		System.out.println(dao.selectMember(40));

		// System.out.println(dao.selectMember(46).toString());

//		List<MemberDTO> memberList;
//		// listMember리턴형 바구니 만들기
//
//		memberList = dao.listMember();
//		// 메소드 호출한 결과를 생성한 바구니에 넣기
//
//		for (int i = 0; i < memberList.size(); i++) {
//
//			MemberDTO member;
//			member = memberList.get(i);
//
//			System.out.println(member);
//		}

	}
}
