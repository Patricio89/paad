

DROP TABLE IF EXISTS SensorChart;
CREATE TABLE SensorChart
(
  SensorId INT NOT NULL AUTO_INCREMENT,
  Date_And_Time DATETIME,
  PRIMARY KEY(SensorId)
);
CREATE INDEX IX_SensorChart_Date_And_Time ON SensorChart(Date_And_Time);


DROP TABLE IF EXISTS TemperatureLog;
CREATE TABLE TemperatureLog
(
TemperatureId INT NOT NULL AUTO_INCREMENT,
TemperatureNr INT,
Temperature INT,
PRIMARY KEY(TemperatureId),
FOREIGN KEY (TemperatureNr) REFERENCES SensorChart(SensorId) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE INDEX IX_Temperature_Temperature ON TemperatureLog(TemperatureNr);


DROP TABLE IF EXISTS HumidityLog;
CREATE TABLE HumidityLog
(
HumidityId INT NOT NULL AUTO_INCREMENT,
HumidityNr INT,
Humidity INT,
PRIMARY KEY(HumidityId),
FOREIGN KEY (HumidityNr) REFERENCES SensorChart(SensorId) ON UPDATE CASCADE ON DELETE CASCADE
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

