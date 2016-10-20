package com.dreamup.dto.cart.reply;

import java.util.Date;

public class ReplyDTO {
	
	private int rp_No;		
	private int rro_No;
	private String m_id;
	private String rp_Content;
	private Date rp_Time;
	private int thumbsUp;
	
	public ReplyDTO() {
		
	}

	public ReplyDTO(int rp_No, int rro_No, String m_id, String rp_Content, Date rp_Time, int thumbsUp) {
		super();
		this.rp_No = rp_No;
		this.rro_No = rro_No;
		this.m_id = m_id;
		this.rp_Content = rp_Content;
		this.rp_Time = rp_Time;
		this.thumbsUp = thumbsUp;
	}

	public int getRp_No() {
		return rp_No;
	}

	public void setRp_No(int rp_No) {
		this.rp_No = rp_No;
	}

	public int getRro_No() {
		return rro_No;
	}

	public void setRro_No(int rro_No) {
		this.rro_No = rro_No;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getRp_Content() {
		return rp_Content;
	}

	public void setRp_Content(String rp_Content) {
		this.rp_Content = rp_Content;
	}

	public Date getRp_Time() {
		return rp_Time;
	}

	public void setRp_Time(Date rp_Time) {
		this.rp_Time = rp_Time;
	}

	public int getThumbsUp() {
		return thumbsUp;
	}

	public void setThumbsUp(int thumbsUp) {
		this.thumbsUp = thumbsUp;
	}
	
	

}
