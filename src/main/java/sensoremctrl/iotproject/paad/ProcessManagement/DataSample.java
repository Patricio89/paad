package sensoremctrl.iotproject.paad.ProcessManagement;

import java.util.Date;

public class DataSample implements DataRetriver{

    private DataValue dataValue;

    public DataSample(int temperature, int humidity, Date timeStamp){
        dataValue = new DataValue(temperature, humidity, timeStamp);
    }

    @Override
    public int getTemperature() {
        return dataValue.getTemperature();
    }

    @Override
    public int getHumidity() {
        return dataValue.getHumidity();
    }

    @Override
    public Date getTimeStamp() {
        return dataValue.getTimeStamp();
    }
}
