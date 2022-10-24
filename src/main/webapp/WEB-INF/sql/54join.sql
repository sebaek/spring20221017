USE w3schools;
SELECT * FROM Products;
-- 상품명, 상품을 공급하는 공급자명 조회
SELECT p.ProductName, s.SupplierName
FROM Products p JOIN Suppliers s
     ON p.SupplierID = s.SupplierID;