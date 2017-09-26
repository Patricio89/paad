DROP DATABASE IF EXISTS sensordb;
CREATE DATABASE sensordb;
USE sensordb;

CREATE TABLE Account(
  UserID INT AUTO_INCREMENT,
  FirstName VARCHAR(20) NOT NULL,
  LastName VARCHAR(20),
  Email VARCHAR(50) NOT NULL,
  Password VARCHAR(50) NOT NULL,
  Admin BOOL DEFAULT FALSE,
  PRIMARY KEY (UserID)
);

CREATE TABLE TemperatureLogg(
  TemperatureID INT AUTO_INCREMENT DEFAULT 10,
  Temperature INT NOT NULL,
  PRIMARY KEY (TemperatureID)
);

CREATE TABLE HumidityLogg(
  HumidityID INT AUTO_INCREMENT DEFAULT 100,
  Humidity INT,
  PRIMARY KEY (HumidityID)
);

CREATE TABLE SensorChart(
  SensorID INT AUTO_INCREMENT DEFAULT 1000,
  Date_and_Time DATETIME NOT NULL,
  Humidity_ID INT,
  Temperature_ID INT,
  PRIMARY KEY (SensorID),
  FOREIGN KEY (Temperature_ID)
    REFERENCES TemperatureLogg(TemperatureID),
  FOREIGN KEY (Humidity_ID)
    REFERENCES HumidityLogg(HumidityID)
);