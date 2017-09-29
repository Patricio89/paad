package sensoremctrl.iotproject.paad.DatabaseManagement.Communication;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataReceiver {
    private String userEmail;
    private int requestedTemperatureControll;
    private int requestedHumidityControll;

    @Bean
    public String getUserEmail() {
        return userEmail;
    }

    @Bean
    public int getRequestedTemperatureValue() {
        return requestedTemperatureControll;
    }

    @Bean
    public int getRequestedHumidityValue() {
        return requestedHumidityControll;
    }
}
