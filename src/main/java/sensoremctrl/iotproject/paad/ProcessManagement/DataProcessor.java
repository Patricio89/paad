package sensoremctrl.iotproject.paad.ProcessManagement;

public class DataProcessor {

    private DataStorage dataStorage;

    public void checkContent(){
        System.out.println(dataStorage.getDataSamples());
    }

}
