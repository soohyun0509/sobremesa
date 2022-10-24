drop database if exists sobremesa;
create database sobremesa;

drop table if exists member;
create table member(
	mno int primary key auto_increment, -- 회원 번호
    id varchar(12), -- 아이디
    password varchar(15), -- 비밀번호
    name varchar(10), -- 이름
    email varchar(25) -- 이메일
);

select * from member;