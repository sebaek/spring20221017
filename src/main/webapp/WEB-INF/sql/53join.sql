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

