package sensoremctrl.iotproject.paad.DatabaseManagement.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


// Refaktoriserat till DateAndTimeLog om det inte fungerar, ändra tillbaks till SensorChart

@Entity
@Table(name = "sensorchart")
public class DateAndTimeLog implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sensorId;
    private Date date_and_time;

    public DateAndTimeLog() {
    }

    public DateAndTimeLog(Date date_and_time) {
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
        return "DateAndTimeLog{" +
                "Date_And_Time='" + date_and_time + '\'' +
                '}';
    }
}
