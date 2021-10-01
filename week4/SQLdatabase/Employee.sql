CREATE TABLE employee(
    id int AUTO_INCREMENT,
    name varchar(20),
    last_name varchar(30),
    department varchar(20),
    salary int,
    work_experience_year int,
    PRIMARY KEY(id)
);

INSERT INTO `employee` ( `name`, `last_name`, `department`, `salary`, `work_experience_year`)
VALUES ('mehmet', 'mima', 'продавец', '20000', '3');