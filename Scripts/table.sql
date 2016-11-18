DROP SCHEMA public CASCADE;
CREATE SCHEMA public;
CREATE TABLE movie
( movie_id SERIAL,
 title varchar(50) NOT NULL,
 length varchar(30),
 PRIMARY KEY (movie_id)
 );
  CREATE TABLE hall
 (hall_id SERIAL,
 rowCount integer,
 rowLength integer,
 totalSeats integer,
 name varchar(20),
  PRIMARY KEY(hall_id)
 );
CREATE TABLE customer
 ( customer_id SERIAL,
 name varchar(50) NOT NULL,
 phoneNr varchar(20),
 PRIMARY KEY (customer_id) 
 );
  CREATE TABLE orders
 (order_id SERIAL,
 customer integer references customer(customer_id),
  PRIMARY KEY (order_id)
 );
  CREATE TABLE showing
 (showing_id SERIAL,
  movie integer REFERENCES movie(movie_id) NOT NULL,
  hall integer REFERENCES hall(hall_id) NOT NULL,
  PRIMARY KEY(showing_id)
 );
  CREATE TABLE ticket
 (ticket_id SERIAL,
 rowNo integer NOT NULL,
 seatNo integer NOT NULL,
 orders integer references orders(order_id)NOT NULL,
  showing integer REFERENCES showing(showing_id)NOT NULL,
  PRIMARY KEY(ticket_id)
 );


  
 INSERT INTO hall(rowCount, rowLength, totalSeats, name) VALUES
 ('14','20','280','Sal 1'),
 ('8','12','96','Sal 2'),
 ('8','6','48','Sal 3'
 );
INSERT INTO movie(title, length) VALUES
('film 1', '105 minutter'),
('film 2', '105 minutter'),
('film 3', '105 minutter'),
('film 4', '105 minutter'),
('film 5', '105 minutter'),
('film 6', '105 minutter'),
('film 7', '105 minutter'),
('film 8', '105 minutter'),
('film 9', '105 minutter'),
('film 10', '105 minutter');
INSERT INTO customer(name, phoneNr) VALUES
('Jensen','12342678'),
('Jens','12345678');
INSERT INTO orders(customer) VALUES
('1'),
('2');
INSERT INTO showing(movie, hall) VALUES
('1','1');
INSERT INTO ticket(rowNo, seatNo, orders, showing) VALUES
('3', '2','1','1'),
('3', '3','1','1'),
('3', '4','1','1'),
('3', '5','1','1'),
('3','6','2','1');


SELECT * FROM customer, ticket WHERE customer_id = ticket.orders