package com.dreamup.project.dto;

import java.sql.Date;

public class ProjectListDTO {

	private int progress; // ����� ��񿡼� ����� xml���� ���� �״�� �Ҵ�
	private int pro_goal; // ������Ʈ ��ǥ�ݾ�
	private Date pro_end; // ������Ʈ ����¥
	private String pro_thumbnail; // ������Ʈ ������̹���
	private String pro_title; // ������Ʈ ����
	private int due_date;// �ܿ��Ⱓ

	public ProjectListDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProjectListDTO(int progress, int pro_goal, Date pro_end, String pro_thumbnail, String pro_title,
			int due_date) {
		super();
		this.progress = progress;
		this.pro_goal = pro_goal;
		this.pro_end = pro_end;
		this.pro_thumbnail = pro_thumbnail;
		this.pro_title = pro_title;
		this.due_date = due_date;
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

	@Override
	public String toString() {
		return "ProjectListDTO [progress=" + progress + ", pro_goal=" + pro_goal + ", pro_end=" + pro_end
				+ ", pro_thumbnail=" + pro_thumbnail + ", pro_title=" + pro_title + ", due_date=" + due_date + "]";
	}

}