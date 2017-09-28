package sensoremctrl.iotproject.paad.DataManagement;

import com.opencsv.bean.CsvBindByName;


public class DataValue {

    @CsvBindByName
    private int temperature;

    @CsvBindByName
    private int humidity;

    @CsvBindByName
    private String dateAndTime;

    public DataValue() {

    }

    public DataValue(int temperature, int humidity, String dateAndTime) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.dateAndTime = dateAndTime;
    }

    public int getTemperature() {
        return temperature;
    }


    public int getHumidity() {
        return humidity;
    }


    public String getDateAndTime() {
        return dateAndTime;
    }


}
