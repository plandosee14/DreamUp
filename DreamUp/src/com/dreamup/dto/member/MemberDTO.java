package com.dreamup.dto.member;

import java.util.Date;

public class MemberDTO {

	private int m_no;
	private String m_id;
	private String m_password;
	private String m_email;
	private String m_name;
	private Date m_date;
	//회원가입시 필요 컬럼
	
	private String m_phone;
	private String m_address;
	private String m_post;
	//후원을 한번도 하지 않은 등록자의 프로필 등록시 필요한 컬럼
	

	private String m_supportingCount;
	//내가 후원하는 프로젝트 수
	private String m_supportedCount;
	//내가 후원받는 프로젝트 수
	
	private String m_account;
	private String m_bankName;

	
}
