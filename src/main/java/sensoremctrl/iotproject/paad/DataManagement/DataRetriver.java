package sensoremctrl.iotproject.paad.DataManagement;

import java.util.Date;

public interface DataRetriver {
    int getTemperature();
    int getHumidity();
    Date getTimeStamp();
}
