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
SELECT p.ProductName
FROM Orders o JOIN OrderDetails d ON o.OrderID = d.OrderID
              JOIN Products p ON d.ProductID = p.ProductID
WHERE o.OrderDate = '1996-07-04';






