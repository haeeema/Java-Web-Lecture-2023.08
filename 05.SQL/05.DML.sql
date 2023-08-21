/*
 * DML: Data Manipulation Language
 */

/* 1/3 Insert

INSERT INTO 테이블명[(필드명1, 필드명2, ..., 필드명n]
    VALUES (값1, 값2, ..., 값n);
*/

-- 북 테이블에 새로운 레코드 추가
insert into book values(11, '스포츠 의학', '한솔의학서적', 90000);
select * from book;
desc book;
-- 스포츠 심리, 24000, 출판사 모름
insert into book(bookid, bookname, price)
    values(12, '스포츠 심리', 24000);
select * from book;
-- 박세리 고객이 스포츠 의학을 오늘 구매하였음
select * from orders;
insert into orders values(11, 90000, default, 5, 11);
select * from orders;
-- 박찬호 고객이 스포츠 심리라는 책을 오늘 구매한 사실을 orders 테이블에 기록
insert into orders(orderid, saleprice, custid, bookid)
    values(12, 24000, 1, 12);
commit;
select * from orders;

