package sensoremctrl.iotproject.paad.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "HumidityLog")
public class HumidityLog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int humidityId;


    private int humidity;

    private SensorChart chart;

    public HumidityLog() {
    }

    public HumidityLog(SensorChart chart) {
        this.chart = chart;
    }

    public HumidityLog(int humidity) {
        this.humidity = humidity;
    }

    public HumidityLog(int humidity, SensorChart chart) {
        this.humidity = humidity;
        this.chart = chart;
    }

    public int getHumidityId() {
        return humidityId;
    }

    public void setHumidityId(int humidityId) {
        this.humidityId = humidityId;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @ManyToOne
    @JoinColumn(name = "HumidityNr")
    public SensorChart getSensorChart() {
        return chart;
    }

    public void setSensorChart(SensorChart chart) {
        this.chart = chart;
    }

    @Override
    public String toString() {
        return "HumidityLog{" +
                "humidity=" + humidity +
                '}';
    }
}
