package sensoremctrl.iotproject.paad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import sensoremctrl.iotproject.paad.DatabaseManagement.Communication.DataReceiver;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.SupervisedData;

@Service
public class MailNotificationService {

    private JavaMailSender javaMailSender;


    @Autowired
    public MailNotificationService(JavaMailSender javaMailSender) throws MailException {
        this.javaMailSender = javaMailSender;
    }

    @Autowired
    DataReceiver dataReceiver;

    public void sendNotification(SupervisedData user) {

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(user.getEmail());
        mail.setFrom("paadctrl@gmail.com");
        mail.setSubject("Kontroll från Sense Hat");
        mail.setText("Fuktighet för hög!, uppmätt värde: " + dataReceiver.getRequestedHumidityValue() + "\n" +
                     "Temperature för hög!, uppmätt värde: " + dataReceiver.getRequestedTemperatureValue());

        javaMailSender.send(mail);
    }
}
