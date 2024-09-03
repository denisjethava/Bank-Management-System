
create database BankManagement;
use BankManagement;

create table signup(formno varchar(20),name varchar(20),father_name varchar(20),
dob varchar(15),gender varchar(15),email varchar(20),marital_status varchar(20),
address varchar(50),city varchar(50),pincode varchar(20),state varchar(20));

show tables;
select * from signup;

create table signuptwo(formno varchar(20),religion varchar(20),category varchar(20),
income varchar(20),qualification varchar(20),occupation varchar(20),pan varchar(20),
aadhar varchar(20),seniorcitizon varchar(20),account varchar(20));

select * from signuptwo;

create table signupthree(formno varchar(20),accounttype varchar(40),cardno varchar(30),
pin varchar(20),facility varchar(100));

select * from signupthree;

create table login(formno varchar(20),cardno varchar(30),pin varchar(20));
select * from login;

create table depo(pin varchar(10),date varchar(20),type varchar(20),amount varchar(20));
select * from depo; 	

create table withdraw(pin varchar(10),date varchar(20),type varchar(20),amount varchar(20));
select * from withdraw;	

create table balance(pin varchar(10),date varchar(30),type varchar(20),amount varchar(20));
select * from balance;

create table bank(pin varchar(10),date varchar(50),type varchar(20),amount varchar(20));
select * from bank;