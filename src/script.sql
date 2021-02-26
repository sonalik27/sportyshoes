create database sportyshoes;
use sportyshoes;

insert into user_type values(1, "ADMIN");
insert into user_type values(2, "CUSTOMER");
commit;

insert into user(user_id, user_name, user_email, login_name, password, usertype_id, contact_number) 
  values(1, "Sonali P", "sonali@gmail.com", "sonali_p", "sonali123", 1, 1111111111 );
  insert into user(user_id, user_name, user_email, login_name, password, usertype_id, contact_number) 
  values(2, "Pranali P", "pranali@gmail.com", "pranali_p", "pranali123", 2, 2222222222);
  insert into user(user_id, user_name, user_email, login_name, password, usertype_id, contact_number) 
  values(3, "Kripa T", "kripa@gmail.com", "kripa_t", "kripa123", 2, 3333333333);
  insert into user(user_id, user_name, user_email, login_name, password, usertype_id, contact_number) 
  values(4, "Seema S", "seema@gmail.com", "seema_s", "seema123", 2, 4444444444);
  insert into user(user_id, user_name, user_email, login_name, password, usertype_id, contact_number) 
  values(5, "Saloni K", "saloni@gmail.com", "saloni_k", "saloni123", 2, 5555555555);
commit;

insert into category values(1, "Running Shoes");
insert into category values(2, "Cross Trainers");
insert into category values(3, "Soccer Cleats");
commit;

insert into product(poduct_id, price, product_name,	category_id) values (7, 2000, "Adidas", 1);
insert into product(poduct_id, price, product_name,	category_id) values (9, 3000, "Puma", 1);
insert into product(poduct_id, price, product_name,	category_id) values (11, 4000, "Adidas", 2);
insert into product(poduct_id, price, product_name,	category_id) values (13, 5000, "SKECHER", 2);
insert into product(poduct_id, price, product_name,	category_id) values (15, 10000, "Nike", 3);
insert into product(poduct_id, price, product_name,	category_id) values (17, 4000, "Adidas", 3);
commit;

INSERT INTO `sportyshoes`.`purchase` (`purchase_id`, `price`,`purchase_date`, `user_id`) VALUES (1 , 100 , "21/01/2021", 2);
INSERT INTO `sportyshoes`.`purchase` (`purchase_id`, `price`,`purchase_date`, `user_id`) VALUES (2 , 100 , "21/02/2021", 3);
INSERT INTO `sportyshoes`.`purchase` (`purchase_id`, `price`,`purchase_date`, `user_id`) VALUES (3 , 100 , "21/02/2021", 4);
INSERT INTO `sportyshoes`.`purchase` (`purchase_id`, `price`,`purchase_date`, `user_id`) VALUES (4 , 200 , "21/03/2021", 2);
INSERT INTO `sportyshoes`.`purchase` (`purchase_id`, `price`,`purchase_date`, `user_id`) VALUES (5 , 200 , "21/03/2021", 3);
commit;

 Insert into product_purchase values (7,1);
 Insert into product_purchase values (7,2);
 Insert into product_purchase values (9,1);
 Insert into product_purchase values (9,3);
 Insert into product_purchase values (11,4);
 Insert into product_purchase values (13,5);
 commit;
 

