CREATE TABLE users_reg(
    id int NOT NULL AUTO_INCREMENT,
    username varchar(100) NOT NULL,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL,
    email varhcar(50) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY UK_username (username)
)