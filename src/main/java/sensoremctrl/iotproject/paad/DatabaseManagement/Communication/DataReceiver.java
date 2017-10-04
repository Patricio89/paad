package sensoremctrl.iotproject.paad.DatabaseManagement.Communication;


import org.springframework.stereotype.Component;

@Component
public class DataReceiver {
    private String userEmail;
    private final int REQUESTED_HUMIDITY_CONTROLL = 33;
    private final int REQUESTED_TEMPERATURE_CONTROLL = 50;


    public String getUserEmail() {
        return userEmail;
    }

    public int getRequestedTemperatureValue() {
        return this.REQUESTED_HUMIDITY_CONTROLL;
    }

    public int getRequestedHumidityValue() {
        return this.REQUESTED_TEMPERATURE_CONTROLL;
    }
}
