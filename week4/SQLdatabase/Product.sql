CREATE TABLE product(
    id int AUTO_INCREMENT,
    name varchar(20) NOT NULL,
    brand_name varchar(20),
    cost int NOT NULL,
    PRIMARY KEY(id));

INSERT INTO `product` (`name`,`brand_name`, `cost`)
VALUES ('cola','coca-cola', '50');