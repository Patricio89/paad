
DROP TABLE SupervisedData;
CREATE TABLE SupervisedData(
  Email VARCHAR(100),
  Temperature INT DEFAULT NULL,
  Humidity INT DEFAULT NULL,
  PRIMARY KEY (Email)
);

DROP TABLE TemperatureLogg;
CREATE TABLE TemperatureLogg(
  TemperatureID INT AUTO_INCREMENT,
  Temperature INT NOT NULL,
  SensorID BINARY(16),
  PRIMARY KEY (TemperatureID)
);

DROP TABLE HumidityLogg;
CREATE TABLE HumidityLogg(
  HumidityID INT AUTO_INCREMENT,
  Humidity INT NOT NULL,
  SensorID BINARY(16),
  PRIMARY KEY (HumidityID)
);

DROP TABLE DateAndTimeLogg;
CREATE TABLE DateAndTimeLogg(
  TimeStampID INT AUTO_INCREMENT,
  TimeStamp DATETIME NOT NULL,
  SensorID BINARY(16),
  PRIMARY KEY (TimeStampID)
);

DROP TABLE SensorChart;
CREATE TABLE SensorChart (
  ChartID        INT AUTO_INCREMENT,
  temperature_ID INT,
  humidity_ID    INT,
  TimeStamp_ID   INT,
  PRIMARY KEY (ChartID)
);
--   FOREIGN KEY (temperature_ID)
--   REFERENCES TemperatureLogg(TemperatureID) ON DELETE CASCADE ,
--
--   FOREIGN KEY (humidity_ID)
--   REFERENCES HumidityLogg(HumidityID) ON DELETE CASCADE ,
--
--   FOREIGN KEY (TimeStamp_ID)
--   REFERENCES DateAndTimeLogg(TimeStampID) ON DELETE CASCADE
-- );
-- CREATE INDEX IX_SortByID ON SensorChart(ChartID, temperature_ID, humidity_ID, TimeStamp_ID);
SELECT * FROM TemperatureLogg;