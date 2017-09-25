package sensoremctrl.iotproject.paad.interfaces;

public interface SensorData {

    int getTemperature();
    void setTemperature(int temperature);

    int getHumidity();
    void setHumidity(int humidity);

    String getclockdate();
    void setclockdate(String clockdate);
}
