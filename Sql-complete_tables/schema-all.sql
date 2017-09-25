USE sensordb;

DROP TABLE IF EXISTS temperature;
CREATE TABLE temperature
(
temp_id INT NOT NULL AUTO_INCREMENT,
temp_nr INT,
temperature INT,
PRIMARY KEY(temp_id),
CONSTRAINT FOREIGN KEY (temp_nr) REFERENCES chart(chart_id) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE INDEX IX_temperature_temp_nr ON temperature(temp_nr);

DROP TABLE IF EXISTS humidity;
CREATE TABLE humidity
(
humi_id INT NOT NULL AUTO_INCREMENT,
humi_nr INT,
humidity INT,
PRIMARY KEY(humi_id),
CONSTRAINT FOREIGN KEY (humi_nr) REFERENCES chart(chart_id) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE INDEX IX_humidity_humi_nr ON humidity(humi_nr);

DROP TABLE IF EXISTS chart;
CREATE TABLE chart
(
chart_id INT NOT NULL AUTO_INCREMENT,
clockdate VARCHAR(30),
PRIMARY KEY(chart_id)
);
CREATE INDEX IX_chart_dateAndTime ON chart(dateAndTime);

SELECT * FROM chart;
SELECT * FROM temperature;

