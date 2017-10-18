package sensoremctrl.iotproject.paad.DatabaseManagement.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "dateandtimelogg")
public class DateAndTimeLogg implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int timeStampId;

    @Column(name = "timestamp")
    private Date timeStamp;

    public DateAndTimeLogg() {
    }

    public DateAndTimeLogg(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getTimeStampId() {
        return timeStampId;
    }

    public void setTimeStampId(int timeStampId) {
        this.timeStampId = timeStampId;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "DateAndTimeLogg{" +
                "timeStamp=" + timeStamp +
                '}';
    }
}
