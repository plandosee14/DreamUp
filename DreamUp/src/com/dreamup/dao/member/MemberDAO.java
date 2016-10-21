package com.dreamup.dao.member;

import org.eclipse.jdt.internal.compiler.batch.Main;

import com.dreamup.ibatis.SqlMapConfig;
import com.ibatis.sqlmap.client.SqlMapClient;

public class MemberDAO {
	SqlMapClient sqlMap;

	public MemberDAO() {
		sqlMap = SqlMapConfig.getSqlMapInstance();
	}
	
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		System.out.println("dao xml test");
	}
	

}
