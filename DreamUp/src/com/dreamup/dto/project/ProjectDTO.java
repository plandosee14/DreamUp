package com.dreamup.dto.project;

import java.util.Date;

public class ProjectDTO {

	private int pro_no;
	private String m_id;
	private String pro_thumbnail;
	private String pro_title;
	private String pro_catagory;
	private Date pro_start;
	private Date pro_end;
	private int pro_goal;

	private String pro_video;
	private String pro_content;
	private String pro_link;
	private String Pro_Image;

	private String Pro_fileImage;
	private String Pro_fileIntro;
	private String Pro_fileSns;

	private String Pro_Bank;
	private int pro_account;

	private int su_count;
	private int pro_state;

	private String now_amount;

	public ProjectDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProjectDTO(int pro_no, String m_id, String pro_thumbnail, String pro_title, String pro_catagory,
			Date pro_start, Date pro_end, int pro_goal, String pro_video, String pro_content, String pro_link,
			String pro_Image, String pro_fileImage, String pro_fileIntro, String pro_fileSns, String pro_Bank,
			int pro_account, int su_count, int pro_state, String now_amount) {
		super();
		this.pro_no = pro_no;
		this.m_id = m_id;
		this.pro_thumbnail = pro_thumbnail;
		this.pro_title = pro_title;
		this.pro_catagory = pro_catagory;
		this.pro_start = pro_start;
		this.pro_end = pro_end;
		this.pro_goal = pro_goal;
		this.pro_video = pro_video;
		this.pro_content = pro_content;
		this.pro_link = pro_link;
		Pro_Image = pro_Image;
		Pro_fileImage = pro_fileImage;
		Pro_fileIntro = pro_fileIntro;
		Pro_fileSns = pro_fileSns;
		Pro_Bank = pro_Bank;
		this.pro_account = pro_account;
		this.su_count = su_count;
		this.pro_state = pro_state;
		this.now_amount = now_amount;
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

	public String getPro_catagory() {
		return pro_catagory;
	}

	public void setPro_catagory(String pro_catagory) {
		this.pro_catagory = pro_catagory;
	}

	public Date getPro_start() {
		return pro_start;
	}

	public void setPro_start(Date pro_start) {
		this.pro_start = pro_start;
	}

	public Date getPro_end() {
		return pro_end;
	}

	public void setPro_end(Date pro_end) {
		this.pro_end = pro_end;
	}

	public int getPro_goal() {
		return pro_goal;
	}

	public void setPro_goal(int pro_goal) {
		this.pro_goal = pro_goal;
	}

	public String getPro_video() {
		return pro_video;
	}

	public void setPro_video(String pro_video) {
		this.pro_video = pro_video;
	}

	public String getPro_content() {
		return pro_content;
	}

	public void setPro_content(String pro_content) {
		this.pro_content = pro_content;
	}

	public String getPro_link() {
		return pro_link;
	}

	public void setPro_link(String pro_link) {
		this.pro_link = pro_link;
	}

	public String getPro_Image() {
		return Pro_Image;
	}

	public void setPro_Image(String pro_Image) {
		Pro_Image = pro_Image;
	}

	public String getPro_fileImage() {
		return Pro_fileImage;
	}

	public void setPro_fileImage(String pro_fileImage) {
		Pro_fileImage = pro_fileImage;
	}

	public String getPro_fileIntro() {
		return Pro_fileIntro;
	}

	public void setPro_fileIntro(String pro_fileIntro) {
		Pro_fileIntro = pro_fileIntro;
	}

	public String getPro_fileSns() {
		return Pro_fileSns;
	}

	public void setPro_fileSns(String pro_fileSns) {
		Pro_fileSns = pro_fileSns;
	}

	public String getPro_Bank() {
		return Pro_Bank;
	}

	public void setPro_Bank(String pro_Bank) {
		Pro_Bank = pro_Bank;
	}

	public int getPro_account() {
		return pro_account;
	}

	public void setPro_account(int pro_account) {
		this.pro_account = pro_account;
	}

	public int getSu_count() {
		return su_count;
	}

	public void setSu_count(int su_count) {
		this.su_count = su_count;
	}

	public int getPro_state() {
		return pro_state;
	}

	public void setPro_state(int pro_state) {
		this.pro_state = pro_state;
	}

	public String getNow_amount() {
		return now_amount;
	}

	public void setNow_amount(String now_amount) {
		this.now_amount = now_amount;
	}

	@Override
	public String toString() {
		return "ProjectDTO [pro_no=" + pro_no + ", m_id=" + m_id + ", pro_thumbnail=" + pro_thumbnail + ", pro_title="
				+ pro_title + ", pro_catagory=" + pro_catagory + ", pro_start=" + pro_start + ", pro_end=" + pro_end
				+ ", pro_goal=" + pro_goal + ", pro_video=" + pro_video + ", pro_content=" + pro_content + ", pro_link="
				+ pro_link + ", Pro_Image=" + Pro_Image + ", Pro_fileImage=" + Pro_fileImage + ", Pro_fileIntro="
				+ Pro_fileIntro + ", Pro_fileSns=" + Pro_fileSns + ", Pro_Bank=" + Pro_Bank + ", pro_account="
				+ pro_account + ", su_count=" + su_count + ", pro_state=" + pro_state + ", now_amount=" + now_amount
				+ "]";
	}

}
