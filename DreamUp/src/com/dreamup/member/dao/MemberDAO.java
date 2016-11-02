package com.dreamup.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.dreamup.ibatis.SqlMapConfig;
import com.dreamup.member.dto.MemberDTO;
import com.ibatis.sqlmap.client.SqlMapClient;

public class MemberDAO {
   SqlMapClient sqlMap;

   public MemberDAO() {
      sqlMap = SqlMapConfig.getSqlMapInstance();
   }
   //회원가입ok
   public boolean insert(MemberDTO member) {
     
      try {
    	  System.out.println("before insert to member : " + member.toString());
         sqlMap.insert("member.insert", member);

         return true;
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return false;
   }
   
   
   // 비밀번호 암호화
	public boolean encrytionPwd(String bcryptPwd) {
		int result;
		try {
			result = sqlMap.update("member.encrytionPwd", bcryptPwd);
			if (result == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	
	public String getPwd(String m_id) {
		try {
			String dbPwd = (String) sqlMap.queryForObject("member.getPwd", m_id);
			return dbPwd;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
      // 회원탈퇴 : 다운ok
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
      // 아이디 찾기  ok
      public String findId(MemberDTO member) {

         String m_id = null;
         try {
            m_id = (String) sqlMap.queryForObject("member.findId", member);
            if(m_id != null){
               return m_id;
            }else{
               System.out.println("이름, 메일 입력값을 확인하세요");
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }

         return null;
      }
      // 비밀번호 재설정 : 다운ok
      public boolean resetPwd(MemberDTO member) {
         int result;
         try {
            result = sqlMap.update("member.resetPwd", member);
            if (result == 1) {
               return true;
            }else{
               System.out.println("이름, 메일, 아이디 입력값을 확인하세요");
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         return false;
      }
      // 중복검사 ok
   public boolean IdDuplicationCheck(String m_id){
      try {
         int result;
         result = (int) sqlMap.queryForObject("member.IdDuplicationCheck",m_id);
         if(result == 0){
            System.out.println("사용가능한 아이디 입니다.");
         return true;
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return false;
   }
   // 로그인 ok
   public boolean login(MemberDTO member){
	    int result;
      try {
         result = (int) sqlMap.queryForObject("member.login",member);
         System.out.println(result);
         if (result==1){
        	 return true;
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return false;
   }
   // 한번도 후원한 적이 없는 사용자가 사용자 후원정보 입력시 배송주소를 당사자 주소지로 할경우
   public boolean supportingCount(String m_id){
      try {
         int result;
         result = (int) sqlMap.queryForObject("member.supportingCount",m_id);
         if(result==0){
            
            return true;
         }
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return false;
   }
   // 사용자 후원정보 입력시 가입정보가 본인인경우
   public MemberDTO selectOwn(String m_id){
      try {
         MemberDTO result;
         result = (MemberDTO) sqlMap.queryForObject("member.selectOwn",m_id);
         return result;
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return null;
   }
   // 마이페이지 개인 정보 수정 ok
   public boolean updateInfo(MemberDTO member){
      try {
         int result;
         result = sqlMap.update("member.updateInfo",member);
         if(result == 1){
         return true;
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return false;
   }
   //한번도 후원한 적이 없는 사용자가 사용자 후원정보 입력시 배송주소를 당사자 주소지로 할경우 ok
   public boolean updateSupport(MemberDTO member){
      try {
         int result;
         result = sqlMap.update("member.updateSupport",member);
         if(result == 1){
         return true;
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return false;
   }
   // project테이블/support테이블에 속하는 멤버 컬럼의 값을 가져오기 위함
      // 사용자 세션 부여시
/*   public MemberDTO selectMember(int m_no){
	   try {
		   MemberDTO result;
		   result = (MemberDTO) sqlMap.queryForObject("member.selectMember",m_no);
		   return result;
	   } catch (SQLException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
	   }
	   return null;
   }*/
   
   public MemberDTO selectMember(String m_id){
	   try {
		   MemberDTO result;
		   result = (MemberDTO) sqlMap.queryForObject("member.selectMember",m_id);
		   return result;
	   } catch (SQLException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
	   }
	   return null;
   }
   // 전체 유저 정보 조회 ok
   public List<MemberDTO> listMember(MemberDTO member){
      try {
         List list;
         list = sqlMap.queryForList("member.listMember",member);
         return list;
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return null;
   }
   //내가 후원하는 프로젝트 카운트 
   public boolean addSupportingCount(String m_id){
      int result;
      try {
         result = sqlMap.update("member.addSupportingCount", m_id);
         if(result == 1){
         return true;
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block.9
         e.printStackTrace();
      }
      return false;
   }
   
   public boolean updateSupportedCount(MemberDTO member){
      int result;
      try {
         result = sqlMap.update("member.updateSupportedCount", member);
         return true;
      } catch (SQLException e) {
         // TODO Auto-generated catch block.9
         e.printStackTrace();
      }
      return false;
   }

}