package com.dreamup.dao.member;

import java.sql.SQLException;
import java.util.List;

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
		boolean result = false;
		try {
			System.out.println("before insert to member : " + member.toString());
			sqlMap.insert("member.insert", member);

			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	// 비밀번호 암호화
	public boolean encryptionPwd(String m_password) {
		int result;
		try {
			result = (int) sqlMap.queryForObject("member.encryptionPwd", m_password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
		int result;
		try {
			result = sqlMap.update("member.resetPwd", m_no);
			if (result == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// 중복검사
	public boolean IdDuplicationCheck(String m_id) {
		int result;
		try {
			result = (int) sqlMap.queryForObject("member.IdDuplicationCheck", m_id);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// 로그인
	public boolean login(MemberDTO member) {
		int result;
		try {
			result = (int) sqlMap.queryForObject("member.login", member);
			if (result == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// 한번이라도 후원한 적이 있는 사용자가 배송주소를 당사자 주소지로 할 경우
	public boolean supportingCount(String m_id) {
		int result;
		try {
			result = (int) sqlMap.queryForObject("member.supportingCount", m_id);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// 사용자 후원정보 입력시 가입정보가 본인인경우
	public MemberDTO selectOwn(String m_id) {
		MemberDTO member;
		try {
			member = (MemberDTO) sqlMap.queryForObject("member.selectOwn", m_id);
			return member;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 마이페이지 개인 정보 수정
	public boolean updateInfo(MemberDTO member) {
		int result;
		try {
			result = sqlMap.update("member.updateInfo", member);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	// 한번도 후원한 적이 없는 사용자가 사용자 후원정보 입력시 배송주소를 당사자 주소지로 할경우
	public boolean updateSupport(String m_id) {
		int result;
		try {
			result = sqlMap.update("member.updateSupport", m_id);
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

}
