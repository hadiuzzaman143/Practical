SELECT * FROM adidb.employee;
CREATE TABLE `employee` 
(
  `emp_id` int(11) NOT NULL,
  `emp_name` varchar(50) NOT NULL,
  `emp_age` varchar(20) NOT NULL,
  `emp_dept` varchar(45) NOT NULL
);

-- Dumping data for table `employee`

INSERT INTO `employee` (`emp_id`, `emp_name`, `emp_age`, `emp_dept`) VALUES
(1, 'Hadiuz', '22', 'CSE'),
(2, 'Emtiar', '21', 'CST'),
(3, 'Sonkhojit', '23', 'CSE'),
(4, 'Sayan', '22', 'EC'),
(5, 'Adi', '23', 'CSE');

-- Indexes for dumped tables

-- Indexes for table `employee`

ALTER TABLE `employee`
ADD PRIMARY KEY (`emp_id`);

-- AUTO_INCREMENT for table `employee`

ALTER TABLE `employee`
MODIFY `emp_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

ALTER TABLE employee MODIFY emp_name VARCHAR(25);
-- Update 
UPDATE employee SET emp_name = 'E' WHERE emp_id = 3 ;
-- Delete
DELETE FROM employee WHERE emp_id = 2;
-- Truncate Table
TRUNCATE TABLE employee;
-- Drop Table
DROP TABLE employee;