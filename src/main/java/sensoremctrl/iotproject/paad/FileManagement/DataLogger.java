package sensoremctrl.iotproject.paad.FileManagement;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import net.sf.jsefa.Deserializer;
import net.sf.jsefa.Serializer;
import net.sf.jsefa.csv.CsvIOFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.entities.Chart;
import sensoremctrl.iotproject.paad.entities.CsvData;
import sensoremctrl.iotproject.paad.entities.Humidity;
import sensoremctrl.iotproject.paad.entities.Temperature;
import java.io.*;
import java.sql.Date;
import java.util.*;

@Component
public class DataLogger {

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
