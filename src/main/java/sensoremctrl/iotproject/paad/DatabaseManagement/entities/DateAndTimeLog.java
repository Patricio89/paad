package sensoremctrl.iotproject.paad.DatabaseManagement.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "dateandtimelog")
public class DateAndTimeLog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int timeStampId;
    private Date timeLog;

    public DateAndTimeLog() {
    }

    public DateAndTimeLog(Date timeLog) {
        this.timeLog = timeLog;
    }

    public int getTimeStampId() {
        return timeStampId;
    }

    public void setTimeStampId(int timeStampId) {
        this.timeStampId = timeStampId;
    }

    public Date getTimeLog() {
        return timeLog;
    }

    public void setTimeLog(Date timeLog) {
        this.timeLog = timeLog;
    }

    @Override
    public String toString() {
        return "DateAndTimeLog{" +
                "Date_And_Time='" + timeLog + '\'' +
                '}';
    }
}
