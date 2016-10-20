drop table support;
create table support(
	Su_No			integer			primary key,
	Pro_No			integer		not null references project(Pro_No),
	M_Id			varchar2(20)  	not null references member(M_id),
	Re_No			integer		not null references reward(Re_No),
	Su_Money		integer		not null,
	Su_Date			date		not null,
	Su_Nmae			varchar2(20)	not null,			
	Su_Address		varchar2(20)	not null,
	Su_Phone		varchar2(20)	not null,
	PaymentPlan		varchar2(20)	not null,
	su_State		character(1)	not null
);

drop sequence support_seq;
create sequence support_seq
	start with 1
	increment by 1
	nocycle
	nocache;