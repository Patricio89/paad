package sensoremctrl.iotproject.paad.DataManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.EventHandler.MailAlertHandler;
import sensoremctrl.iotproject.paad.FileManagement.DataLogger;
import java.util.*;

@Component
public class LocalDataStorage {

    @Autowired
    private DataLogger dataLogger;

    @Bean
    public List<DataValue> getDataValueList() {
        List<DataValue> csvDataList = dataLogger.readCsv();
        return csvDataList;
    }
}
