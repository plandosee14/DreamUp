drop table project;
create table project(
	Pro_No			integer		primary key,		
	M_Id			varchar2(20) 	not null references member(M_id),
	Pro_Title		varchar2(100)	not null,
	Pro_Content		varchar2(40)		,	
	Pro_Start		date		not null,
	Pro_End			date		not null,
	Pro_Goal		integer		not null,
	Pro_Catagory		varchar2(13)	not null,
	Pro_Video		varchar2(30),
	Pro_ImageUrl		varchar2(30)	,
	Pro_Thumbnail		varchar2(30)	,
	Pro_Account		integer		,
	Su_Count		integer,
	Pro_state		integer,	
	NowAmount		varchar2(255)
);

Pro_state
0 : 현재 등록중
1 : 등록 완료 & 후원 진행중
2 : 후원 기간 마감

	insert into project
		(pro_title,pro_thumbnail,pro_catagory,pro_start,pro_end,pro_goal)
		values (#pro_title#,#pro_thumbnail#,#pro_catagory#,#pro_start#,#pro_end#,#pro_goal#)


select * from member;
	insert into project values (project_seq.nextval,'daemang1','MakingGame1','alotofStrings',sysdate,sysdate+7,200000,'Game','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang2','MakingGame2','alotofStrings',sysdate,sysdate,200000,'Game','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang3','MakingGame3','alotofStrings',sysdate,sysdate,200000,'Game1','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang4','MakingGame4','alotofStrings',sysdate,sysdate,200000,'Game2','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang5','MakingGame5','alotofStrings',sysdate,sysdate,200000,'Game3','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang6','MakingGame6','alotofStrings',sysdate,sysdate,200000,'Game4','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang7','MakingGame7','alotofStrings',sysdate,sysdate,200000,'Game5','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang8','MakingGame8','alotofStrings',sysdate,sysdate,200000,'Game6','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang9','MakingGame9','alotofStrings',sysdate,sysdate,200000,'Game7','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang10','MakingGame10','alotofStrings',sysdate,sysdate,200000,'Game8','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang11','MakingGame11','alotofStrings',sysdate,sysdate,200000,'Game9','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang12','MakingGame12','alotofStrings',sysdate,sysdate,200000,'Game10','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang13','MakingGame13','alotofStrings',sysdate,sysdate,200000,'Game11','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang14','MakingGame14','alotofStrings',sysdate,sysdate,200000,'Game12','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang15','MakingGame15','alotofStrings',sysdate,sysdate,200000,'Game13','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	
	select * from project;
drop sequence project_seq;
create sequence project_seq
	start with 1
	increment by 1
	nocycle
	nocache;