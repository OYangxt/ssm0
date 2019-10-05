CREATE DATABASE ssmtest;

USE ssmtest;

CREATE TABLE account(
                      id INT(20) AUTO_INCREMENT PRIMARY KEY,
                      name VARCHAR(100) NOT NULL,
                      money FLOAT(50)
);

INSERT INTO account (name, money)
VALUES("Baron",1000000);

SELECT * FROM account;