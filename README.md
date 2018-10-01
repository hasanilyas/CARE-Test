# CARE-Test

# Building WareHouse Management System Using Spring, Angular & MySQL
This Documentation will walk you through the Steps to Run the Project

# frontend Folder
Frontend Folder Contains Angular part of the project
# What You'll Need
 # Node:  
        You need to install node_module in frontend folder and must run the server on port 4200
 # FontAwesome:
              Use the following Command to install Font awesome
          ==> npm install --save font-awesome angular2-fontawesome
 # BootStrap: 
             Use the Following command TO install Bootstrap
          ==> npm install bootstrap 
      
      
 # CARETEST
 CARETEST Folder contains the backend of the Application
 
 # What You'll Need
 MySQL version 5.6 or later
 Maven 3.2
 # You might need eclipse 2018-09 because backend is build using Spring Tool Suite 4 which is only compatiable with Eclipse 2018-09
 
 # MySQL Connection 
 First Create the Schema with name of your own choice.
 Go to to path 
          ==> src/main/resources/application.properties
  and change the following code
  
        spring.datasource.url = jdbc:mysql://localhost:3306/db_NAME      //write database name 
        spring.datasource.username =           //Your username
        spring.datasource.password = 	       //Yor Password
   
   # Once you do the above changes run the Angular frontend app on localhost:4200 using the command 
                          ==> ng serve --open
  # And spring app on localhost:8080 using spring build or maven build
             Note for Maven build: 
                    write "spring-boot:run" in goals while running app through maven build
 
