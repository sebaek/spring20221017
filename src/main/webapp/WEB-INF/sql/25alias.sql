-- ALIAS : 컬럼/테이블에 별칭을 줄 수 있다.
-- AS

SELECT CustomerID, CustomerName FROM Customers;
SELECT CustomerID AS id,
	   CustomerName AS name
FROM Customers;