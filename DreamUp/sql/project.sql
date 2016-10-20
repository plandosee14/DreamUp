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

drop sequence project_seq;
create sequence project_seq
	start with 1
	increment by 1
	nocycle
	nocache;