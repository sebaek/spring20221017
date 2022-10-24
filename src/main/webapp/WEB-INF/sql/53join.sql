CREATE DATABASE mydb5;
USE mydb5;

CREATE TABLE Categories
AS
SELECT CategoryID, CategoryName 
FROM w3schools.Categories;

CREATE TABLE Products
AS
SELECT ProductID, ProductName, CategoryID
FROM w3schools.Products;


SELECT * FROM Products;
SELECT * FROM Categories;

-- 'Chais'상품이 어떤 카테고리명에 소속되어 있는가?
SELECT * FROM Products WHERE ProductName = 'Chais';
SELECT * FROM Categories WHERE CategoryId = 1;

SELECT * FROM Categories WHERE CategoryID = (SELECT CategoryID
                                             FROM
                                             Products
                                             WHERE ProductName = 'Chais');
                                             
-- JOIN : 두 개 이상의 테이블을 연결해서 조회할 수 있다

-- CARTESIAN PRODUCT
-- 결과행 = Arow X Brow
-- 결과열 = Acol + Bcol

DESC Products; -- 3 cols
SELECT COUNT(*) FROM Products; --  77 rows, 

DESC Categories; -- 2cols
SELECT COUNT(*) FROM Categories; --  8 rows

-- Products와 Categories 를 Cartesian Product 
-- 결과행의수: 77 * 8
-- 결과열의수: 3 + 2

-- Cartesian Product 
SELECT * FROM Products JOIN Categories; -- 행:616, 열:5
SELECT COUNT(*) FROM Products JOIN Categories;

SELECT * FROM Products JOIN Categories
WHERE Products.CategoryID = Categories.CategoryID
;

SELECT * FROM Products JOIN Categories 
ON Products.CategoryID = Categories.CategoryID
WHERE Products.ProductName = 'Chais';

SELECT * FROM Products JOIN Categories 
WHERE Products.CategoryID = Categories.CategoryID
  AND Products.ProductName = 'Chais';

















