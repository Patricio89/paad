package sensoremctrl.iotproject.paad.DatabaseManagement.Communication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.Model.DateAndTimeRepository;
import sensoremctrl.iotproject.paad.Model.HumidityRepository;
import sensoremctrl.iotproject.paad.Model.TemperatureRepository;

@Component
public class DatabaseLink {

    @Autowired
    TemperatureRepository temperatureRepository;

    @Autowired
    HumidityRepository humidityRepository;

    @Autowired
    DateAndTimeRepository dateAndTimeRepository;

    @Autowired
    DataTransfer dataTransfer;

    @Bean
    public boolean sendDataToDatabase() {
        temperatureRepository.save(dataTransfer.storeTemperatureLog());
        humidityRepository.save(dataTransfer.storeHumidityLog());
        dateAndTimeRepository.save(dataTransfer.storeTimeStamp());
        return true;
    }
}
