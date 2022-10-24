SELECT * 
FROM Orders
WHERE OrderDate = '1996-07-04';

SELECT *
FROM OrderDetails
WHERE OrderID = 10248;

SELECT * 
FROM Products
WHERE ProductID IN (11, 42, 72);

-- '1996-07-04'에 주문된 상품명들 조회






