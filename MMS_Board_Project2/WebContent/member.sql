create table member3(
	id varchar2(6) primary key,
	pw varchar2(15) not null,
	name varchar2(15) not null,
	birth date default sysdate,
	email varchar2(15)
)


insert into member3 values('admin', 'admin', 'admin', '1111/11/11', 'admin')
select * from member3

drop table member3

select id, pw, name, to_char(birth, 'yyyy/mm/dd') birth, email from member3