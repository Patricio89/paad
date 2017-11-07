package sensoremctrl.iotproject.paad.DatabaseManagement.Communication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.SupervisedData;
import sensoremctrl.iotproject.paad.Model.SupervisedDataRepository;

import java.util.HashMap;
import java.util.List;

@Component
public class DataReceiver {

    @Autowired
    private SupervisedDataRepository repository;
    private String userEmail;
    private int REQUESTED_HUMIDITY_CONTROLL;
    private int REQUESTED_TEMPERATURE_CONTROLL;

    private HashMap<String, Integer> userList = new HashMap<String, Integer>();



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
