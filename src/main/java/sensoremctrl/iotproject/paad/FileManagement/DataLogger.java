package sensoremctrl.iotproject.paad.FileManagement;

import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.CsvData;

import java.io.*;
import java.util.*;

@Component
public class DataLogger implements Serializable{

    @Bean
    public List<CsvData> readCsv() {
        final String sensorFile = "src/main/resources/sensor_data.csv";
        List<CsvData> csvData = null;
        try {
            csvData = new CsvToBeanBuilder<CsvData>(new FileReader(sensorFile))
                    .withType(CsvData.class)
                    .build()
                    .parse();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return csvData;
    }
}
