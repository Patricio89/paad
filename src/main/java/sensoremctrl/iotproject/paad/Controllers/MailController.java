package sensoremctrl.iotproject.paad.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import sensoremctrl.iotproject.paad.DatabaseManagement.Communication.DataReceiver;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.SupervisedData;
import sensoremctrl.iotproject.paad.service.MailNotificationService;

@Controller
public class MailController {

    private Logger log = LoggerFactory.getLogger(MailController.class);
    private MailNotificationService service;
    private DataReceiver receiver;

    public MailController(MailNotificationService service, DataReceiver receiver) {
        this.service = service;
        this.receiver = receiver;
    }

    public void alertMessage() {
        SupervisedData user = new SupervisedData();

        String usersEmail =  receiver.getUserEmail();
        user.setEmail(usersEmail);

        try{
            service.sendNotification(user);
        } catch(MailException e) {
            log.info(e.getMessage());
        }
    }
}
