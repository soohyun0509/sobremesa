drop database if exists sobremesa;
create database sobremesa;
use sobremesa;

drop table if exists member;
create table member(
	mno int auto_increment,-- 회원번호도 줘야됨
	mid varchar(12),
    mpassword varchar(15),
    mname varchar(10),
	memail varchar(30),
    constraint mno_pk primary key(mno)
);

select * from member;
