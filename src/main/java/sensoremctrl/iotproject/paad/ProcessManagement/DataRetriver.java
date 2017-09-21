package sensoremctrl.iotproject.paad.ProcessManagement;

import java.util.Date;

public interface DataRetriver {
    int getTemperature();
    int getHumidity();
    Date getTimeStamp();
}
