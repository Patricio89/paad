package sensoremctrl.iotproject.paad.FileManagement;

import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.DataManagement.DataValue;

import java.io.*;
import java.util.*;

@Component
public class DataLogger {

    public List<DataValue> readCsv() {
        final String sensorFile = "src/main/resources/sensor_data.csv";
        List<DataValue> csvData = null;
        try {
            csvData = new CsvToBeanBuilder<DataValue>(new FileReader(sensorFile))
                    .withType(DataValue.class)
                    .build()
                    .parse();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return csvData;
    }
}
