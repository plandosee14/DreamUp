drop table member;
create table member(
	M_No			integer,					-- 멤버 번호			
	M_Id			varchar2(20) 	primary key, -- 멤버 아이디
	M_Password		varchar2(100)	not null, -- 멤버 비밀번호
	M_Email			varchar2(40)	not null, -- 멤버 이메일 , 중복검사 할것
	M_Name			varchar2(20)    not null, --멤버 이름
	M_Date			date		not null, -- 가입일
    --회원가입시 입력 받는 컬럼 (INSERT)
	 
	M_Phone			varchar2(13), --1.후원할때 or 2.프로젝트 등록시 입력
	M_Address		varchar2(255), -- 1.후원할때 배송지 정보 or 2.프로젝트 등록시 주소정보 입력
	M_Post			varchar2(20), -- 1.후원할때 배송지 정보 or 2.프로젝트 등록시 주소정보 입력
	
	M_BankName		varchar2(30), -- 환불시 은행명
	M_Account		varchar2(20) -- 환불시 계좌번호
	--후원정보 입력시 입력 받는 컬럼 (UPDATE)
	
	m_SupportingCount		varchar2(20), -- 내가 후원하는 프로젝트 수 총합계 (후원시 +1)
	m_SupportiedCount		varchar2(20), -- 내 프로젝트 총 후원합계 (환불시 -1)
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
