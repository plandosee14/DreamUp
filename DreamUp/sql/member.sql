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
	
insert into member values (member_seq.nextval, 'daemang1', '1234', 'kancho33@naver.com', sysdate, '최용석', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang2', '1234', 'kancho33@naver.com', sysdate, '이하은', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang3', '1234', 'kancho33@naver.com', sysdate, '기호창', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang4', '1234', 'kancho33@naver.com', sysdate, '전성원', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang5', '1234', 'kancho33@naver.com', sysdate, '정다운', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang6', '1234', 'kancho33@naver.com', sysdate, '이길재', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang7', '1234', 'kancho33@naver.com', sysdate, '최필한', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang8', '1234', 'kancho33@naver.com', sysdate, '김혜정', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang9', '1234', 'kancho33@naver.com', sysdate, '박재현', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang10', '1234', 'kancho33@naver.com', sysdate, '최효원', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang11', '1234', 'kancho33@naver.com', sysdate, '김현영', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang12', '1234', 'kancho33@naver.com', sysdate, '안선영', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang13', '1234', 'kancho33@naver.com', sysdate, '황혜정', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang14', '1234', 'kancho33@naver.com', sysdate, '오정훈', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang15', '1234', 'kancho33@naver.com', sysdate, '이성욱', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang16', '1234', 'kancho33@naver.com', sysdate, '신유동', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang17', '1234', 'kancho33@naver.com', sysdate, '이길학', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang18', '1234', 'kancho33@naver.com', sysdate, '박지혜', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang19', '1234', 'kancho33@naver.com', sysdate, '박종민', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang20', '1234', 'kancho33@naver.com', sysdate, '이종환', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang21', '1234', 'kancho33@naver.com', sysdate, '이대원', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang22', '1234', 'kancho33@naver.com', sysdate, '권성준', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang23', '1234', 'kancho33@naver.com', sysdate, '최예나', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');
insert into member values (member_seq.nextval, 'daemang24', '1234', 'kancho33@naver.com', sysdate, '이소영', '서포팅?','010-3338-5525','가산동237-75','561-340','110-386969');

select * from member

drop sequence member_seq;
create sequence member_seq
	start with 1
	increment by 1
	nocycle
	nocache;
