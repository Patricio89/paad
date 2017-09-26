package sensoremctrl.iotproject.paad.DatabaseManagement.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Temperature")
public class TemperatureLog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int temperatureId;

    private int temperature;

    private SensorChart chart;

    public TemperatureLog() {
    }

    public TemperatureLog(int temperature) {
        this.temperature = temperature;
    }

    public TemperatureLog(SensorChart chart) {
        this.chart = chart;
    }

    public TemperatureLog(int temperature, SensorChart chart) {
        this.temperature = temperature;
        this.chart = chart;
    }



    public int getTemperatureId() {
        return temperatureId;
    }

    public void setTemperatureId(int temperatureId) {
        this.temperatureId = temperatureId;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    @ManyToOne
    @JoinColumn(name = "TemperatureNr")
    public SensorChart getSensorChart() {
        return chart;
    }

    public void setSensorChart(SensorChart chart) {
        this.chart = chart;
    }

    @Override
    public String toString() {
        return "TemperatureLog{" +
                "temperature=" + temperature +
                '}';
    }
}
