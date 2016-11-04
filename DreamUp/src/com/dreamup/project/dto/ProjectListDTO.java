package com.dreamup.project.dto;

import java.sql.Date;

public class ProjectListDTO {

	private int progress; // 진행률 디비에서 계산한 xml식의 값을 그대로 할당
	private int pro_goal; // 프로젝트 목표금액
	private Date pro_end; // 프로젝트 끝날짜
	private String pro_thumbnail; // 프로젝트 썸네일이미지
	private String pro_title; // 프로젝트 제목
	private int due_date;// 잔여기간
	private int pro_no;
	private int su_count;
	
	public ProjectListDTO() {
		// TODO Auto-generated constructor stub
	}

	
	
	

	public ProjectListDTO(int progress, int pro_goal, Date pro_end, String pro_thumbnail, String pro_title,
			int due_date, int pro_no, int su_count) {
		super();
		this.progress = progress;
		this.pro_goal = pro_goal;
		this.pro_end = pro_end;
		this.pro_thumbnail = pro_thumbnail;
		this.pro_title = pro_title;
		this.due_date = due_date;
		this.pro_no = pro_no;
		this.su_count = su_count;
	}





	public int getPro_no() {
		return pro_no;
	}

	public void setPro_no(int pro_no) {
		this.pro_no = pro_no;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public int getPro_goal() {
		return pro_goal;
	}

	public void setPro_goal(int pro_goal) {
		this.pro_goal = pro_goal;
	}

	public Date getPro_end() {
		return pro_end;
	}

	public void setPro_end(Date pro_end) {
		this.pro_end = pro_end;
	}

	public String getPro_thumbnail() {
		return pro_thumbnail;
	}

	public void setPro_thumbnail(String pro_thumbnail) {
		this.pro_thumbnail = pro_thumbnail;
	}

	public String getPro_title() {
		return pro_title;
	}

	public void setPro_title(String pro_title) {
		this.pro_title = pro_title;
	}

	public int getDue_date() {
		return due_date;
	}

	public void setDue_date(int due_date) {
		this.due_date = due_date;
	}

	
	public int getSu_count() {
		return su_count;
	}

	public void setSu_count(int su_count) {
		this.su_count = su_count;
	}

	@Override
	public String toString() {
		return "ProjectListDTO [progress=" + progress + ", pro_goal=" + pro_goal + ", pro_end=" + pro_end
				+ ", pro_thumbnail=" + pro_thumbnail + ", pro_title=" + pro_title + ", due_date=" + due_date
				+ ", pro_no=" + pro_no + ", su_count=" + su_count + "]";
	}

	

	

}
