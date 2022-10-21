-- 날짜 시간

-- DATE : 날짜
-- DATETIME : 날짜 시간

CREATE TABLE myTable06 (
	col1 DATE, 
    col2 DATETIME
);
INSERT INTO myTable06 (col1, col2) 
VALUES ('2022-10-21', '2022-10-21 11:02:00');
SELECT * FROM myTable06;

-- DATE : java.sql.Date
-- DATETIME : java.sql.Timestamp 





