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
insert into customer(custid, name) values(6, '신유빈');
commit;
select * from orders;

/* 2/3 Update

UPDATE 테이블명
    SET 필드명1=값1, ..., 필드명n=값n
    where 조건;
*/
-- 스포츠 심리 책의 출판사를 한솔의학서적으로 변경
update book set publisher='한솔의학서적' where bookid=12;
select * from book;
-- 신유빈 선수의 주소를 강원도 영월, 전화번호 010-2345-5678으로 변경
update customer set address='강원도 영월', phone='010-2345-6789'
    where custid=6;
-- 전화번호가 null인 고객을 070-2345-9876으로 변경
update customer set phone='010-2345-9876' where phone is null;
select * from customer;
commit;

/* 3/3 Delete

DELETE FROM 테이블명 WHERE 조건;
*/
-- 고객 테이블에 테스트 데이터 입력후 삭제
insert  into customer(custid, neame) values (7, '테스트');
insert all
   to customer(custid, name) values(8, '류현진') in
    into customer(custid, name) values(9, '손흥민')
    select * from dual;
select * from customer;
-- custid가 7인 고객 삭제
delete from customer where custid=7;
-- 주소가 null인 고객 삭제
delete from customer where address is null;

select * from book;
select * from orders;
select * from customer;

/* 연습문제 */
-- 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select distinct custid from orders
    where bookid in (select bookid from book
        where publisher in (select publisher from book
            where bookid in (select bookid from orders
                where custid in (select custid from customer
                    where name='박지성'))));
-- #선생님
select distinct ec.name from orders eo
    join book eb on eo.bookid=eb.bookid
    join customer ec on eo.custid=ec.custid
    where eb.publisher in (select b.publisher from orders o
        join book b on o.bookid=b.bookid
        join customer c on o.custid=c.custid
        where c.name like '박지성');

-- 고객의 이름과 고객이 구매한 도서 목록
select c.name, listagg(b.bookname, ',') within group
    from orders o
    join customer c on o.custid=c.custid
    join book b on o.bookid=b.bookid
    group by c.name;
    
-- 도서의 가격과 판매가격의 차이가 가장 많은 주문
-- 1.판매 가격과 정가의 차이가 제일 큰 값 =6000
select max(abs(o.saleprice-b.price)) from orders o
    join book b on o.bookid=b.bookid;
-- 2.판매가와 정가으 ㅣ차이가 6000원인 주문 찾기
select o.orderid, o.saleprice, b.price from orders o
    join book b on o.bookid=b.bookid
    where abs(o.saleprice-b.price) = 6000;
-- 3.두개의 SQL 을 결합
select o.orderid, o.saleprice, b.price from orders o
    join book b on o.bookid=b.bookid
    where abs(o.saleprice-b.price) = (
        select max(abs(o.saleprice-b.price)) from orders o
        join book b on o.bookid=b.bookid);
        
-- 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름
select avg(saleprice) from orders;
select c.name, avg(o.saleprice) from orders o
    join customer c on o.custid=c.custid
    group by c.name
    having avg(o.saleprice) > (select avg(saleprice) from orders);





