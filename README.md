# paad
Lia 1 Project: SensoremCtrl

Motivation:
Inhouse Project for B3IT Innovation AB - Requested by supervisors Johnne Adermark & Kenneth Andersson,
as an internship assignment.
- Gather data from a raspberry pi device with a attached SenseHat sensor.
- If the database directory doesn't contain a DDL, this application will generate the tables that is needed.
- This application retrives 3 data values: temperature, relative humidity and timestamp.
- Store data to a mysql database.
- Retrive data from supervised data table (Database) to be controlled.
As the file gets generated or modified, this application will during the retrieval of new data, also make a controll of the supervised values. 


Build status:
Generating a DDL 
Manual functionality with dynamic implementation (missing mapping & db listener). 


Code style:
Standard

Tech/framework used:
Spring-Boot
Hibernate
Spring-JPA 
OpenCSV Library
Spring-Mail


Installation:
Build and deploy to desired device e.g. Rasperry PI.

API Reference:

Tests:
None.

How to use?
Deploy current build before use.

Modify .properties file ->
Edit directory for database & .csv directory for retrieval of data (Manually).
Application will parse and store temperature and relative humidity data towards directed database (MySQL).
------
Application will generate the DDL towards the directory of your database.


Contribute:
Credits:
Fully developed by:
Adrian Wieslander - Junior Software Developer/Student - Github: https://github.com/AdrWie
Patricio Morales - Junior Software Developer/Student - Github: https://github.com/Patricio89

License:
© Patricio Morales.
© Adrian Wieslander.
B3IT Innovation AB © Johnne Adermark.
B3IT Innovation AB © Kenneth Andersson.
