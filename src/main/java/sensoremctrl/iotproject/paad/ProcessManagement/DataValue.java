package sensoremctrl.iotproject.paad.ProcessManagement;

public class DataValue {
    private String temperature;
    private String humidity;
    private String timeStamp;


    public DataValue(String temperature, String humidity, String timeStamp) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.timeStamp = timeStamp;
    }

    public String getTemperature() {
        return temperature;
    }


    public String getHumidity() {
        return humidity;
    }


    public String getTimeStamp() {
        return timeStamp;
    }


}
