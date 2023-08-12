create database java_project;
use java_project;

create table login(mail varchar(30),pass varchar(20));
desc login;
select * from login;
insert into login values("anjali","anju123");

create table registration(fname varchar(30),lname varchar(30),mno integer(10),mail varchar(30),pass varchar(30));
desc registration;
select * from registration;
alter table registration modify column mno integer(20);

create table frame4(sname varchar(30), spin integer(10), scity varchar(30), sadd varchar(30), smno integer(10), parcel varchar(30), weight varchar(30), delivery varchar(30), rname varchar(30), rpin integer(10), rcity varchar(30), radd varchar(30), rmno integer(10));
desc frame4; 
select * from frame4;















