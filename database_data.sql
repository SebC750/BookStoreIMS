create database ims_database;
use ims_database;
create table item(id int (5) not null, name varchar(100), price double(4,2),quantity int(4), primary key(id));
create table transactions(transaction_id int (5) not null, quantity int (4), item_id int (5), primary key(transaction_id), foreign key (item_id) references item(id)); 
create table stats(item_id int (5), numOfPurchases int (5), foreign key (item_id) references item(id));
insert into item(id,name,price,quantity) values(44444,"Science textbook",10.99,30);
insert into item(id,name,price,quantity) values(55555,"History textbook",10.99,40);
insert into item(id,name,price,quantity) values(77777,"Math textbook",12.99,20);
insert into item(id,name,price,quantity) values(91834,"St johns beanie",11.99,30);

insert into transactions(transaction_id, quantity,item_id) values(30000,1,44444);

insert into transactions(transaction_id, quantity,item_id) values(20000,2,55555);
insert into stats(item_id, numOfPurchases) values(44444,0);

insert into stats(item_id, numOfPurchases) values(77777,0);
insert into stats(item_id, numOfPurchases) values(55555,0);
insert into stats(item_id, numOfPurchases) values(91834,0);