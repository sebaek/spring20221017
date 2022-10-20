-- aggregate function : 집합 함수, 그룹 함수
SELECT * FROM Products;
SELECT * FROM Products ORDER BY CategoryID, Price DESC;
SELECT MAX(Price) FROM Products;

SELECT CategoryID, MAX(Price) 
FROM Products
GROUP BY CategoryID;

-- CategoryID별 가장 작은 값
SELECT CategoryID, MIN(Price) FROM Products GROUP BY CategoryID;
-- CategoryID별 평균 가격
SELECT CategoryID, AVG(Price) FROM Products GROUP BY CategoryID;
-- CategoryID별 가격 합
SELECT CategoryID, SUM(Price) FROM Products GROUP BY CategoryID;


-- 나라별 고객 수 (Customers)

-- 도시별 공급자 수 (Suppliers)



