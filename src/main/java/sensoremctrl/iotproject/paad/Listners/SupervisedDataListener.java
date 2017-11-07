package sensoremctrl.iotproject.paad.Listners;

import org.hibernate.EmptyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.SupervisedData;

public class SupervisedDataListener extends EmptyInterceptor{

    @Autowired
    SupervisedData supervisedData;

    public void onUpdate(){

    }

    public boolean onSave(){

        return true;
    }
}
