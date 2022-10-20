-- aggregate function : 집합 함수, 그룹 함수
SELECT * FROM Products;
SELECT * FROM Products ORDER BY CategoryID, Price DESC;
SELECT MAX(Price) FROM Products;

SELECT CategoryID, MAX(Price) 
FROM Products
GROUP BY CategoryID;

-- CategoryID별 가장 작은 값
-- CategoryID별 평균 가격
-- CategoryID별 가격 합



