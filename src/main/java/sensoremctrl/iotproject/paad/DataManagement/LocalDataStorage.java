package sensoremctrl.iotproject.paad.DataManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import sensoremctrl.iotproject.paad.FileManagement.DataLogger;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LocalDataStorage {

    @Autowired
    DataLogger dataLogger;

    @Autowired
    DataProcessor processor;

    private List<DataValue> dataSamples = new ArrayList<>();

    /**
     * Stores data from .CSV file to local ArrayList.
     */
    public void storeDataToList(){
        dataSamples = dataLogger.readCsv();
    }

    @Bean
    public List<DataValue> getDataValueList(){
        storeDataToList();
        processor.stringToDate(dataSamples);
        return this.dataSamples;
    }
}
