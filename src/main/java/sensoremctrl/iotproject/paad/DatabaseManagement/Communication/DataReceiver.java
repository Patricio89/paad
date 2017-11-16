package sensoremctrl.iotproject.paad.DatabaseManagement.Communication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.DataManagement.UserData;
import sensoremctrl.iotproject.paad.Model.SupervisedDataRepository;

import java.util.HashMap;

@Component
public class DataReceiver {

    @Autowired
    private SupervisedDataRepository repository;


    private String userEmail;
    private int superviseTemperature;
    private int superviseHumidity;

    private HashMap<String, Integer> userList = new HashMap<String, Integer>();


    public String getUserEmail() {
        repository.findOne(userEmail);
        return userEmail;
    }

    public int getRequestedTemperatureValue() {
        repository.findAll();
        return this.superviseTemperature;
    }

    public int getRequestedHumidityValue() {
        repository.findAll();
        return this.superviseHumidity;
    }

    public void addUserToList(){
        
    }


}
