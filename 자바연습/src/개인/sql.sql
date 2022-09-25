drop database hotel;

create DATABASE hotel;
use hotel;

drop table if exists room;
create table room(
    type varchar(20) primary key,
    price int,
    amount tinyint
);
drop table if exists customer;
create table customer(
	c_no int auto_increment primary key,
	id varchar(10),
    password varchar(10),
    name varchar(15),
    phone char(13)
);
select * from customer;
select * from r_list;
select * from room;

drop table if exists r_list;
create table r_list(
	reserve_no int auto_increment primary key,
	amount tinyint,
	name varchar(10),
	type varchar(20),
    foreign key(type) references room(type)
);
update room set price=80000 , amount=5 where type='12';
