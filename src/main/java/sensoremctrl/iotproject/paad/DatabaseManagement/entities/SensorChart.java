package sensoremctrl.iotproject.paad.DatabaseManagement.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SensorChart")
public class SensorChart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SensorId")
    private int sensorId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date_and_time;

    @OneToMany(mappedBy = "chart", cascade = CascadeType.ALL)
    private List<TemperatureLog> temperatures;

    @OneToMany(mappedBy = "chart", cascade = CascadeType.ALL)
    private List<HumidityLog> humidities;


    public SensorChart() {
    }

    public SensorChart(Date date_and_time) {
        this.date_and_time = date_and_time;
    }

    public SensorChart(List<TemperatureLog> temperatures, List<HumidityLog> humidities, Date date_and_time) {
        this.temperatures = temperatures;
        this.humidities = humidities;
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

    public List<TemperatureLog> getTemperatures() {
        return temperatures;
    }

    public void setTemperatureLog(List<TemperatureLog> temperatures) {
        this.temperatures = temperatures;
    }

    public List<HumidityLog> getHumidityLog() {
        return humidities;
    }

    public void setHumidityLog(List<HumidityLog> humidities) {
        this.humidities = humidities;
    }

    @Override
    public String toString() {
        return "SensorChart{" +
                "clockdate='" + date_and_time + '\'' +
                '}';
    }
}
