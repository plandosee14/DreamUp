package com.dreamup.support.dao;

import java.util.List;

import com.dreamup.ibatis.SqlMapConfig;
import com.dreamup.support.dto.SupportDTO;
import com.ibatis.sqlmap.client.SqlMapClient;


public class SupportDAO {
	SqlMapClient sqlMap;
	
	public SupportDAO() {
	  sqlMap = SqlMapConfig.getSqlMapInstance();	
	}
	
	//후원정보 입력
	public boolean insertSupport(SupportDTO support){
		
		return false;
	}

	public boolean updateSupport(SupportDTO support){
		
		return false;
	}
	
	public boolean deleteSupport(int suNO){
		
		return false;
	}
	
	public List<SupportDTO> selectSupporter(int pNO){
		
		return null;
	}
	
	public List<SupportDTO> selectAllSupporter(){
		
		return null;
	}
	
	public boolean upProjectSupporter(int pNo){
		
		return false;
	}
	
	public boolean upUserSupporter(int pNo){
		
		return false;
	}
	
	public boolean upUserSupporting(String id){
		
		return false;
	}
}
