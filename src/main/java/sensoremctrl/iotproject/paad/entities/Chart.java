package sensoremctrl.iotproject.paad.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "chart")
public class Chart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chart_id")
    private int chart_id;

    private String clockdate;

    @OneToMany(mappedBy = "chart", cascade = CascadeType.ALL)
    private List<Temperature> temperatures;

    @OneToMany(mappedBy = "chart", cascade = CascadeType.ALL)
    private List<Humidity> humidities;


    public Chart() {
    }

    public Chart(String clockdate) {
        this.clockdate = clockdate;
    }

    public Chart(List<Temperature> temperatures, List<Humidity> humidities, String clockdate) {
        this.temperatures = temperatures;
        this.humidities = humidities;
        this.clockdate = clockdate;

    }

    public int getChart_id() {
        return chart_id;
    }

    public void setChart_id(int chart_id) {
        this.chart_id = chart_id;
    }

    public String getclockdate() {
        return clockdate;
    }

    public void setclockdate(String clockdate) {
        this.clockdate = clockdate;
    }


    public List<Temperature> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(List<Temperature> temperatures) {
        this.temperatures = temperatures;
    }

    public List<Humidity> getHumidities() {
        return humidities;
    }

    public void setHumidities(List<Humidity> humidities) {
        this.humidities = humidities;
    }

    @Override
    public String toString() {
        return "Chart{" +
                "clockdate='" + clockdate + '\'' +
                '}';
    }
}
