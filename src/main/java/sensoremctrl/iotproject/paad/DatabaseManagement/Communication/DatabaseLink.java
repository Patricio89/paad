package sensoremctrl.iotproject.paad.DatabaseManagement.Communication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.Model.DateAndTimeRepository;
import sensoremctrl.iotproject.paad.Model.HumidityRepository;
import sensoremctrl.iotproject.paad.Model.TemperatureRepository;

@Component
public class DatabaseLink {


    private TemperatureRepository temperatureRepository;
    private HumidityRepository humidityRepository;
    private DateAndTimeRepository dateAndTimeRepository;
    private DataTransfer dataTransfer;

    @Autowired
    public DatabaseLink(TemperatureRepository temperatureRepository,
                        HumidityRepository humidityRepository,
                        DateAndTimeRepository dateAndTimeRepository,
                        DataTransfer dataTransfer) {

        this.temperatureRepository = temperatureRepository;
        this.humidityRepository = humidityRepository;
        this.dateAndTimeRepository = dateAndTimeRepository;
        this.dataTransfer = dataTransfer;

    }

    // Make if statement to controller if method returns null etc.
    @Bean
    public boolean sendDataToDatabase() {
        temperatureRepository.save(dataTransfer.storeTemperatureLog());
        humidityRepository.save(dataTransfer.storeHumidityLog());
        dateAndTimeRepository.save(dataTransfer.storeTimeStamp());
        return true;

    }
}
