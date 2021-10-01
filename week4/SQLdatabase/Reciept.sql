CREATE TABLE reciept(
    id int AUTO_INCREMENT ,
    person_id int,
    employee_id int,
    product_id int,
    sale_date date,
    PRIMARY KEY(id));

ALTER TABLE reciept  ADD FOREIGN KEY (person_id) REFERENCES person(id);
ALTER TABLE reciept  ADD FOREIGN KEY (employee_id) REFERENCES employee(id);
ALTER TABLE reciept  ADD FOREIGN KEY (product_id) REFERENCES product(id);