package sensoremctrl.iotproject.paad.DatabaseManagement.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "temperaturelogg")
public class TemperatureLogg implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int temperatureId;
    private int temperature;


    public TemperatureLogg() {
    }

    public TemperatureLogg(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperatureId() {
        return temperatureId;
    }

    public void setTemperatureId(int temperatureId) {
        this.temperatureId = temperatureId;
    }

    @Override
    public String toString() {
        return "TemperatureLogg{" +
                "temperature=" + temperature +
                '}';
    }
}
