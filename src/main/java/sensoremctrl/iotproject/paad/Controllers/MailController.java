package sensoremctrl.iotproject.paad.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import sensoremctrl.iotproject.paad.domain.MailUser;
import sensoremctrl.iotproject.paad.service.MailNotificationService;

@Controller
public class MailController {

    private Logger log = LoggerFactory.getLogger(MailController.class);

    @Autowired
    private MailNotificationService service;


    public void alertMessage() {

        MailUser user = new MailUser();
        user.setFirstName("Adde");
        user.setLastName("Padde");
        user.setEmailAddress("adrian.wieslander@gmail.com");

        try{
            service.sendNotification(user);
        } catch(MailException e) {
            log.info(e.getMessage());
        }
    }
}
