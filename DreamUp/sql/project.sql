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
	Pro_Image		varchar2(2000), -- ������Ʈ �Ұ� ���� url
 	--������Ʈ ���丮 ���� �Է½� �ʿ� �÷�
	
	Pro_fileImage	varchar2(40), -- ����� ����url
	Pro_fileIntro 		varchar2(2000), --����� �Ұ� ���� (lontext�� �ڷ��� ��ȯ �Ұ�
	Pro_zip             varchar2(30),
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

insert into project
(pro_No,m_id,pro_title,pro_thumbnail,pro_catagory,pro_start,pro_end,pro_goal,
su_count)
values (project_seq.nextval,'test2','dreamup','�ھ˶�.jpg','����',
	sysdate,sysdate,2000000,200);


select * from member;


	
select * from project;


	
	select pro_video,su_count,now_amount,pro_goal,
		Pro_fileImage,Pro_fileIntro,Pro_fileSns,
		pro_content,Pro_image
		from
		project
		where pro_no=20
		
		
		select pro_no,pro_thumbnail,pro_title
		from project
		where upper(pro_title) like upper('%D%')