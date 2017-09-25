package sensoremctrl.iotproject.paad.entities;

import com.opencsv.bean.CsvBindByName;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "temperature")
public class Temperature implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int temp_id;

    private int temperature;

    private Chart chart;

    public Temperature() {
    }

    public Temperature(int temperature) {
        this.temperature = temperature;
    }

    public Temperature(Chart chart) {
        this.chart = chart;
    }

    public Temperature(int temperature, Chart chart) {
        this.temperature = temperature;
        this.chart = chart;
    }



    public int getTemp_id() {
        return temp_id;
    }

    public void setTemp_id(int temp_id) {
        this.temp_id = temp_id;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    @ManyToOne
    @JoinColumn(name = "temp_nr")
    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "temperature=" + temperature +
                '}';
    }
}
