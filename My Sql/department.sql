SELECT * FROM adidb.department;
CREATE TABLE `department` 
(
  `Dept_id` int(11) NOT NULL,
  `Dept_zone` varchar(20) NOT NULL,
  `Dept_block` varchar(20) NOT NULL,
  `Dept_name` varchar(45) NOT NULL
);

-- Dumping data for table `department`

INSERT INTO `department` (`Dept_id`, `Dept_zone`, `Dept_block`, `Dept_name`) VALUES
(1, 'South', 'A', 'CSE'),
(2, 'North', 'B', 'EC'),
(3, 'South', 'C', 'CSE'),
(4, 'North', 'D', 'CSE'),
(5, 'South', 'E', 'EC');


-- Indexes for table `department`
ALTER TABLE `department`
ADD PRIMARY KEY (`Dept_id`);


-- AUTO_INCREMENT for dumped tables

ALTER TABLE `department`
MODIFY `Dept_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;
-- Alter Table
ALTER TABLE department MODIFY Dept_zone VARCHAR(25);
-- Update 
UPDATE department SET Dept_block = 'E' WHERE Dept_id = 3 ;
-- Delete
DELETE FROM department WHERE Dept_id = 5;
-- Truncate Table
TRUNCATE TABLE department;
-- Drop Table
DROP TABLE department;
