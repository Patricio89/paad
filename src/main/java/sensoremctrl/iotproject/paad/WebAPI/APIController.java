package sensoremctrl.iotproject.paad.WebAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sensoremctrl.iotproject.paad.DataManagement.DataValue;
import sensoremctrl.iotproject.paad.DatabaseManagement.Communication.DataReceiver;
import sensoremctrl.iotproject.paad.DatabaseManagement.Communication.DataTransfer;
import sensoremctrl.iotproject.paad.DatabaseManagement.Communication.DatabaseLink;

import java.util.List;

@RestController
@RequestMapping(value="/account")
public class APIController {

    @Autowired
    private DataTransfer transmitter;

    @Autowired
    private DataReceiver receiver;

    @Autowired
    private DatabaseLink databaseLink;

    @RequestMapping(method = RequestMethod.GET)
    private boolean getAllData(){
        databaseLink.sendDataToDatabase();
        return true;
    }



}
