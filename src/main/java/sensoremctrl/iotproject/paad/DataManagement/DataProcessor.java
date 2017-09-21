package sensoremctrl.iotproject.paad.DataManagement;

public class DataProcessor {

    private DataStorage dataStorage;


    public void checkContent(){
        System.out.println(dataStorage.getDataSamples().size());
    }

    public void parseTemperature(){

    }

    public void parseHumidity(){
    }

// Postponed due to direct implementation of correct types.


}
