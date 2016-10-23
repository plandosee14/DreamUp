Pro_state
0 : 현재 등록중
1 : 등록 완료 & 후원 진행중
2 : 후원 기간 마감
select pro_no from project where m_id='daemang1' and pro_state='0';
select pro_no from project where m_id='daemang1' and pro_state='1';
	
select pro_no, pro_state from project where m_id='daemang1'
insert into project values (project_seq.nextval,'daemang1','MakingGame2','alotofStrings',sysdate,sysdate+7,200000,'Game','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','1','111111');
insert into project values (project_seq.nextval,'daemang++
1','MakingGame1','alotofStrings',sysdate,sysdate+7,200000,'Game','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into reward values(reward_seq.nextval, (select pro_no from project where m_id='daemang1' and pro_state='0'),'rewardTitle','rewartAmount','reItem')
	
	
	
	
	insert into project values (project_seq.nextval,'daemang2','MakingGame2','alotofStrings',sysdate,sysdate+8,300000,'Game','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang3','MakingGame3','alotofStrings',sysdate,sysdate+9,400000,'Game','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang4','MakingGame4','alotofStrings',sysdate,sysdate+10,500000,'Game','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang5','MakingGame5','alotofStrings',sysdate,sysdate+11,600000,'Game','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	
	insert into project values (project_seq.nextval,'daemang6','MakingMusic1','alotofStrings',sysdate,sysdate+12,700000,'music','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang7','MakingMusic2','alotofStrings',sysdate,sysdate+13,800000,'music','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang8','MakingMusic3','alotofStrings',sysdate,sysdate+14,900000,'music','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang9','MakingMusic4','alotofStrings',sysdate,sysdate+15,1000000,'music','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang10','MakingMusic5','alotofStrings',sysdate,sysdate+16,1100000,'music','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	
	insert into project values (project_seq.nextval,'daemang11','MakingIdea1','alotofStrings',sysdate,sysdate+17,1200000,'idea','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang12','MakingIdea2','alotofStrings',sysdate,sysdate+18,1300000,'idea','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang13','MakingIdea3','alotofStrings',sysdate,sysdate+19,1400000,'idea','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang14','MakingIdea4','alotofStrings',sysdate,sysdate+20,1500000,'idea','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang15','MakingIdea5','alotofStrings',sysdate,sysdate+21,1600000,'idea','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang16','MakingMovie1','alotofStrings',sysdate,sysdate+22,1700000,'movie','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang17','MakingMovie2','alotofStrings',sysdate,sysdate+23,200000,'movie','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang18','MakingMovie3','alotofStrings',sysdate,sysdate+24,200000,'movie','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang19','MakingMovie4','alotofStrings',sysdate,sysdate+25,200000,'movie','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang20','MakingMovie5','alotofStrings',sysdate,sysdate+26,200000,'movie','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	
	insert into project values (project_seq.nextval,'daemang21','Makingfood1','alotofStrings',sysdate,sysdate+27,200000,'food','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang22','Makingfood2','alotofStrings',sysdate,sysdate+28,200000,'food','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang23','Makingfood3','alotofStrings',sysdate,sysdate+29,200000,'food','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	insert into project values (project_seq.nextval,'daemang24','Makingfood4','alotofStrings',sysdate,sysdate+30,200000,'food','com.dreamup.Video','com.dreamup.image','com.dreamup.testThumbnail',110411,'33','0','111111');
	
	select * from project
	delete from project
	
	;
	