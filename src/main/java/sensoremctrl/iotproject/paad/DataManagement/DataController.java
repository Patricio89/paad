package sensoremctrl.iotproject.paad.DataManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.Controllers.MailController;
import sensoremctrl.iotproject.paad.DatabaseManagement.Communication.DataReceiver;

import java.util.List;

// @Component
public class DataController {

    @Autowired
    private DataReceiver dataReceiver;

    @Autowired
    private LocalDataStorage localDataStorage;

    @Autowired
    private MailController mailController;

    private List<DataValue> controllList = localDataStorage.getDataValueList();

    @Bean
    public void ControllSensorData() {
        controllTemperature();
        controllHumidity();
    }

    // Clean up code prior to full release --remove println's--
    private void controllTemperature(){
        controllList = localDataStorage.getDataValueList();
        int temperatureControll = dataReceiver.getRequestedTemperatureValue();

        for (int i = 0; i <controllList.size(); i++){
            int temperature = controllList.get(i).getTemperature();

            if (temperatureControll < 10+ temperature || temperatureControll > 10+ temperature){
                System.out.println("Value limit reached, alerting user. ");
                mailController.alertMessage();
            }else {
                System.out.println("No values reached over the limit.");
                return;
            }
        }

    }

    // Clean up code prior to full release --remove println's--
    private void controllHumidity(){
        int humidityControll = dataReceiver.getRequestedHumidityValue();

        for (int i = 0; i < controllList.size(); i++){
            int humidity = controllList.get(i).getHumidity();

            if (humidityControll == humidity){
                System.out.println("Value limit reached, alerting user. ");
                mailController.alertMessage();
            }else   {
                System.out.println("No values reached over the limit. ");
                return;
            }
        }
    }


}
