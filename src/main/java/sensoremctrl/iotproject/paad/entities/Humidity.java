package sensoremctrl.iotproject.paad.entities;

import com.opencsv.bean.CsvBindByName;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "humidity")
public class Humidity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int humi_id;


    private int humidity;

    private Chart chart;

    public Humidity() {
    }

    public Humidity(Chart chart) {
        this.chart = chart;
    }

    public Humidity(int humidity) {
        this.humidity = humidity;
    }

    public Humidity(int humidity, Chart chart) {
        this.humidity = humidity;
        this.chart = chart;
    }

    public int getHumi_id() {
        return humi_id;
    }

    public void setHumi_id(int humi_id) {
        this.humi_id = humi_id;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @ManyToOne
    @JoinColumn(name = "humi_nr")
    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    @Override
    public String toString() {
        return "Humidity{" +
                "humidity=" + humidity +
                '}';
    }
}
