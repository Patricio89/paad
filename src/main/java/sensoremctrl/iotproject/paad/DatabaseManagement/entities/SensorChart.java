package sensoremctrl.iotproject.paad.DatabaseManagement.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sensorchart")
public class SensorChart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sensorId;
    private Date date_and_time;

    public SensorChart() {
    }

    public SensorChart(Date date_and_time) {
        this.date_and_time = date_and_time;
    }

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    public Date getDate_and_time() {
        return date_and_time;
    }

    public void setDate_and_time(Date date_and_time) {
        this.date_and_time = date_and_time;
    }

    @Override
    public String toString() {
        return "SensorChart{" +
                "Date_And_Time='" + date_and_time + '\'' +
                '}';
    }
}
