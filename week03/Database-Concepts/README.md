# SQL-DataBase-Fundamentals
This Repo Contains fundamental knowledge of RDBMS You Need to Know
<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#Database">Database</a>
      <ul>
        <li><a href="#Why-to-use-DB-over-normal-files">Database vs NormalFiles</a></li>
      </ul>
    </li>
    <li>
      <a href="#Database-componenets">Database componenets</a>
      <ul>
        <li><a href="#schema">Schema</a></li>
        <li>
          <a href="#tables">Tables</a>
          <ul>
            <li><a href="#Table-Partitioning">Table Partitioning</a></li>
            <li><a href="#Trigger">Trigger</a></li>
          </ul>
        </li>
        <li><a href="#indexing">Indexing</a></li>
        <li><a href="#database-relations">Database Relations</a></li>
        <li>
          <a href="#query">Query</a>
          <ul>
            <li><a href="#Query-Binding">Query Binding</a></li>
            <li><a href="#Query-Unbinding">Query Unbinding</a></li>
            <li><a href="#SQL-Injection">SQL Injection</a></li>
          </ul>
        </li>
      </ul>
    </li>
  </ol>
</details>

# DataBase
It is a structured collection of data that is organized and stored in a way that allows for efficient 
retrieval, manipulation, and management of information.
## Why to use DB over normal files
 ### a) Data Integrity and Consistency
Databases provide mechanisms for defining constraints and rules that ensure data integrity and consistency. Constraints like primary keys, foreign keys, and unique constraints prevent the insertion of duplicate or inconsistent data.
 ### b) Index 
Databases utilize indexes to speed up data retrieval operations, making queries more efficient, even with large datasets.
 ### c) Data Relationships and Joins 
Databases support the establishment of relationships between tables through foreign keys.
 ### d) Data Backup and Recovery
Databases often offer built-in backup and recovery features, ensuring that critical data is protected from loss due to hardware failures, accidental deletions, or disasters.
 ### e) Data Security
Databases offer built-in security features that allow administrators to control access to the data at different levels.
# Database componenets
## Schema
The database schema defines the structure of the database, including the tables, their columns, Views and Procedures, It acts as a blueprint for organizing the data.
## Tables
Data in a database is organized into tables, which are composed of rows and columns. Each row represents a single record or data entry, and each column represents a specific attribute or field of the data.
Primary Key: One or more columns in a table can be designated as the primary key. 
#### The primary key uniquely identifies each row in the table, ensuring that no two rows have the same identifier.
### Table Partitioning
Table partitioning allows you to store the data of a table in multiple physical sections or partitions. Each partition has the same columns but different set of rows, we use table partitioning for large tables to improve query performance. 
### Trigger
Triggers are associated with a particular table and are activated when certain operations (insert, update, delete) are performed on that table. When the triggering event occurs, the trigger's code is executed, allowing you to perform additional actions, validations, or modifications before or after the actual data operation takes place, it has 2 main types Before Triggers(pre-triggers) and After Triggers(post-triggers).
Triggers are helpful for maintaining data integrity, enforcing business rules, and automating actions that need to be performed consistently whenever certain data changes occur.
###### When implementing triggers, it is essential to consider their performance impact and potential side effects carefully. 
## Indexing 
Databases often automatically create indexes for certain columns in a table. Indexes enhance the performance of data retrieval operations ex: primary key and foreign key.
The most common type of index is the "B-tree" (Balanced Tree) index, which is used for typical indexing needs. There are also other specialized index types like bitmap indexes, hash indexes, and full-text indexes, each suited for specific use cases.
### Indexing Trade-offs
it requires additional disk space and resources. Also, when data is inserted, updated, or deleted in the table, the corresponding changes must be applied to the index which make write operations more slower.
## Database Relations
Relations define how different tables in the database are related to each other. These relationships are established through foreign keys.
#### Foreign key is a column or a set of columns in a table that establishes a relationship with the primary key of another table.
### Types of Relations
One-to-One Relationship: each record in one table is related to at most one record in another table, it's used to split a table with many columns into two separate tables ex: Employee and EmployeeProfile.
![image](https://github.com/elsayedzahran/SQL-DataBase-Fundamentals/assets/68614758/142f12fb-88e0-4d47-8db0-b67672f0a3ea)
One-to-Many Relationship: each record in one table can be related to one or more records in another table. This is the most common type of relationship in relational databases ex: Employee and Department.
![image](https://github.com/elsayedzahran/SQL-DataBase-Fundamentals/assets/68614758/1847f036-ff09-470d-9f95-439dd5e3f954)

Many-to-Many Relationship: each record in one table can be related to multiple records in another table, and vice versa. To represent a many-to-many relationship in a relational database, a junction table (also called a linking or associative table) is used ex: Student and Course.
![image](https://github.com/elsayedzahran/SQL-DataBase-Fundamentals/assets/68614758/5237d8c3-9258-487b-93b5-df38af5af132)
![image](https://github.com/elsayedzahran/SQL-DataBase-Fundamentals/assets/68614758/485ce88b-f3f3-4665-af98-dd750b02d02c)
## Query
It is a request or command sent to the database management system (DBMS) to retrieve, manipulate, or manage data. Queries allow users and applications to interact with the database and perform various operations on the stored data.
#### Query Binding
Query binding (Parameter Binding) refers to the process of associating parameters (placeholders) in a prepared SQL statement with specific values. Instead of directly inserting the values into the SQL query  (usually denoted by "?" or ":parameter_name").

![image](https://github.com/elsayedzahran/SQL-DataBase-Fundamentals/assets/68614758/f2f41795-9a99-4331-be15-a7c51c0e15cd)

#### Query Unbinding
Query unbinding (Parameter Unbinding), on the other hand, refers to the process of removing the association between parameters and their values from a prepared statement.

#### SQL Injection 
The goal of an SQL injection attack is to manipulate the application's SQL query in a way that allows unauthorized access to the database or performs unintended operations on the database, such as viewing, modifying, or deleting data example: if attecker Enter ' OR '1'='1 in the input this query:
###### SELECT * FROM users WHERE username = 'input_username' AND password = 'input_password';
will become
###### SELECT * FROM users WHERE username = '' OR '1'='1' AND password = 'input_password';
