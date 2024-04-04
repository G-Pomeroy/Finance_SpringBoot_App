# Introduction
This Financial Management System is a web-based application designed to help users manage their financial transactions and investments. The system allows users to track their income, expenses, and investments, view graphical representations of their financial data, and submit new transactions and investments. Users can also assign different tags to each transaction to help track where they spend the most and give other useful insights.

# Features
## Transaction Management
o	Users can add, edit, and delete financial transactions, including income and expenses.
o	Each transaction includes fields for amount, category, tags, and date.
## Investment Management
o	Users can add and keep track of investment records.
o	Each investment record includes fields for amount, date of purchase, and description.
## Graphical Visualization
o	The system provides graphical representations of financial data, such as bar charts for expense categories and pie charts for transaction tags.
## Navigation Bar
o	A horizontal navigation bar is implemented for easy navigation across the application's pages.



## Technologies Used
•	Frontend: HTML, CSS, JavaScript, Chart.js
•	Backend: Spring Boot (Java)
•	Database: H2 Java SQL Database
•	REST API: Used to communicate between frontend and backend for CRUD operations on transactions and investments.

# Implementation Details
### Frontend
o	HTML pages are used for user interface layout and the core of the user experience.
o	CSS is used for styling and layout customization.
o	JavaScript is used for dynamic interactions, such as fetching data from the backend, form validation, rendering charts, and real-time updating of elements.
o	Chart.js library is used for creating graphical representations of financial data.
### Backend
o	Spring Boot framework is used to develop the backend REST API.
o	RESTful endpoints are implemented for handling CRUD operations on transactions and investments.
o	Data is stored and managed using a relational database, such as H2, accessed via Spring Data JPA.
# Database
The backend of our application relies on a relational database to store and manage transaction and investment data. We utilize an H2 database (SQL) to ensure data consistency, integrity, and scalability. Below is an overview of the database schema and the tables it contains:


## Schema Overview
Our database schema consists of two main tables: transactions and investments.
### Transactions Table
o	The transactions table stores information about financial transactions entered into the system.
o	Each transaction is uniquely identified by a transaction_id, which serves as the primary key.
o	The table includes fields for amount, date, category, and tags, providing detailed information about each transaction.
### Investments Table
o	The investments table records details about investment activities.
o	Like the transactions table, each investment has a unique identifier (investment_id) as the primary key.
o	Key fields in this table include amount, date, and description, allowing users to track investment activities along with associated information.

Our backend server interacts with the database through a data access layer, handling CRUD (Create, Read, Update, Delete) operations seamlessly. The server validates incoming requests, processes data accordingly, and executes SQL queries to manipulate data in the database.

### Conclusion
This Financial Management System provides users with a comprehensive toolset for managing their financial transactions and investments. By leveraging modern web technologies and a user-friendly interface, the system aims to empower users in making informed financial decisions and achieving their financial goals.
