package sensoremctrl.iotproject.paad.ProcessManagement;

import java.util.Date;

public class DataValue {
    private int temperature;
    private int humidity;
    private Date timeStamp;


    public DataValue(int temperature, int humidity, Date timeStamp) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.timeStamp = timeStamp;
    }

    public int getTemperature() {
        return temperature;
    }


    public int getHumidity() {
        return humidity;
    }


    public Date getTimeStamp() {
        return timeStamp;
    }


}
