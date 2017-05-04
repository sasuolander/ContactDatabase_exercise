CREATE TABLE contact (
ID int auto_increment primary key,
FirstName varchar(30),
LastName varchar(30),
Title varchar(30),
Organization varchar(30),
Address varchar(30),
ZIP_code varchar(30),
City varchar(30),
Country varchar(30),
);

CREATE TABLE userprofiles(
ID int auto_increment primary key,
name varchar(30),
password varchar(30)
);

--Dummy data for testing and speedy start

INSERT INTO contact(FirstName, LastName, Title ,Organization ,Address ,ZIP_code ,City ,Country)
values 
('tommi', 'henkka', 'tietokone' ,'dummy' ,'dummyaddress' ,'10' ,'everywhere' ,'anything'),
('tommi6', 'henkka', 'tietokone' ,'dummy' ,'dummyaddress' ,'10' ,'everywhere' ,'anything'),
('tommi2', 'henkka', 'tietokone' ,'dummy' ,'dummyaddress' ,'10' ,'everywhere' ,'anything')


