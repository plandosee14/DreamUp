package com.dreamup.dto.project;

import java.util.Date;

public class ProjectDTO {
	
	private int pro_No; 		
	private String m_Id;		
	private String pro_Title;		
	private String pro_Content;			
	private Date pro_Start;		
	private Date pro_End;			
	private int pro_Goal;		
	private String pro_Catagory;		
	private String pro_Video;		
	private String pro_ImageUrl;		
	private String pro_Thumbnail;		
	private int pro_Account;		
	private int su_Count;		
	private int pro_state;		
	private String nowAmount;
	
	public ProjectDTO() {
		
	}

	public ProjectDTO(int pro_No, String m_Id, String pro_Title, String pro_Content, Date pro_Start, Date pro_End,
			int pro_Goal, String pro_Catagory, String pro_Video, String pro_ImageUrl, String pro_Thumbnail,
			int pro_Account, int su_Count, int pro_state, String nowAmount) {
		super();
		this.pro_No = pro_No;
		this.m_Id = m_Id;
		this.pro_Title = pro_Title;
		this.pro_Content = pro_Content;
		this.pro_Start = pro_Start;
		this.pro_End = pro_End;
		this.pro_Goal = pro_Goal;
		this.pro_Catagory = pro_Catagory;
		this.pro_Video = pro_Video;
		this.pro_ImageUrl = pro_ImageUrl;
		this.pro_Thumbnail = pro_Thumbnail;
		this.pro_Account = pro_Account;
		this.su_Count = su_Count;
		this.pro_state = pro_state;
		this.nowAmount = nowAmount;
	}

	public int getPro_No() {
		return pro_No;
	}

	public void setPro_No(int pro_No) {
		this.pro_No = pro_No;
	}

	public String getM_Id() {
		return m_Id;
	}

	public void setM_Id(String m_Id) {
		this.m_Id = m_Id;
	}

	public String getPro_Title() {
		return pro_Title;
	}

	public void setPro_Title(String pro_Title) {
		this.pro_Title = pro_Title;
	}

	public String getPro_Content() {
		return pro_Content;
	}

	public void setPro_Content(String pro_Content) {
		this.pro_Content = pro_Content;
	}

	public Date getPro_Start() {
		return pro_Start;
	}

	public void setPro_Start(Date pro_Start) {
		this.pro_Start = pro_Start;
	}

	public Date getPro_End() {
		return pro_End;
	}

	public void setPro_End(Date pro_End) {
		this.pro_End = pro_End;
	}

	public int getPro_Goal() {
		return pro_Goal;
	}

	public void setPro_Goal(int pro_Goal) {
		this.pro_Goal = pro_Goal;
	}

	public String getPro_Catagory() {
		return pro_Catagory;
	}

	public void setPro_Catagory(String pro_Catagory) {
		this.pro_Catagory = pro_Catagory;
	}

	public String getPro_Video() {
		return pro_Video;
	}

	public void setPro_Video(String pro_Video) {
		this.pro_Video = pro_Video;
	}

	public String getPro_ImageUrl() {
		return pro_ImageUrl;
	}

	public void setPro_ImageUrl(String pro_ImageUrl) {
		this.pro_ImageUrl = pro_ImageUrl;
	}

	public String getPro_Thumbnail() {
		return pro_Thumbnail;
	}

	public void setPro_Thumbnail(String pro_Thumbnail) {
		this.pro_Thumbnail = pro_Thumbnail;
	}

	public int getPro_Account() {
		return pro_Account;
	}

	public void setPro_Account(int pro_Account) {
		this.pro_Account = pro_Account;
	}

	public int getSu_Count() {
		return su_Count;
	}

	public void setSu_Count(int su_Count) {
		this.su_Count = su_Count;
	}

	public int getPro_state() {
		return pro_state;
	}

	public void setPro_state(int pro_state) {
		this.pro_state = pro_state;
	}

	public String getNowAmount() {
		return nowAmount;
	}

	public void setNowAmount(String nowAmount) {
		this.nowAmount = nowAmount;
	}

	
	

}
