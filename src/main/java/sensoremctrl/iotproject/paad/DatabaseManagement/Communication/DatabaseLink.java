package sensoremctrl.iotproject.paad.DatabaseManagement.Communication;

import org.springframework.beans.factory.annotation.Autowired;
import sensoremctrl.iotproject.paad.Model.DateAndTimeRepository;
import sensoremctrl.iotproject.paad.Model.HumidityRepository;
import sensoremctrl.iotproject.paad.Model.TemperatureRepository;


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
        humidityRepository.save(transmitter.getHumidityList());
        dateAndTimeRepository.save(transmitter.getDateAndTimeList());
    }


    public void getDataFromDatabase(){

    }
}
