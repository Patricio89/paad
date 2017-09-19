package sensoremctrl.iotproject.paad.ProcessManagement;

import java.util.List;

public interface DataManagment {
    String getTemperature();
    String getHumidity();
    String getTimeStamp();
    List getData();
}
