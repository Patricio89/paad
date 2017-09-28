package sensoremctrl.iotproject.paad.DatabaseManagement;

import org.springframework.beans.factory.annotation.Autowired;
//import sensoremctrl.iotproject.paad.DataManagement.DataProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.DataManagement.DataValue;
import sensoremctrl.iotproject.paad.DataManagement.LocalDataStorage;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.DateAndTimeLog;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.HumidityLog;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.TemperatureLog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DataTransfer implements Serializable{

    @Autowired
    LocalDataStorage dataStorage;

//    @Autowired
//    DataProcessor processor;

    private List<DataValue> dataStorages = dataStorage.storeDataToList();


    private List<TemperatureLog> temperatureLogList = new ArrayList<>();
    private List<HumidityLog> humidityLogList = new ArrayList<>();
    private List<DateAndTimeLog> dateAndTimeLogList = new ArrayList<>();

    @Bean
    private List<TemperatureLog> storeTemperature(){
        for (int i = 0; i < temperatureLogList.size(); i++){
            temperatureLogList.add(new TemperatureLog(dataStorages.get(i).getTemperature()));
        }
        return temperatureLogList;
    }

//    private void storeHumidity(){
//        for (int i = 0; i < humidityLogList.size(); i++){
//            humidityLogList.add(new HumidityLog(dataStorages.get(i).getHumidity()));
//        }
//    }
//
//    //Probably error due to double parsing. --check LocalDataStorage--
//    private void storeDateAndTime(){
//        Date stringToDate = processor.convertStringToDate(dataStorages);
//        for (int i = 0; i < dateAndTimeLogList.size(); i++){
//
//            dateAndTimeLogList.add(new DateAndTimeLog(stringToDate));
//
//        }
//    }


    public List<TemperatureLog> getTemperatureList(){
        //storeTemperature();
        return storeTemperature();
    }

//    public List<HumidityLog> getHumidityList(){
//        storeHumidity();
//        return this.humidityLogList;
//    }
//
//
//    public List<DateAndTimeLog> getDateAndTimeList(){
//        storeDateAndTime();
//        return this.dateAndTimeLogList;
//    }

}
