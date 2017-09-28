DROP DATABASE IF EXISTS sensordb;
CREATE DATABASE sensordb;

DROP TABLE IF EXISTS DateAndTimeLog;
CREATE TABLE DateAndTimeLog
(
  TimeStampId INT NOT NULL AUTO_INCREMENT,
  TimeStamp DATETIME,
  PRIMARY KEY(TimeStampId)
);
CREATE INDEX IX_DateAndTimeLog_TimeLog ON DateAndTimeLog(TimeStamp);


DROP TABLE IF EXISTS TemperatureLog;
CREATE TABLE TemperatureLog
(
TemperatureId INT NOT NULL AUTO_INCREMENT,
Temperature INT,
PRIMARY KEY(TemperatureId)
);
CREATE INDEX IX_Temperature_Temperature ON TemperatureLog(Temperature);


DROP TABLE IF EXISTS HumidityLog;
CREATE TABLE HumidityLog
(
HumidityId INT NOT NULL AUTO_INCREMENT,
Humidity INT,
PRIMARY KEY(HumidityId)
);
CREATE INDEX IX_Humidity_Humidity ON HumidityLog(Humidity);


DROP TABLE IF EXISTS Account;
CREATE TABLE Account
(
UserId INT NOT NULL AUTO_INCREMENT,
FirstName VARCHAR(20),
LastName VARCHAR(20),
Email VARCHAR(50),
UserPassword VARCHAR(50),
Admin BOOLEAN,
PRIMARY KEY(UserId)
);
