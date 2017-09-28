package sensoremctrl.iotproject.paad.DatabaseManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.model.DateAndTimeRepository;
import sensoremctrl.iotproject.paad.model.HumidityRepository;
import sensoremctrl.iotproject.paad.model.TemperatureRepository;

public class DatabaseLink {

    @Autowired
    DataTransfer transmitter;

    @Autowired
    TemperatureRepository temperatureRepository;

    @Autowired
    HumidityRepository humidityRepository;

    @Autowired
    DateAndTimeRepository dateAndTimeRepository;


    public void sendDataToDatabase(){
        temperatureRepository.save(transmitter.getTemperatureList());
        humidityRepository.save(transmitter.getHumidityLogList());
        dateAndTimeRepository.save(transmitter.getDateAndTimeLogList());
    }


    public void getDataFromDatabase(){

    }
}
