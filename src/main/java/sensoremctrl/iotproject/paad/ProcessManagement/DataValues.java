package sensoremctrl.iotproject.paad.ProcessManagement;

public class DataValues {
    private String temperature;
    private String humidity;
    private String timeStamp;


    public DataValues(String temperature, String humidity, String timeStamp) {
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
