/*
 * DDL: Data Definition Language
 */
 
 /* 1/3 Create table
 
 다음과 같은 속성을 가진 NewBook테이블을 생성하시오,
 정수형은 NUMBER를, 문자형은 가변형 문자타입인 VARCHAR2를 사용
    bookid(도서번호) - NUMBER
    bookname(도서이름) - VARCHAR2(20)
    publisher(출판사) - VARCHAR2(20)
    price(가격) - NUMBER
 */
 
 create table NewBook (
    bookid number primary key,
    bookname varchar2(20),
    publisher varchar2(20),
    price number
 );
 
 drop table NewBook;
 
 create table NewBook (
    bookname VARCHAR2(40) unique,
    publisher VARCHAR2(20) not null,
    price NUMBER default 10000 check(price >= 1000),
    PRIMARY KEY(bookname, publisher)
);

create table NewCustomer (
     custid number primary key,
     name VARCHAR2(40),
     address varchar2(40),
     phone varchar2(30)
);

/* 2/3 Ater table */
-- NewCustomer 테이블에 email 추가
alter table newcustomer add email varchar2(40);
desc newcustomer;
-- phone 필드를 제거
alter table newcustomer drop column phone;
-- name 필드를 cname으로 이름을 변경하고, not null 추가
alter table newcustomer modify name varchar2(40) not null;
alter table newcustomer rename column name to cname

/* 2/3 Ater table */
drop table newcustomer;
drop table newbook;
commit;










