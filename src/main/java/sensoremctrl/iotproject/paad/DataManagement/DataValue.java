package sensoremctrl.iotproject.paad.DataManagement;

import com.opencsv.bean.CsvBindByName;


public class DataValue {

    @CsvBindByName
    private int temperature;

    @CsvBindByName
    private int humidity;

    @CsvBindByName
    private String timeStamp;

    public DataValue() {

    }


    public DataValue(int temperature, int humidity, String timeStamp) {
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


    public String getTimeStamp() {
        return timeStamp;
    }


}
