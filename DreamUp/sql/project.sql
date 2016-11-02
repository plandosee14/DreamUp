drop table project;
create table project(
	Pro_No			integer		primary key,		
	M_Id			varchar2(20) 	not null references member(M_id),
	Pro_Thumbnail	varchar2(2000)	not null, -- 썸네일 이미지 url
	Pro_Title		varchar2(300)	not null, -- 프로젝트 타이틀
	Pro_Catagory	varchar2(50)	not null, -- 프로젝트 카테고리
	Pro_Start		date			not null, -- 프로젝트 시작일(sysdate)
	Pro_End			date			not null, -- 프로젝트 끝일(sysdate+a)
	Pro_Goal		integer			not null, -- 프로젝트 목표금액
	Pro_state		integer 	default '0',
	--Pro_state
	--0 : 현재 등록중
	--1 : 등록 완료 & 후원 진행중
	--2 : 후원 기간 마감		
	--프로젝트 기본 정보 입력시 필요 컬럼
	
	Pro_Video		varchar2(2000), -- 프로젝트 비디오 url
	Pro_Content		varchar2(2000), -- 프로젝트 소개 내용
	Pro_link		varchar2(2000), -- 프로젝트 관련 링크 url
	Pro_Image		varchar2(2000), -- 프로젝트 소개 사진 url
 	--프로젝트 스토리 정보 입력시 필요 컬럼
	
	Pro_fileImage	varchar2(2000), -- 등록자 사진url
	Pro_fileIntro 		varchar2(2000), --등록자 소개 정보 (lontext로 자료형 변환 할것
	Pro_zip             varchar2(2000),
	Pro_address			varchar2(255), --프로필등록 회사주소
	Pro_fileSns			varchar2(255), -- 등록자 sns url
	--프로젝트 등록자 프로필 정보 입력시 필요 컬럼
	
	Pro_Bank		varchar2(40), -- 후원 달성시 입금받을 은행명
	Pro_Account		varchar2(50)	, 	  -- 후원 달성시 입금받을 계좌명
	--프로젝트 계좌 정보 입력시 필요 컬럼
	
	Su_Count		integer default '0', -- 현재 프로젝트가 후원받은 수
				
	Now_Amount		integer default '0'--현재까지 후원된 금액
);

drop sequence project_seq;
create sequence project_seq
	start with 1
	increment by 1
	nocycle
	nocache;



alter table project ADD(pro_link varchar2(255));
alter table project ADD(pro_sns varchar2(255));
alter table project MODIFY (pro_fileImage varchar2(2000));

desc project;
insert into project
(pro_No,m_id,pro_title,pro_thumbnail,pro_catagory,pro_start,pro_end,pro_goal,
su_count)
values (project_seq.nextval,'test2','dreamup','코알라.jpg','음악',
	sysdate,sysdate,2000000,200);


select * from member;


	
select * from project;


	
	select pro_video,su_count,now_amount,pro_goal,
		Pro_fileImage,Pro_fileIntro,Pro_fileSns,
		pro_content,Pro_image
		from
		project
		where pro_no=20
		
		
		select pro_no,pro_thumbnail,pro_title
		from project
		where upper(pro_title) like upper('%D%')