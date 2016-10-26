package com.dreamup.reply.dto;

import java.sql.Date;

public class ReplyDTO {
	private int rp_no;
	private int pro_no;
	private String m_id;
	private String rp_content;
	private Date rp_time;
	private int thumbsUp;
	
	public ReplyDTO() {
		// TODO Auto-generated constructor stub
	}

	public ReplyDTO(int rp_no, int pro_no, String m_id, String rp_content, Date rp_time, int thumbsUp) {
		super();
		this.rp_no = rp_no;
		this.pro_no = pro_no;
		this.m_id = m_id;
		this.rp_content = rp_content;
		this.rp_time = rp_time;
		this.thumbsUp = thumbsUp;
	}

	public int getRp_no() {
		return rp_no;
	}

	public void setRp_no(int rp_no) {
		this.rp_no = rp_no;
	}

	public int getPro_no() {
		return pro_no;
	}

	public void setPro_no(int pro_no) {
		this.pro_no = pro_no;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getRp_content() {
		return rp_content;
	}

	public void setRp_content(String rp_content) {
		this.rp_content = rp_content;
	}

	public Date getRp_time() {
		return rp_time;
	}

	public void setRp_time(Date rp_time) {
		this.rp_time = rp_time;
	}

	public int getThumbsUp() {
		return thumbsUp;
	}

	public void setThumbsUp(int thumbsUp) {
		this.thumbsUp = thumbsUp;
	}

	@Override
	public String toString() {
		return "ReplyDTO [rp_no=" + rp_no + ", pro_no=" + pro_no + ", m_id=" + m_id + ", rp_content=" + rp_content
				+ ", rp_time=" + rp_time + ", thumbsUp=" + thumbsUp + "]";
	}
	
	

}
