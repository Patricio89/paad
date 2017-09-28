//package sensoremctrl.iotproject.paad.DatabaseManagement;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import sensoremctrl.iotproject.paad.model.DateAndTimeRepository;
//import sensoremctrl.iotproject.paad.model.HumidityRepository;
//import sensoremctrl.iotproject.paad.model.TemperatureRepository;
//
//public class DatabaseLink {
//
//    @Autowired
//    DataTransfer transmitter;
//
//    @Autowired
//    TemperatureRepository temperatureRepository;
//
//    @Autowired
//    HumidityRepository humidityRepository;
//
//    @Autowired
//    DateAndTimeRepository dateAndTimeRepository;
//
//
//    public void sendDataToDatabase(){
//        temperatureRepository.save(transmitter.getTemperatureList());
//        humidityRepository.save(transmitter.getHumidityList());
//        dateAndTimeRepository.save(transmitter.getDateAndTimeList());
//    }
//
//
//    public void getDataFromDatabase(){
//
//    }
//}