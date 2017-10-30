package sensoremctrl.iotproject.paad.DataManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.FileManagement.DataLogger;
import java.util.*;

@Component
public class LocalDataStorage {

    private DataLogger dataLogger;

    @Autowired
    public LocalDataStorage(DataLogger dataLogger) {
        this.dataLogger = dataLogger;
    }

    @Bean
    public List<DataValue> getDataValueList() {
        return dataLogger.readCsv();
    }
}
