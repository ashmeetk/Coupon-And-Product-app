# Coupon-And-Product-app
Create coupons and products. Created coupons could be applied on the products for discount on prices. The details of a coupon could be found using a coupon code.

Functionalities that the app provides:
1. A coupon can be created by giving its code, discount and expiry date.
2. A coupon's details can be fetched by giving in the coupon code.
3. A product can be created by giving its name, description, price and coupon code. The coupon code applied will deduct the price of the product with the discount that it offers.

Structure of web application:
MVC design pattern is used to create this web application.
Model: Model and DAO classes represent the business logic which are used for setting up the connections with the database and perform 3 operations as stated under each DAO class:
ProductDAO: 1. Save the product details in the database
CouponDAO: 1. Save the coupon details 2. Fetch the coupon by the code

View: The main view of the app is represented using index.html. Out of 3 options stated one could be selected which will redirect to respective JSP.
Create Product: Clicking on this option will redirect to createProduct.jsp
Find Coupon: Clicking on this option will redirect to findCoupon.jsp
Create Coupon: Clicking on this option will redirect to createCoupon.jsp

Controller: 
2 servlets are created which intercepts all the requests and forwards them to the respective DAO's so that database CRUD operations could be performed. They also send back the html that should be displayed on the web browser.
The 2 servlets are:
product servlet: It intercepts the request when user clicks on submit button after entering all product details.
coupon servlet: It intercepts two requests, first when the user clicks on submit button after entering all coupon details, and secondly when wants to find all coupon details for a particular coupon code.

How to start the application?
Right click on the application in SpringToolSuite, click on run on server. index.html will be get displayed automatically in the web browser.

Tech: 
JSP, Servlets, JDBC

What did I learn?
1. How to create servlets and how do they intercept all client requests and forwards them to the business layer(DAO) so that operations can be performed on the database.
2. What is JDBC and how to establish connection with the mysql database
3. How to create JSPs and how they display information on the web browser.

Udemy course that helped creating this project:
JDBC Servlets and JSP - Java Web Development Fundamentals taught by Bharath Thippireddy
