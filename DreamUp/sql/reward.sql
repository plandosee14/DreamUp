drop table reward;
create table reward(
	Re_No		integer			primary key,		
	Pro_No		integer		 	not null references project(Pro_No),
	Re_Money	integer			not null, -- �Ŀ�(����) �ݾ�
	Re_Title	varchar2(50)	not null, -- ������ Ÿ��Ʋ
	Re_Item		varchar2(50)	not null, -- ����Ʈ ������ ���
	Re_delivery date			not null, -- ��� ������
	Re_Limite	integer			 -- ������ ��������
	--������Ʈ ������ ��Ͻ� �ʿ� �÷�
);

drop sequence reward_seq;
create sequence reward_seq
	start with 1
	increment by 1
	nocycle
	nocache;
	
alter table reward add colum re_delivery 

alter table reward ADD(re_delivery date not null);

select * from reward


select * from project

select * from reward where re_no=3

insert into reward
(Re_No,Pro_No,Re_Money,Re_Title,Re_Item,Re_delivery,Re_Limite)
values
(reward_seq.nextval,34,15000,'����̺νñ�','������',to_date('16-11-23'),15);

insert into reward
(Re_No,Pro_No,Re_Money,Re_Title,Re_Item,Re_delivery,Re_Limite)
values
(reward_seq.nextval,34,15000,'����̺νñ�','������',to_date('16-11-23'),15);




insert into reward
(re_no, pro_no) values(reward_seq.nextval, 34)
insert into reward
(Re_No,Pro_No,Re_Money,Re_Title,Re_Item,Re_delivery,Re_Limite)
values
(reward_seq.nextval,34,15000,'����̺νñ�','������',sysdate,15);

select re_no,pro_no from reward;
select re_no from reward where pro_no =36 ;
select pro_no from project;