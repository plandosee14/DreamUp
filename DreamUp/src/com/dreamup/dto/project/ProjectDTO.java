package com.dreamup.dto.project;

import java.util.Date;

public class ProjectDTO {
	
	private int Pro_No; 		
	private String M_Id;		
	private String Pro_Title;		
	private String Pro_Content;			
	private Date Pro_Start;		
	private Date Pro_End;			
	private int Pro_Goal;		
	private String Pro_Catagory;		
	private String Pro_Video;		
	private String Pro_ImageUrl;		
	private String Pro_Thumbnail;		
	private int Pro_Account;		
	private int Su_Count;		
	private int Pro_state;		
	private String NowAmount;
	
	public ProjectDTO() {
		
	}

	public ProjectDTO(int pro_No, String m_Id, String pro_Title, String pro_Content, Date pro_Start, Date pro_End,
			int pro_Goal, String pro_Catagory, String pro_Video, String pro_ImageUrl, String pro_Thumbnail,
			int pro_Account, int su_Count, int pro_state, String nowAmount) {
		super();
		Pro_No = pro_No;
		M_Id = m_Id;
		Pro_Title = pro_Title;
		Pro_Content = pro_Content;
		Pro_Start = pro_Start;
		Pro_End = pro_End;
		Pro_Goal = pro_Goal;
		Pro_Catagory = pro_Catagory;
		Pro_Video = pro_Video;
		Pro_ImageUrl = pro_ImageUrl;
		Pro_Thumbnail = pro_Thumbnail;
		Pro_Account = pro_Account;
		Su_Count = su_Count;
		Pro_state = pro_state;
		NowAmount = nowAmount;
	}

	public int getPro_No() {
		return Pro_No;
	}

	public void setPro_No(int pro_No) {
		Pro_No = pro_No;
	}

	public String getM_Id() {
		return M_Id;
	}

	public void setM_Id(String m_Id) {
		M_Id = m_Id;
	}

	public String getPro_Title() {
		return Pro_Title;
	}

	public void setPro_Title(String pro_Title) {
		Pro_Title = pro_Title;
	}

	public String getPro_Content() {
		return Pro_Content;
	}

	public void setPro_Content(String pro_Content) {
		Pro_Content = pro_Content;
	}

	public Date getPro_Start() {
		return Pro_Start;
	}

	public void setPro_Start(Date pro_Start) {
		Pro_Start = pro_Start;
	}

	public Date getPro_End() {
		return Pro_End;
	}

	public void setPro_End(Date pro_End) {
		Pro_End = pro_End;
	}

	public int getPro_Goal() {
		return Pro_Goal;
	}

	public void setPro_Goal(int pro_Goal) {
		Pro_Goal = pro_Goal;
	}

	public String getPro_Catagory() {
		return Pro_Catagory;
	}

	public void setPro_Catagory(String pro_Catagory) {
		Pro_Catagory = pro_Catagory;
	}

	public String getPro_Video() {
		return Pro_Video;
	}

	public void setPro_Video(String pro_Video) {
		Pro_Video = pro_Video;
	}

	public String getPro_ImageUrl() {
		return Pro_ImageUrl;
	}

	public void setPro_ImageUrl(String pro_ImageUrl) {
		Pro_ImageUrl = pro_ImageUrl;
	}

	public String getPro_Thumbnail() {
		return Pro_Thumbnail;
	}

	public void setPro_Thumbnail(String pro_Thumbnail) {
		Pro_Thumbnail = pro_Thumbnail;
	}

	public int getPro_Account() {
		return Pro_Account;
	}

	public void setPro_Account(int pro_Account) {
		Pro_Account = pro_Account;
	}

	public int getSu_Count() {
		return Su_Count;
	}

	public void setSu_Count(int su_Count) {
		Su_Count = su_Count;
	}

	public int getPro_state() {
		return Pro_state;
	}

	public void setPro_state(int pro_state) {
		Pro_state = pro_state;
	}

	public String getNowAmount() {
		return NowAmount;
	}

	public void setNowAmount(String nowAmount) {
		NowAmount = nowAmount;
	}
	
	

}
