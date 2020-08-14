Student Information Management System
=====================================


Title description
--------------------
This project is a student physical information management system implemented using Jsp + Sevlet + JavaBean, and its style uses LayUI front-end framework


Requirements description
------
  In order to realize the school's management of the basic information of students' health, the school is convenient to view, insert, delete and modify student information





Function description
-------
(1) Five different functions are realized through the left navigation bar

(2) Added student information: student ID, name, gender, age, height, weight, insertion of these six data

(3) The function of deleting student information through student ID is realized

(4) Query student information separately through student ID

(5) List all student information in the database

(6) Modify student information, including student ID, name, gender, age, height, weight

(7) Use layUI front-end framework to beautify icons, buttons and page transitions

![image](https://github.com/wys9853/Student-Information-Management-System/blob/master/image/1.png)




Design ideas
-----
(1) Jsp + Sevlet + JavaBean
JSP is responsible for human-computer interaction with users, Servlet is responsible for process control, and JavaBean is responsible for data manipulation.
Understandably, JSP acts as a view, Servlet acts as a controller, and JavaBeans acts as a model.

![image](https://github.com/wys9853/Student-Information-Management-System/blob/master/image/2.png)


(2)
1. View layer (JSP), front-end interaction, such as data during registration. Serlvet interacts with front-end data
2. Control layer (acting as a servlet): a bridge between model and view. This layer has business processing. User registration and login can be regarded as the user's business. We need to write related processing code to this layer. .
3. Model layer: realize the business logic of the system, namely javaBean, which is usually used to encapsulate the properties of objects, database connection operations, etc.

(3)
1. M layer: create com.dao and bean packages to achieve persistence, such as database connection, sql language
2. V layer: jsp file is used for front-end interaction, web page display data, user operation
3. Layer C: Servlet handles business functions, inserts, deletes and changes 


