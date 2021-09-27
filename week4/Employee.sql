CREATE TABLE Employee(
    EmployeeId int NOT NULL UNIQUE,
    Product_id int,
    Person_id int,
    EmployeeName varchar(20),
    EmployeeLastName varchar(30),
    EmployeeDepartment varchar(20),
    EmployeeSalary int,
    EmployeeWorkExperienceYear int,
    PRIMARY KEY(EmployeeId),
    FOREIGN KEY(Product_id) REFERENCES Product(ProductId),
    FOREIGN KEY(Person_id) REFERENCES Person(PersonId)
   );

INSERT INTO `employee` (`EmployeeId`, `Product_id`, `Person_id`, `EmployeeName`, `EmployeeLastName`, `EmployeeDepartment`, `EmployeeSalary`, `EmployeeWorkExperienceYear`)
VALUES ('2', '1', '1', 'mehmet', 'mima', 'продавец', '20000', '3');