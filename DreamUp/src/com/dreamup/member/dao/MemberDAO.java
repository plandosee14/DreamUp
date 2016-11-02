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
   //ȸ������ok
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
   
   
   // ��й�ȣ ��ȣȭ
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
      // ȸ��Ż�� : �ٿ�ok
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
      // ���̵� ã��  ok
      public String findId(MemberDTO member) {

         String m_id = null;
         try {
            m_id = (String) sqlMap.queryForObject("member.findId", member);
            if(m_id != null){
               return m_id;
            }else{
               System.out.println("�̸�, ���� �Է°��� Ȯ���ϼ���");
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }

         return null;
      }
      // ��й�ȣ �缳�� : �ٿ�ok
      public boolean resetPwd(MemberDTO member) {
         int result;
         try {
            result = sqlMap.update("member.resetPwd", member);
            if (result == 1) {
               return true;
            }else{
               System.out.println("�̸�, ����, ���̵� �Է°��� Ȯ���ϼ���");
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         return false;
      }
      // �ߺ��˻� ok
   public boolean IdDuplicationCheck(String m_id){
      try {
         int result;
         result = (int) sqlMap.queryForObject("member.IdDuplicationCheck",m_id);
         if(result == 0){
            System.out.println("��밡���� ���̵� �Դϴ�.");
         return true;
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return false;
   }
   // �α��� ok
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
   // �ѹ��� �Ŀ��� ���� ���� ����ڰ� ����� �Ŀ����� �Է½� ����ּҸ� ����� �ּ����� �Ұ��
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
   // ����� �Ŀ����� �Է½� ���������� �����ΰ��
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
   // ���������� ���� ���� ���� ok
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
   //�ѹ��� �Ŀ��� ���� ���� ����ڰ� ����� �Ŀ����� �Է½� ����ּҸ� ����� �ּ����� �Ұ�� ok
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
   // project���̺�/support���̺� ���ϴ� ��� �÷��� ���� �������� ����
      // ����� ���� �ο���
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
   // ��ü ���� ���� ��ȸ ok
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
   //���� �Ŀ��ϴ� ������Ʈ ī��Ʈ 
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