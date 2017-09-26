package sensoremctrl.iotproject.paad.DatabaseManagement.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "humiditylog")
public class HumidityLog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int humidityId;
    private int humidity;

    public HumidityLog() {
    }

    public HumidityLog(int humidity) {
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
        return "HumidityLog{" +
                "humidity=" + humidity +
                '}';
    }
}
