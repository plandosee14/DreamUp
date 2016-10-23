drop table reward;
create table reward(
	Re_No		integer			primary key,		
	Pro_No		integer		 	not null references project(Pro_No),
	Re_Title	varchar2(30)	not null,
	Re_Amount	integer			not null,
	Re_Item		varchar2(30)	not null,
	Re_delivery date			not null 
);

alter table reward add colum re_delivery 

alter table reward ADD(re_delivery date not null);

select * from reward
drop sequence reward_seq;
create sequence reward_seq
	start with 1
	increment by 1
	nocycle
	nocache;