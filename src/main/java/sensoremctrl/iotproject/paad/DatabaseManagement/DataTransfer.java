package sensoremctrl.iotproject.paad.DatabaseManagement;

import org.springframework.beans.factory.annotation.Autowired;
import sensoremctrl.iotproject.paad.DataManagement.DataProcessor;
import sensoremctrl.iotproject.paad.DataManagement.DataValue;
import sensoremctrl.iotproject.paad.DataManagement.LocalDataStorage;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.DateAndTimeLog;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.HumidityLog;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.TemperatureLog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataTransfer implements Serializable{

    @Autowired
    LocalDataStorage dataStorage;

    @Autowired
    DataProcessor processor;

    private List<DataValue> dataStorages = dataStorage.getDataValueList();


    private List<TemperatureLog> temperatureLogList = new ArrayList<>();
    private List<HumidityLog> humidityLogList = new ArrayList<>();
    private List<DateAndTimeLog> dateAndTimeLogList = new ArrayList<>();


    private void storeTemperature(){
        for (int i = 0; i < temperatureLogList.size(); i++){
            temperatureLogList.add(new TemperatureLog(dataStorages.get(i).getTemperature()));
        }
    }

    private void storeHumidity(){
        for (int i = 0; i < humidityLogList.size(); i++){
            humidityLogList.add(new HumidityLog(dataStorages.get(i).getHumidity()));
        }
    }


    private void storeDateAndTime(){
        Date stringToDate = processor.convertStringToDate(dataStorages);
        for (int i = 0; i < dateAndTimeLogList.size(); i++){

            dateAndTimeLogList.add(new DateAndTimeLog(stringToDate));
        }
    }


    public List<TemperatureLog> getTemperatureList(){
        storeTemperature();
        return this.temperatureLogList;
    }

    public List<HumidityLog> getHumidityLogList(){
        storeHumidity();
        return this.humidityLogList;
    }


    public List<DateAndTimeLog> getDateAndTimeLogList(){
        storeDateAndTime();
        return this.dateAndTimeLogList;
    }

}
