CREATE TABLE order_product(
    id int AUTO_INCREMENT,
    person_id int,
    product_id int,
    order_date date,
    PRIMARY KEY(id));

ALTER TABLE order_product  ADD FOREIGN KEY (person_id) REFERENCES person(id);
ALTER TABLE order_product  ADD FOREIGN KEY (product_id) REFERENCES product(id);