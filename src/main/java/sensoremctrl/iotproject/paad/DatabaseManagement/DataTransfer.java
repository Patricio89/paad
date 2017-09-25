package sensoremctrl.iotproject.paad.DatabaseManagement;

import sensoremctrl.iotproject.paad.DataManagement.DataStorage;

public class DataTransfer {

    private DataStorage dataStorage = new DataStorage();



    public void checkContent(){
        for (int i = 0; i < dataStorage.getDataSamples().size(); i++){
            if (dataStorage.getDataSamples().isEmpty()){
                //Abort eller gör ngt, typ .sleep och gör om.
            }
        }
    }
}
