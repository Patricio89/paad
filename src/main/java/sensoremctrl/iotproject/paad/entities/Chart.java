package sensoremctrl.iotproject.paad.entities;

import java.sql.Date;

public class Chart {


    private int chart_id;
    private Date dateTime;

    public Chart() {
    }

    public Chart(int chart_id, Date dateTime) {
        this.chart_id = chart_id;
        this.dateTime = dateTime;
    }

    public int getChart_id() {
        return chart_id;
    }

    public void setChart_id(int chart_id) {
        this.chart_id = chart_id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
