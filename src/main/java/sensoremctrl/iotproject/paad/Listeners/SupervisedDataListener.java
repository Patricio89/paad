package sensoremctrl.iotproject.paad.Listeners;

import org.hibernate.EmptyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import sensoremctrl.iotproject.paad.DataManagement.UserData;
import sensoremctrl.iotproject.paad.DatabaseManagement.Communication.DataReceiver;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.SupervisedData;

public class SupervisedDataListener extends EmptyInterceptor{

    @Autowired
    SupervisedData supervisedData;

    @Autowired
    DataReceiver dataReceiver;

    @Autowired
    UserData userData;

    public void onUpdate(){

    }

    public boolean onSave(){

        return true;
    }
}
