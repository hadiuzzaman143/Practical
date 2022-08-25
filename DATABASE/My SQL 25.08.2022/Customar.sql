SELECT * FROM customar_db.customar;
CREATE TABLE `customar` 
(
  `Cust_id` varchar(5) NOT NULL,
  `Fname` varchar(15) NOT NULL,
  `Lname` varchar(15) NOT NULL,
  `Area` char(2) NOT NULL,
  `Phone` varchar(10) NOT NULL,
  `DOB` date NOT NULL,
  `Payment` varchar(8) NOT NULL
);

-- Dumping data for table `customar`

INSERT INTO `customar` (`Cust_id`, `Fname`, `Lname`, `Area`, `Phone`, `DOB`, `Payment`) VALUES
('A01', 'Ivan', 'Ross', 'SA', '6125467', '1986-06-15', '800.50'),
('A02', 'Vandana', 'Ray', 'MU', '5560379', '1987-12-20', '1000.75'),
('A03', 'Pramada', 'Jauguste', 'DA', '4560389', '1967-07-25', '500.00'),
('A04', 'Basu', 'Navindi', 'BA', '6125401', '1956-03-30', '860.00'),
('A05', 'Rabi', 'Shridhar', 'NA', 'null', '1989-02-15', '500.50'),
('A06', 'Rukmini', 'Aiyer', 'GH', '5125274', '1987-07-23', '1500.50');

-- Indexes for table `customar`

ALTER TABLE `customar`
ADD PRIMARY KEY (`Cust_id`);
COMMIT;

-- create a table and adding column
SELECT * FROM customar_db.customar;
CREATE TABLE CUSTOMER_DB(Cust_id varchar(5), Fname varchar(15), Lname VARCHAR(15), Area CHAR(2), Phone numeric(10), DOB VARCHAR(20), Payment numeric(6,2));

SELECT * FROM customar_db.customar;

-- insert values in columns
INSERT INTO customer_db VALUE('A01', 'Ivan', 'Ross', 'SA', 6125467,'15-jan-86', 800.50);
INSERT INTO customer_db VALUE('A02', 'Vandana', 'Ray', 'MU', 5560379,'20-dec-87', 1000.75);
INSERT INTO customer_db VALUE('A03', 'Pramada', 'Jauguste', 'DA', 4560389,'25-jul-67', 500.00);
INSERT INTO customer_db VALUE('A04', 'Basu ', 'Navindi', 'BA', 6125401 ,'30-feb-56', 860.00);
INSERT INTO customer_db VALUE('A05', 'Ravi', 'Shridhar', 'NA', null,'15-feb-89', 500.50);
INSERT INTO customer_db VALUE('A06', 'Rukmini', 'Aiyer', 'GH', 5125274,'23-jul-87', 1500.50);

SELECT * FROM customar_db.customar;

-- add new column
ALTER TABLE customer_db ADD COLUMN `SYS_DATE` DATE AFTER `Payment`;

-- update the columns by order
update customer_db set PHONE = 758528 where CUST_ID = 'A02';
update customer_db set PHONE = 988528 where CUST_ID = 'A05';

SELECT * FROM practice_set.customer_demo;

-- update the columns by order
update customer_db set DOB = '17-AUG-83' where CUST_ID = 'A03';
update customer_db set DOB = '21-JUN-89' where CUST_ID = 'A05';

-- delete the columns by order
delete FROM customer_db where CUST_ID = 'A01';
delete FROM customer_db where CUST_ID = 'A05';

-- delete all coumns
TRUNCATE TABLE customer_db;

-- insert values in columns
INSERT INTO customer_db VALUE('B01', 'Ratan', 'Ross', 'SA', 6125467,'15-jan-86', 800.50, '1996-01-15' );
INSERT INTO customer_db VALUE('B02', 'Vivek', 'Ray', 'MU', 5560379,'20-dec-87', 1000.75, '1997-12-20');
INSERT INTO customer_db VALUE('B03', 'Pratim', 'Jauguste', 'DA', 4560389,'25-jul-67', 500.00, '1997-07-25');
INSERT INTO customer_db VALUE('B04', 'Bina', 'Navindi', 'BA', 6125401 ,'30-feb-56', 860.00, '1996-02-15');
INSERT INTO customer_db VALUE('B05', 'Ratul', 'Shridhar', 'NA', null,'15-feb-89', 500.50, '1990-12-25');
INSERT INTO customer_db VALUE('B06', 'Smita', 'Aiyer', 'GH', 5125274,'23-jul-87', 1500.50, '1996-08-15');

SELECT * FROM customar_db.customar;

-- delete column by order
delete FROM customer_db where CUST_ID = 'B05';

SELECT * FROM customar_db.customar;
