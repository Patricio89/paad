package sensoremctrl.iotproject.paad.DataManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.Controllers.MailController;
import sensoremctrl.iotproject.paad.DatabaseManagement.Communication.DataReceiver;

import java.util.List;

@Component
public class DataController {
    private DataReceiver dataReceiver;
    private LocalDataStorage localDataStorage;
    private MailController mailController;
    private List<DataValue> controlList;

    @Autowired
    public DataController(DataReceiver dataReceiver,
                          LocalDataStorage localDataStorage,
                          MailController mailController) {
        this.dataReceiver = dataReceiver;
        this.localDataStorage = localDataStorage;
        this.mailController = mailController;

    }

//    @Autowired
//    UserData user;

    public void ControlSensorData() {
        controlTemperature();
        controlHumidity();

    }

    // Clean up code prior to full release --remove println's--
    private void controlTemperature(){
        controlList = localDataStorage.getDataValueList();
        int temperatureControll = dataReceiver.getRequestedTemperatureValue();

        for (int i = 0; i < controlList.size(); i++){
            int temperature = controlList.get(i).getTemperature();

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
    private void controlHumidity(){
        int humidityControll = dataReceiver.getRequestedHumidityValue();

        for (int i = 0; i < controlList.size(); i++){
            int humidity = controlList.get(i).getHumidity();

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
