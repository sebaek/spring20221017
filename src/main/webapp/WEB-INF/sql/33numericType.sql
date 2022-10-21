-- DATA TYPE
-- Numeric
-- INT : 정수
-- DEC : 소수점 있는 형식

USE mydb1;
CREATE TABLE myTable03 (
	col1 INT(3),
    col2 INT(4),
    col3 INT -- -21억 ~ +21억 (?)
);
INSERT INTO myTable03 (col1, col2, col3)
VALUES (999, 9999, 2100000000); -- ok
INSERT INTO myTable03 (col1, col2, col3)
VALUES (9999, 9999, 2100000000);
INSERT INTO myTable03 (col1, col2, col3)
VALUES (999, 9999, 4200000000); -- not ok
SELECT * FROM myTable03;






