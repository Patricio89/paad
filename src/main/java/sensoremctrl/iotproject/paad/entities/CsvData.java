package sensoremctrl.iotproject.paad.entities;

import com.opencsv.bean.CsvBindByName;
import net.sf.jsefa.csv.annotation.CsvDataType;

import java.io.Serializable;


@CsvDataType
public class CsvData implements Serializable {

    @CsvBindByName
    private int temperature;

    @CsvBindByName
    private int humidity;

    @CsvBindByName
    private String clockdate;

    public CsvData() {
    }

    public CsvData(int temperature, int humidity, String clockdate) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.clockdate = clockdate;
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

    public String getclockdate() {
        return clockdate;
    }

    public void setclockdate(String clockdate) {
        this.clockdate = clockdate;
    }
}
