package sensoremctrl.iotproject.paad.DataManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.DatabaseManagement.Communication.DataTransfer;
import sensoremctrl.iotproject.paad.FileManagement.DataLogger;

@Component
public class Cleaner {

    @Autowired
    DataTransfer dataTransfer;

    @Autowired
    DataLogger dataLogger;


    public void purgeLists(){
        dataLogger.clearList();
        dataTransfer.clearLists();
    }
}
