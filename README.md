# paad
Lia 1 Project: SensoremCtrl

## Motivation:
Inhouse Project for B3IT Innovation AB - Requested by supervisors Johnne Adermark & Kenneth Andersson,
as an internship assignment.
- Gather data from a raspberry pi device with a attached SenseHat sensor.
- This application retrives 3 data values: temperature, relative humidity and timestamp.
- If the database directory doesn't contain a DDL, this application will generate the tables that is needed.
- Store data to a mysql database.
- Retrive data from supervised data table (Database) to be controlled.
As the file gets generated or modified, this application will during the retrieval of new data, also make a controll of the supervised values. 


## Build status:
One time interation of the application - Functional.
Dynamic solution - failing.
Generation of DDL towards DB location (If non existent) - Functional
Mail notification if controlled values are met - failing.
Parsing .CSV values and store these into local lists - Functional.
.CSV Listener OnModify + OnCreate - Functional (Logics need to be fixed).
Hibernate Interceptor (Database Listener) - failing.
Manual functionality with dynamic implementation (missing mapping & db listener). 


## Code style:
Standard

Tech/framework used:
Spring-Boot
Hibernate
Spring-JPA 
OpenCSV Library
Spring-Mail


## Installation:
Build and deploy to desired device e.g. Rasperry PI.

## API Reference:

## Tests:
<b>None.</b>

## How to use?
Deploy current build before use.

Modify properties file ->
Edit directory for database & .csv directory for retrieval of data (Manually).
Application will parse and store temperature and relative humidity data towards directed database (MySQL).
------
Application will generate the DDL towards the directory of your database.


## Contribute:
Dynamic implementation such as a working listener for desired database table and how to trigger a iteration of the application 
for the .CSV listener. 

## Credits:
* Adrian Wieslander - Junior Software Developer/Student
* Patricio Morales - Junior Software Developer/Student

License:
* Intern - Software Developer (Student) © [Patricio Morales](https://github.com/Patricio89)
* Intern - Software Developer (Student) © [Adrian Wieslander](https://github.com/AdrWie)
* B3IT Innovation AB © [Johnne Adermark]()
* B3IT Innovation AB © [Kenneth Andersson]()
