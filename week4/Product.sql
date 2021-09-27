CREATE TABLE Product(
    ProductId int NOT NULL UNIQUE AUTO_INCREMENT,
    PersonId int,
    ProductName varchar(20) NOT NULL,
    ProductCost int NOT NULL,
    PRIMARY KEY(PersonId),
    FOREIGN KEY(PersonId) REFERENCES Person(PersonId)
);

INSERT INTO `product` (`ProductId`, `PersonId`, `ProductName`, `ProductCost`)
VALUES ('1', '1', 'cola', '50');