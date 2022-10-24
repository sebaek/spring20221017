USE w3schools;
SELECT * FROM Products;
-- 상품명, 상품을 공급하는 공급자명 조회
SELECT p.ProductName, s.SupplierName
FROM Products p JOIN Suppliers s
     ON p.SupplierID = s.SupplierID;

-- 'Tofu'상품을 공급하는 공급자가 사는 도시 조회
SELECT p.ProductName, s.SupplierName, s.City
FROM Products p JOIN Suppliers s
  ON p.SupplierID = s.SupplierID
WHERE p.ProductName = 'Tofu';
-- 'Mayumi''s'가 공급하는 상품명들 조회
SELECT p.ProductName
FROM Products p JOIN Suppliers s
  ON p.SupplierID = s.SupplierID
WHERE s.SupplierName = 'Mayumi''s';

