package sensoremctrl.iotproject.paad.Listners;

import org.hibernate.EmptyInterceptor;

public class SupervisedDataListener extends EmptyInterceptor{

    public void onUpdate(){

    }

    public boolean onSave(){

        return true;
    }
}
