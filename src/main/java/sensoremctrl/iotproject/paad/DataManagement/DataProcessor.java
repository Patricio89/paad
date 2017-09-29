package sensoremctrl.iotproject.paad.DataManagement;

import org.springframework.stereotype.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataProcessor {


    public Date convertStringToDate(String unFormattedString) {
        Date tempDate = null;
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            tempDate = formatter.parse(unFormattedString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return tempDate;
    }
}
