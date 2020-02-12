create table member3(
	id varchar2(15) primary key,
	pw varchar2(15) not null,
	name varchar2(15) not null,
	birth date default sysdate,
	email varchar2(30)
)

select * from member3

drop table member3

insert into member3 (id, pw, name, birth, email) values('test1', 'asdf', '안경수', '1990/09/14', 'rud@naver.com')

select id, pw, name, to_char(birth, 'yyyy/mm/dd') birth, email from member3

