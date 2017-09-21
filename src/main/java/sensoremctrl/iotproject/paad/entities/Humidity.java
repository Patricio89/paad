package sensoremctrl.iotproject.paad.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "humidity")
public class Humidity implements Serializable {

    @Id
    private int humi_id;

    private int humi_nr;
    private Float humidity;

    public Humidity() {
    }

    public int getHumi_id() {
        return humi_id;
    }

    public void setHumi_id(int humi_id) {
        this.humi_id = humi_id;
    }

    public int getHumi_nr() {
        return humi_nr;
    }

    public void setHumi_nr(int humi_nr) {
        this.humi_nr = humi_nr;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

}
