CREATE TABLE person(
    id int AUTO_INCREMENT,
    age int NOT NULL,
    name varchar(20) NOT NULL,
    city varchar(30) NOT NULL,
    PRIMARY KEY(id)
);
INSERT INTO `person` (`age`, `name`, `city`)
VALUES ('18', 'Zhanylai', 'Bishkek');