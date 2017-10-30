package sensoremctrl.iotproject.paad.DatabaseManagement.Communication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.SupervisedData;
import sensoremctrl.iotproject.paad.Model.SupervisedDataRepository;

import java.util.List;

@Component
public class DataReceiver {

    private String userEmail;
    private final int REQUESTED_HUMIDITY_CONTROLL = 33;
    private final int REQUESTED_TEMPERATURE_CONTROLL = 50;
    private SupervisedDataRepository repository;

    @Autowired
    public DataReceiver(SupervisedDataRepository repository) {
        this.repository = repository;
    }


    public String getUserEmail() {
        repository.findOne(userEmail);
        return userEmail;
    }

    public int getRequestedTemperatureValue() {
        repository.findAll();
        return this.REQUESTED_HUMIDITY_CONTROLL;
    }

    public int getRequestedHumidityValue() {
        repository.findAll();
        return this.REQUESTED_TEMPERATURE_CONTROLL;
    }
}
