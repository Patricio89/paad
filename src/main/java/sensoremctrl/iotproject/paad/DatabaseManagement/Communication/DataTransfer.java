package sensoremctrl.iotproject.paad.DatabaseManagement.Communication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.DataManagement.DataProcessor;
import sensoremctrl.iotproject.paad.DataManagement.DataValue;
import sensoremctrl.iotproject.paad.DataManagement.LocalDataStorage;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.DateAndTimeLogg;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.HumidityLogg;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.TemperatureLogg;

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
    public List<TemperatureLogg> storeTemperatureLog() {
        csvDataValues = localDataStorage.getDataValueList();
        List<TemperatureLogg> temperatureLoggList = new ArrayList<>();
        TemperatureLogg temperatureLogg = new TemperatureLogg();
        int temperature;
        for (int i = 0; i < csvDataValues.size(); i++) {
            temperature = csvDataValues.get(i).getTemperature();
            temperatureLogg.setTemperature(temperature);
            temperatureLoggList.add(new TemperatureLogg(temperatureLogg.getTemperature()));
        }
        return temperatureLoggList;
    }

    @Bean
    public List<HumidityLogg> storeHumidityLog() {
        csvDataValues = localDataStorage.getDataValueList();
        List<HumidityLogg> humidityLoggList = new ArrayList<>();
        HumidityLogg humidityLogg = new HumidityLogg();
        int humidity;
        for (int i = 0; i < csvDataValues.size(); i++) {
            humidity = csvDataValues.get(i).getHumidity();
            humidityLogg.setHumidity(humidity);
            humidityLoggList.add(new HumidityLogg(humidityLogg.getHumidity()));
        }
        return humidityLoggList;
    }

    @Bean
    public List<DateAndTimeLogg> storeTimeStamp() {
        csvDataValues = localDataStorage.getDataValueList();
        List<DateAndTimeLogg> dateAndTimeLoggList = new ArrayList<>();
        DateAndTimeLogg dateAndTimeLogg = new DateAndTimeLogg();
        Date timeStamp;
        for (int i = 0; i < csvDataValues.size(); i++) {
            timeStamp = processor.convertStringToDate(csvDataValues.get(i).getDateAndTime());
            dateAndTimeLogg.setTimeStamp(timeStamp);
            dateAndTimeLoggList.add(new DateAndTimeLogg(dateAndTimeLogg.getTimeStamp()));
        }
        return dateAndTimeLoggList;
    }

}
