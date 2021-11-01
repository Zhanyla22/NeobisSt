CREATE TABLE Users(
id int NOT NULL AUTO_INCREMENT,
user_name varchar(50) NOT NULL,
first_name varchar(50) NOT NULL,
last_name varchar(50) NOT NULL,
email varchar(50) NOT NULL,
PRIMARY KEY(id),
UNIQUE KEY UK_username(username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

