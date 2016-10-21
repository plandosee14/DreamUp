package com.dreamup.dao.member;

import java.net.StandardSocketOptions;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.batch.Main;

import com.dreamup.dto.member.MemberDTO;
import com.dreamup.ibatis.SqlMapConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class MemberDAO {
	SqlMapClient sqlMap;

	public MemberDAO() {
		sqlMap = SqlMapConfig.getSqlMapInstance();
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
		System.out.println(dao.select().toString());
	}

}
