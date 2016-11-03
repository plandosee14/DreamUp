drop table project;
create table project(
	Pro_No			integer		primary key,		
	M_Id			varchar2(20) 	not null references member(M_id),
	Pro_Thumbnail	varchar2(2000)	not null, -- ����� �̹��� url
	Pro_Title		varchar2(300)	not null, -- ������Ʈ Ÿ��Ʋ
	Pro_Catagory	varchar2(50)	not null, -- ������Ʈ ī�װ�
	Pro_Start		date			not null, -- ������Ʈ ������(sysdate)
	Pro_End			date			not null, -- ������Ʈ ����(sysdate+a)
	Pro_Goal		integer			not null, -- ������Ʈ ��ǥ�ݾ�
	Pro_state		integer 	default '0',
	--Pro_state
	--0 : ���� �����
	--1 : ��� �Ϸ� & �Ŀ� ������
	--2 : �Ŀ� �Ⱓ ����		
	--������Ʈ �⺻ ���� �Է½� �ʿ� �÷�
	
	Pro_Video		varchar2(2000), -- ������Ʈ ���� url
	Pro_Content		varchar2(2000), -- ������Ʈ �Ұ� ����
	Pro_link		varchar2(2000), -- ������Ʈ ���� ��ũ url
 	--������Ʈ ���丮 ���� �Է½� �ʿ� �÷�
	
	Pro_fileImage	varchar2(2000), -- ����� ����url
	Pro_fileIntro 		varchar2(2000), --����� �Ұ� ���� (lontext�� �ڷ��� ��ȯ �Ұ�
	Pro_zip             varchar2(2000),
	Pro_address			varchar2(255), --�����ʵ�� ȸ���ּ�
	Pro_fileSns			varchar2(255), -- ����� sns url
	--������Ʈ ����� ������ ���� �Է½� �ʿ� �÷�
	
	Pro_Bank		varchar2(40), -- �Ŀ� �޼��� �Աݹ��� �����
	Pro_Account		varchar2(50)	, 	  -- �Ŀ� �޼��� �Աݹ��� ���¸�
	--������Ʈ ���� ���� �Է½� �ʿ� �÷�
	
	Su_Count		integer default '0', -- ���� ������Ʈ�� �Ŀ����� ��
				
	Now_Amount		integer default '0'--������� �Ŀ��� �ݾ�
);

drop sequence project_seq;
create sequence project_seq
	start with 1
	increment by 1
	nocycle
	nocache;



alter table project ADD(pro_link varchar2(255));
alter table project ADD(pro_sns varchar2(255));
alter table project MODIFY (pro_fileImage varchar2(2000));

desc project;
insert into project
(pro_No,m_id,pro_title,pro_thumbnail,pro_catagory,pro_start,pro_end,pro_goal,
su_count)
values (project_seq.nextval,'test2','dreamup','�ھ˶�.jpg','����',
	sysdate,sysdate,2000000,200);


select * from member;
update project set now_amount=2000

	
select pro_no, now_amount from project where pro_no =54;
delete from project where pro_no = 51;
select re_no from reward where pro_no = 51;
delete from reward where re_no =32;
select * from reward where re_no = 34;

select * from support where re_no =34;

delete from support where re_no = (select re_no from reward where pro_no =51 );

alter table project drop (pro_image)	
ALTER TABLE TABLE_NAME  DROP(columnName );

select * from project where pro_no = 53;

select (now_amount/pro_goal)*100 as goal from project where pro_no = #pro_no#
select (pro_end - pro_start) from project

select pro_goal, pro_end, pro_thumbnail, pro_title, trunc((now_amount/pro_goal)*100) as goal, round(pro_end - pro_start)as duedate from project;
		select
		trunc((now_amount/pro_goal)*100) as progress, pro_goal, pro_end,
		pro_thumbnail, pro_title, round(pro_end - pro_start) as due_date
		,pro_no from project
		
		select now_amount, pro_goal from project
	
	select pro_video,su_count,now_amount,pro_goal,
		Pro_fileImage,Pro_fileIntro,Pro_fileSns,
		pro_content,Pro_image
		from
		project
		where pro_no=20
		
		
		select pro_no,pro_thumbnail,pro_title
		from project
		where upper(pro_title) like upper('%D%')
		
				update project set now_amount = 50000 where pro_no = 29
		select pro_no,pro_video,su_count,now_amount,pro_goal,
		Pro_fileImage,Pro_fileIntro,Pro_fileSns
		from
		project
		where pro_no=4
		
		
		
		
		
		select * from project
		select * from support