package sensoremctrl.iotproject.paad.DatabaseManagement.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "humiditylogg")
public class HumidityLogg implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int humidityId;
    private int humidity;

    public HumidityLogg() {
    }

    public HumidityLogg(int humidity) {
        this.humidity = humidity;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getHumidityId() {
        return humidityId;
    }

    public void setHumidityId(int humidityId) {
        this.humidityId = humidityId;
    }

    @Override
    public String toString() {
        return "HumidityLogg{" +
                "humidity=" + humidity +
                '}';
    }
}
