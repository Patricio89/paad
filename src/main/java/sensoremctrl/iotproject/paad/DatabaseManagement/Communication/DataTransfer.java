package sensoremctrl.iotproject.paad.DatabaseManagement.Communication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.DataManagement.DataProcessor;
import sensoremctrl.iotproject.paad.DataManagement.DataValue;
import sensoremctrl.iotproject.paad.DataManagement.LocalDataStorage;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.DateAndTimeLog;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.HumidityLog;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.TemperatureLog;
import sensoremctrl.iotproject.paad.EventHandler.MailAlertHandler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DataTransfer {

    @Autowired
    LocalDataStorage localDataStorage;

    @Autowired
    DataProcessor processor;

    private List<DataValue> csvDataValues;

    @Bean
    public List<TemperatureLog> storeTemperatureLog() {
        csvDataValues = localDataStorage.getDataValueList();
        List<TemperatureLog> temperatureLogList = new ArrayList<>();
        TemperatureLog temperatureLog = new TemperatureLog();
        int temperature;
        for (int i = 0; i < csvDataValues.size(); i++) {
            temperature = csvDataValues.get(i).getTemperature();
            temperatureLog.setTemperature(temperature);
            temperatureLogList.add(new TemperatureLog(temperatureLog.getTemperature()));
        }
        return temperatureLogList;
    }

    @Bean
    public List<HumidityLog> storeHumidityLog() {
        csvDataValues = localDataStorage.getDataValueList();
        List<HumidityLog> humidityLogList = new ArrayList<>();
        HumidityLog humidityLog = new HumidityLog();
        int humidity;
        for (int i = 0; i < csvDataValues.size(); i++) {
            humidity = csvDataValues.get(i).getHumidity();
            humidityLog.setHumidity(humidity);
            humidityLogList.add(new HumidityLog(humidityLog.getHumidity()));
        }
        return humidityLogList;
    }

    @Bean
    public List<DateAndTimeLog> storeTimeStamp() {
        csvDataValues = localDataStorage.getDataValueList();
        List<DateAndTimeLog> dateAndTimeLogList = new ArrayList<>();
        DateAndTimeLog dateAndTimeLog = new DateAndTimeLog();
        Date timeStamp;
        for (int i = 0; i < csvDataValues.size(); i++) {
            timeStamp = processor.convertStringToDate(csvDataValues.get(i).getDateAndTime());
            dateAndTimeLog.setTimeStamp(timeStamp);
            dateAndTimeLogList.add(new DateAndTimeLog(dateAndTimeLog.getTimeStamp()));
        }
        return dateAndTimeLogList;
    }

}
