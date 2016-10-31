drop table support;
create table support(
	Su_No			integer			primary key, --후원번호
	Pro_No			integer		not null references project(Pro_No), --후원하는 프로젝트 번호
	M_Id			varchar2(20)  	not null references member(M_id), --후원한 사람 ID
	Re_No			integer		not null references reward(Re_No), -- 후원시 받을 리워즈번호
	
	Su_Money		integer		not null, --후원금액
	Su_Name			varchar2(20)	not null, -- 배송 받을 사람 이름
	Su_Zip          varchar2(20)    not null, -- 배송우편번호
	Su_Address		varchar2(255)	not null, -- 배송지 주소
	Su_Phone		varchar2(20)	not null, -- 배송 받을 사람 번호
	PaymentPlan		varchar2(20)	not null, --결제방식
	Su_refundAccount varchar2(30) not null, --환불계좌
	Su_refundBank    varchar2(30) not null, --환불은행
	Su_Date			date		not null, -- 후원 날짜
	--프로젝트 후원 정보 입력시 필요 컬럼

	Su_State		varchar2(1)	not null  default '0' --환불여부

);

drop sequence support_seq;
create sequence support_seq
	start with 1
	increment by 1
	nocycle
	nocache; 