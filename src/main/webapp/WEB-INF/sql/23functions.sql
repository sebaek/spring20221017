-- 내장 함수들
USE w3schools;

-- MIN : 가장 작은 값 
SELECT * FROM Products ORDER BY Price DESC;
SELECT MIN(Price) FROM Products;

-- MAX : 가장 큰 값
SELECT MAX(Price) FROM Products;

SELECT MIN(CustomerName) FROM Customers;
SELECT MAX(CustomerName) FROM Customers;
SELECT * FROM Customers ORDER BY CustomerName DESC;

-- 직원 생일 중 가장 먼저 태어난 사람의 생일
-- 가장 어린 사람의 생일

