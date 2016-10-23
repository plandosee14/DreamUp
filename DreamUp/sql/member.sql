drop table member;
create table member(
	M_No			integer,					
	M_Id			varchar2(20) 	primary key,
	M_Password		varchar2(100)	not null,
	M_Email			varchar2(40)	not null,	
	//이메일 중복검사
	M_Date			date		not null,
	M_Name			varchar2(20)    not null,
	M_Supporting		varchar2(20),
	M_Phone			varchar2(13),
	M_Address		varchar2(255),
	M_Post			varchar2(20),
	M_Account		varchar2(20)
);
	

select * from member

select m_id from member where m_email='kancho33@naver.com' and m_name ='기호창';

select * from project

delete from member
delete from project

drop table member
drop table project

delete * from member where M_ID='damang';

drop sequence member_seq;
create sequence member_seq
	start with 1
	increment by 1
	nocycle
	nocache;
