package sensoremctrl.iotproject.paad.DataManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.DatabaseManagement.Communication.DataReceiver;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.TemperatureLog;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataController {

    @Autowired
    private DataReceiver dataReceiver;

    @Autowired
    private LocalDataStorage localDataStorage;


    private List<DataValue> controllList;


    @Bean
    public String controllHumidity(){
        controllList = localDataStorage.getDataValueList();

        //Replace local variable with DataReciever data once class is functional.
        int humidityControll = 50;
        for (int i = 0; i < controllList.size(); i++){
            int humidity = controllList.get(i).getHumidity();
            if (humidityControll == humidity){

                System.out.println("Humidity limit met at: " + controllList.get(i).getDateAndTime() + " Humidity that was controlled: " + humidityControll);
            }

        }
        return null;
    }


    @Bean
    public String controllTemperature(){
        controllList = localDataStorage.getDataValueList();

        //Replace local variable with DataReciever data once class is functional.
        int temperatureControll = 31;
        for (int i = 0; i < controllList.size(); i++){
            int temperature = controllList.get(i).getTemperature();
            if (temperatureControll == temperature){
                System.out.println("Temperature limit met at: " + controllList.get(i).getDateAndTime() + " Temperature that was controlled: " + temperatureControll);
            }
        }
        return null;
    }


}
