drop table member;
create table member(
	M_No			integer,					
	M_Id			varchar2(20) 	primary key,
	M_Password		varchar2(100)	not null,
	M_Email			varchar2(40)	not null,	
	M_Date			date		not null,
	M_Name			varchar2(20)    not null,
	M_Supporting		varchar2(20),
	M_Phone			varchar2(13),
	M_Address		varchar2(255),
	M_Post			varchar2(20),
	M_Account		varchar2(20)
);
	
insert into member values (member_seq.nextval, 'daemang', '1234', 'kancho33@naver.com', sysdate, '최용석', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang', '1234', 'kancho33@naver.com', sysdate, '이하은', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang', '1234', 'kancho33@naver.com', sysdate, '기호창', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang', '1234', 'kancho33@naver.com', sysdate, '전성원', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang', '1234', 'kancho33@naver.com', sysdate, '정다운', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang', '1234', 'kancho33@naver.com', sysdate, '이길재', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang', '1234', 'kancho33@naver.com', sysdate, '', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang', '1234', 'kancho33@naver.com', sysdate, '이길재', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang', '1234', 'kancho33@naver.com', sysdate, '이길재', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang', '1234', 'kancho33@naver.com', sysdate, '이길재', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang', '1234', 'kancho33@naver.com', sysdate, '이길재', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');




insert into member values (member_seq.nextval, 'daemang', '1234', 'kancho33@naver.com', sysdate, '최용석');
drop sequence member_seq;
create sequence member_seq
	start with 1
	increment by 1
	nocycle
	nocache;
