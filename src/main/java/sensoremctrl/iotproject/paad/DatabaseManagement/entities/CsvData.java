package sensoremctrl.iotproject.paad.DatabaseManagement.entities;

import com.opencsv.bean.CsvBindByName;
import net.sf.jsefa.csv.annotation.CsvDataType;

import java.io.Serializable;
import java.util.Date;


@CsvDataType
public class CsvData implements Serializable {

    @CsvBindByName
    private int temperature;

    @CsvBindByName
    private int humidity;

    @CsvBindByName
    private String date_and_time;

    public CsvData() {
    }

    public CsvData(int temperature, int humidity, String date_and_time) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.date_and_time = date_and_time;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getDate_and_time() {
        return date_and_time;
    }

    public void setDate_and_time(String date_and_time) {
        this.date_and_time = date_and_time;
    }
}
