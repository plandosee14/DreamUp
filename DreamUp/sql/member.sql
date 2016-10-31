drop table member;
create table member(
   M_No         integer,               -- ��� ��ȣ         
   M_Id         varchar2(30)    primary key, -- ��� ���̵�
   M_Password      varchar2(150)   not null, -- ��� ��й�ȣ
   M_Email         varchar2(150)   not null, -- ��� �̸��� , �ߺ��˻� �Ұ�
   M_Name         varchar2(30)    not null, --��� �̸�
   M_Date         date      not null, -- ������
    --ȸ�����Խ� �Է� �޴� �÷� (INSERT)
    
   M_Phone         varchar2(13), --1.�Ŀ��Ҷ� or 2.������Ʈ ��Ͻ� �Է�
   M_Zip          varchar2(13),
   M_Address      varchar2(255), -- 1.�Ŀ��Ҷ� ����� ���� or 2.������Ʈ ��Ͻ� �ּ����� �Է�
   M_Post         varchar2(20), -- 1.�Ŀ��Ҷ� ����� ���� or 2.������Ʈ ��Ͻ� �ּ����� �Է�
   
   M_BankName      varchar2(30), -- ȯ�ҽ� �����
   M_Account      varchar2(20), -- ȯ�ҽ� ���¹�ȣ
   --�Ŀ����� �Է½� �Է� �޴� �÷� (UPDATE)
   
   m_SupportingCount      int default '0', -- ���� �Ŀ��ϴ� ������Ʈ �� ���հ� (�Ŀ��� +1)
   m_supportedCount      int default '0'-- �� ������Ʈ �� �Ŀ��հ� (ȯ�ҽ� -1)
);
   
      insert into member
      (m_no, m_id, m_password, m_email, m_name, m_date)
      values
      (member_seq.nextval, 'test1', '1234', 'kancho33@naver.com', '�ֿ뼮', sysdate);
      
      insert into member
      (m_no, m_id, m_password, m_email, m_name, m_date)
      values
      (member_seq.nextval, 'test2', '5678', 'daun33@naver.com', '���ٿ�', sysdate);
      
      insert into member
      (m_no, m_id, m_password, m_email, m_name, m_date)
      values
      (member_seq.nextval, 'test3', '1111', 'plan33@naver.com', '������', sysdate);
      
      insert into member
      (m_no, m_id, m_password, m_email, m_name, m_date)
      values
      (member_seq.nextval, 'test4', '5555', 'daemaeng33@naver.com', '�ڴ��', sysdate);
      
      
select * from member   
select * from member where m_no = 6

select m_id from member where m_email='kancho33@naver.com' and m_name ='��ȣâ';

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
   
   
         update member
      set
      m_supportingCount=m_supportingCount+1
      where m_id= 'test1' 
      
         
         update member
      set
      m_date=m_date+1
      where m_id= 'test1' 
