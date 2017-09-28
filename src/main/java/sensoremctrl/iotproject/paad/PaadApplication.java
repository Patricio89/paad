package sensoremctrl.iotproject.paad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaadApplication {

//	@Autowired
//	DataLogger dataLogger;
//
//	@Autowired
//	DateAndTimeRepository dateAndTimeRepository;
//
//	@Autowired
//	TemperatureRepository temperatureRepository;
//
//	@Autowired
//	HumidityRepository humidityRepository;

	public static void main(String[] args) {
		SpringApplication.run(PaadApplication.class);

	}

//	@Override
//	@Transactional
//	public void run(String... strings) throws Exception {
//
//
//		List<DataValue> csvDataList = dataLogger.readCsv();
//
//		TemperatureLog temperature = new TemperatureLog();
//		HumidityLog humidity = new HumidityLog();
//		DateAndTimeLog dataChart = new DateAndTimeLog();
//		List<TemperatureLog> temperatureList = new ArrayList<>();
//		List<HumidityLog> humidityList = new ArrayList<>();
//		List<DateAndTimeLog> dateAndTimeLogList = new ArrayList<>();
//		int temp;
//		int humi;
//		String dateAndTime;
//		Date dateTime;
//		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		for (int i = 0; i < csvDataList.size(); i++) {
//			temp = csvDataList.get(i).getTemperature();
//			temperature.setTemperature(temp);
//			temperatureList.add(temperature);
//			temperatureList.add(new TemperatureLog(temperature.getTemperature()));
//
//			humi = csvDataList.get(i).getHumidity();
//			humidity.setHumidity(humi);
//			humidityList.add(humidity);
//			humidityList.add(new HumidityLog(humidity.getHumidity()));
//
//			dateAndTime = csvDataList.get(i).getDateAndTime();
//			dateTime = formatter.parse(dateAndTime);
//			dataChart.setTimeStamp(dateTime);
//			dateAndTimeLogList.add(new DateAndTimeLog(dataChart.getTimeStamp()));
//
//			System.out.println("Temp: " + temperature.getTemperature()
//					+ " Fukt: " + humidity.getHumidity()
//					+ " Tid: " + dataChart.getTimeStamp());
//
//		}
//
//		dateAndTimeRepository.save(dateAndTimeLogList);
//		temperatureRepository.save(temperatureList);
//		humidityRepository.save(humidityList);
//	}
}
