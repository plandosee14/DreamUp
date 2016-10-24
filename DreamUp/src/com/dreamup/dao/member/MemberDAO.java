package com.dreamup.dao.member;

import java.net.StandardSocketOptions;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.jdt.internal.compiler.batch.Main;

import com.dreamup.dto.member.MemberDTO;
import com.dreamup.ibatis.SqlMapConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class MemberDAO {
	SqlMapClient sqlMap;

	public MemberDAO() {
		sqlMap = SqlMapConfig.getSqlMapInstance();
	}

	// 회원가입
	public boolean insert(MemberDTO member) {
		try {
			System.out.println("dao" + member.toString());
			sqlMap.insert("member.insert", member);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// 회원탈퇴
	public boolean delete(String m_id) {
		int result;
		try {
			result = sqlMap.delete("member.delete", m_id);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// 아이디 찾기 : m_name과 m_email 두개의 속성을 가진 memberDTO를 받음
	public String findId(MemberDTO member) {

		String m_id = null;
		try {
			m_id = (String) sqlMap.queryForObject("member.findId", member);
			return m_id;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	// 비밀번호 재설정
	public boolean resetPwd(int m_no) {
		return false;
	}
	// 로그인

	// 마이페이지 개인 정보 수정
	public boolean update(MemberDTO member) {
		int result;
		try {
			result = sqlMap.update("member.update", member);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// 사용자 후원정보 입력시 추가 되는 정보
	public boolean updateSupport(MemberDTO member) {
		int result = 0;
		try {
			result = sqlMap.update("member.updateSupport", member);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	// project테이블/support테이블에 속하는 멤버 컬럼의 값을 가져오기 위함
	// 사용자 세션 부여시
	public MemberDTO selectMember(int i) {
		MemberDTO member;

		try {
			member = (MemberDTO) sqlMap.queryForObject("member.selectMember", i);
			return member;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 전체 유저 정보 조회
	public List<MemberDTO> listMember() {
		List<MemberDTO> memberList;
		try {
			memberList = sqlMap.queryForList("member.listMember");
			return memberList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean LoginCheck(String id, String pass) {
		return false;
	}
}
