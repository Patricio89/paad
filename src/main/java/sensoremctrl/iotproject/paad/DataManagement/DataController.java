package sensoremctrl.iotproject.paad.DataManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.Controllers.MailController;
import sensoremctrl.iotproject.paad.DatabaseManagement.Communication.DataReceiver;

import java.util.List;

@Component
public class DataController {

    @Autowired
    private DataReceiver dataReceiver;

    @Autowired
    private LocalDataStorage localDataStorage;

    @Autowired
    private MailController mailController;


    @Bean
    public boolean ControllSensorData() {
        List<DataValue> controllList;
        controllList = localDataStorage.getDataValueList();

        for (int i = 0; i < controllList.size(); i++) {
            int temperature = controllList.get(i).getTemperature();
            int humidity = controllList.get(i).getHumidity();
            if (dataReceiver.getRequestedTemperatureValue() == temperature
                    && dataReceiver.getRequestedHumidityValue() == humidity) {
                mailController.alertMessage();
                return true;
            }
        }
        System.out.println("No values over the limit");
        return false;
    }


}
