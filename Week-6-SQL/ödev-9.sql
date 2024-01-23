--1.SELECT country,city from city 
--INNER JOIN country ON country.country_id=city.city_id;

--2.SELECT payment_id,first_name,last_name from customer
--INNER JOIN payment ON payment.customer_id=customer.customer_id;


--3.SELECT payment_id,first_name,last_name from customer
--INNER JOIN payment ON payment.customer_id=customer.customer_id;


SELECT rental_id,first_name,last_name from customer
INNER JOIN rental ON rental.customer_id=customer.customer_id;




