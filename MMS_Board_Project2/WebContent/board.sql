create table board3(
	num number(6) primary key,	--글의 id(자동으로 1씩 증가시키기 위해서 number타입)
	author varchar2(15) not null,	--작성자
	title varchar2(90) not null,	--제목
	content varchar2(1000) not null,	--본문
	writeday date default sysdate,	--작성일
	readcnt number(6) default 0,	--조회수
	repRoot number(4),	--답글하고 원래 글하고 붙어있게 하기 위해(순서 정렬)	*답글은 원래글의 num값이 아니라 repRoot값을 따라간다		*원래글의 repRoot = num, 답글의 repRoot = 원래글의 repRoot
	repStep number(4),	--답글들 간의 순서 정렬
	repIndent number(4),	--답글 들여쓰기 (forEach 이용)
	good number(6),
	bad number(6) 
)
update board3 set bad = bad+1 where num=1013
update board3 set good = good+1 where num=1013
commit
-- 1. 테이블 생성 / 2. 테이블을 바탕으로 DTO클래스 생성 / 3. DAO클래스 생성
-- CommandAction 생성
select bad from board3 where num=1013
select good from board3 where num=1013
select nvl(bad, 0) from board3 

alter table board3
drop column visitor


select * from( --3
select rownum rnum, num, title, author, to_char(writeday, 'yyyy/mm/dd') writeday, readcnt, repIndent from( --2. rownum값 가져오기 위한 작업
select * from board order by repRoot desc, repStep asc) -- 1
) where rnum between ? and ? --3