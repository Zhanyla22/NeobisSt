CREATE TABLE Person(
    PersonId int NOT NULL UNIQUE,
    PersonAge int NOT NULL,
    PersonName varchar(20) NOT NULL,
    PersonCity varchar(30) NOT NULL,
    PRIMARY KEY(PersonId)
);
INSERT INTO `person` (`PersonId`, `PersonAge`, `PersonName`, `PersonCity`)
VALUES ('1', '18', 'Zhanylai', 'Bishkek');