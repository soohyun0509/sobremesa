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

drop table if exists reservation;
create table reservation(
	rno int primary key auto_increment,	-- 예약번호
    name varchar(20),		-- 예약자
    phone char(15),		-- 핸드폰 번호
    r_date varchar(10),		-- 예약날짜
    rsize int,				-- 예약인원수
    mno	int, 
    constraint mno_fk foreign key(mno) references member(mno)
);


select * from member;
select * from reservation;
