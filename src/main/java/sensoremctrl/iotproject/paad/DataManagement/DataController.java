package sensoremctrl.iotproject.paad.DataManagement;

import org.springframework.beans.factory.annotation.Autowired;
import sensoremctrl.iotproject.paad.DatabaseManagement.Communication.DataReceiver;

public class DataController {

    @Autowired
    DataReceiver dataReceiver;

    private int humidityControll;
    private int temperatureControll;


    public void controllHumidity(){


    }

    public void controllTemperature(){

    }


}
