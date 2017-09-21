package sensoremctrl.iotproject.paad.FileManagement;

import com.opencsv.CSVReader;
import sensoremctrl.iotproject.paad.DataManagement.DataValue;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class DataLogger {


    public List<DataValue> readCsv() {
        String csvFile = "sensor_data.csv";


        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader(csvFile));
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                List<String> csvList = Arrays.asList(line);
                System.out.println(csvList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
