package sensoremctrl.iotproject.paad.DataManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.FileManagement.DataLogger;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocalDataStorage {

    @Autowired
    DataLogger dataLogger;

    @Autowired
    DataProcessor processor;

    private List<DataValue> dataSamples = new ArrayList<>();

    /**
     * Stores data from .CSV file to local ArrayList.
     */

    public List<DataValue> storeDataToList(){

        return dataLogger.readCsv();
    }

    @Bean
    public List<DataValue> getDataValueList(){
        List<DataValue> dataSampleList= storeDataToList();
        processor.convertStringToDate(dataSampleList);
        return this.dataSamples;
    }



}
