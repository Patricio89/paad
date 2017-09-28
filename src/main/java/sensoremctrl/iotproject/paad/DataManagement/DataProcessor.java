package sensoremctrl.iotproject.paad.DataManagement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DataProcessor {
    private String dateAndTime;
    private Date dateTime;
    private DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Date convertStringToDate(List<DataValue> unProcessedList) {

        for (int i = 0; i < unProcessedList.size(); i++) {
            dateAndTime = unProcessedList.get(i).getDateAndTime();
            try {
                dateTime = formatter.parse(dateAndTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return dateTime;
    }
}
