# 183. Customers Who Never Order

#### Table: Customers
![image](https://user-images.githubusercontent.com/97871497/189471607-d389c5a7-eb27-4417-9eb3-665328b7bed4.png)
#### Table: Orders
![image](https://user-images.githubusercontent.com/97871497/189471620-51db4969-c6ef-4d90-9b1e-aa8c2cf34f61.png)

#### Write an SQL query to report all customers who never order anything.

#### Question
![image](https://user-images.githubusercontent.com/97871497/189471634-b900badc-8736-486b-ae5c-7d8a017d0872.png)
```
SELECT name AS 'Customers' FROM Customers 
WHERE id != ALL(SELECT customerId FROM Orders)
```

# 584. Find Customer Referee

#### Table: Customers
![image](https://user-images.githubusercontent.com/97871497/189471676-8f24f0f9-10a5-48d6-8f6a-579017d3ac04.png)
#### Write an SQL query to report the names of the customer that are not referred by the customer with id = 2.

#### Question
![image](https://user-images.githubusercontent.com/97871497/189471708-169f6c3f-4aaf-440c-9db0-8fba0c69d4a9.png)
```
SELECT name FROM Customer 
WHERE referee_id != 2 OR referee_id is NULL
```

# 595. Big Countries

#### Table: World
![image](https://user-images.githubusercontent.com/97871497/189471798-6d9d1b82-33a1-45a5-abf8-788ea74742fc.png)
#### A country is big if:
##### it has an area of at least three million (i.e., 3000000 km2), or
##### it has a population of at least twenty-five million (i.e., 25000000).

#### Write an SQL query to report the name, population, and area of the big countries.

#### Question
![image](https://user-images.githubusercontent.com/97871497/189471832-5a1ba74c-f78c-4d62-b896-ee38e56fbf47.png)
```
SELECT name, population, area FROM World
WHERE area >= 3000000
OR population >= 25000000
```

# 1757. Recyclable and Low Fat Products

#### Table: Products
![image](https://user-images.githubusercontent.com/97871497/189471737-bf8b3eb9-7cf9-455a-9b74-1bcf84f762ae.png)
#### Write an SQL query to find the ids of products that are both low fat and recyclable.

#### Question
![image](https://user-images.githubusercontent.com/97871497/189471755-2f63b577-90a2-4457-82b3-6f895e1dbbbf.png)
```
SELECT product_id FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y' 
```
