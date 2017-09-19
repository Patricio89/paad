package sensoremctrl.iotproject.paad.ProcessManagement;

import java.util.List;

public class DataProcessor implements DataManagment{

    DataValues dataSample = new DataValues();



    public String getTemperature() {
        return dataSample.getTemperature();
    }


    public String getHumidity() {
        return dataSample.getHumidity();
    }


    public String getTimeStamp() {
        return dataSample.getTimeStamp();
    }


    public List getData() {
        return null;
    }
}

