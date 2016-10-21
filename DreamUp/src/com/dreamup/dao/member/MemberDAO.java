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

	public boolean insert(MemberDTO member) {

		try {
			sqlMap.insert("member.insert", member);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean delete(String id) {
		return false;
	}

	public boolean update(MemberDTO member) {
		return false;
	}

	public MemberDTO selectMember(String id) {
		return null;
	}

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

	public String findId(String name, String email) {
		return null;
	}

	public MemberDTO select() {
		MemberDTO member;
		try {
			member = (MemberDTO) sqlMap.queryForObject("member.select");
			return member;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> memberList = dao.listMember();
		MemberDTO member;
		for (int i = 0; i < memberList.size(); i++) {
			member = memberList.get(i);
			System.out.println(member);
		}
		System.out.println("³¡");
	}

}
