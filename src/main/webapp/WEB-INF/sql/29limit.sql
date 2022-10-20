-- LIMIT : 조회 결과 row 수를 제한
SELECT * FROM Customers;
SELECT * FROM Customers LIMIT 5;
SELECT * FROM Customers LIMIT 3;

SELECT * FROM Products ORDER BY Price DESC LIMIT 3;
SELECT * FROM Products ORDER BY Price LIMIT 3;
SELECT * 
FROM Products 
WHERE Price IS NOT NULL 
ORDER BY Price 
LIMIT 3;

-- 가장 나이가 많은 직원 2명 조회
-- 가장 나이가 어린 직원 2명 조회




