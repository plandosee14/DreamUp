drop table reply;
create table reply(
	Rp_No		integer		primary key,		
	Pro_No		integer		not null references project(Pro_No),
	M_id		varchar2(20)	not null references member(M_id),
	Rp_Content	varchar2(100)	not null,
	Rp_Time		date		not null,
	ThumbsUp	integer
);

drop sequence reply_seq;
create sequence reply_seq
	start with 1
	increment by 1
	nocycle
	nocache;