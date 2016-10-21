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

select * from member;
insert into member values (member_seq.nextval, 'daemang', '1234', 'kancho33@naver.com', sysdate, '�̱���', '������?','010-3338-5525','���굿237-75','561-340','110-386969');
	insert into project values (project_seq.nextval,'daemang2','MakingGame','alotofStrings',sysdate,sysdate,200000,'Game','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411388284,'33','0','111111');
s
	select * from project;
drop sequence project_seq;
create sequence project_seq
	start with 1
	increment by 1
	nocycle
	nocache;