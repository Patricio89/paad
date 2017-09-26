package sensoremctrl.iotproject.paad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sensoremctrl.iotproject.paad.DataManagement.DataValue;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.SensorChart;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.HumidityLog;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.TemperatureLog;
import sensoremctrl.iotproject.paad.FileManagement.DataLogger;
import sensoremctrl.iotproject.paad.model.ChartRepository;
import sensoremctrl.iotproject.paad.model.HumidityRepository;
import sensoremctrl.iotproject.paad.model.TemperatureRepository;

import javax.transaction.Transactional;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PaadApplication implements CommandLineRunner {

	@Autowired
	DataLogger dataLogger;

	@Autowired
	ChartRepository repository;

	@Autowired
	TemperatureRepository temperatureRepository;

	@Autowired
	HumidityRepository humidityRepository;

	public static void main(String[] args) {
		SpringApplication.run(PaadApplication.class);

	}

	@Override
	@Transactional
	public void run(String... strings) throws Exception {


		List<DataValue> csvDataList = dataLogger.readCsv();

		TemperatureLog temperature = new TemperatureLog();
		HumidityLog humidity = new HumidityLog();
		SensorChart dataChart = new SensorChart();
		List<TemperatureLog> temperatureList = new ArrayList<>();
		List<HumidityLog> humidityList = new ArrayList<>();
		List<SensorChart> sensorChartList = new ArrayList<>();
		int temp;
		int humi;
		String dateAndTime;
		Date dateTime;
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (int i = 0; i < csvDataList.size(); i++) {
			temp = csvDataList.get(i).getTemperature();
			temperature.setTemperature(temp);
			temperatureList.add(temperature);
			temperatureList.add(new TemperatureLog(temperature.getTemperature()));

			humi = csvDataList.get(i).getHumidity();
			humidity.setHumidity(humi);
			humidityList.add(humidity);
			humidityList.add(new HumidityLog(humidity.getHumidity()));

			dateAndTime = csvDataList.get(i).getTimeStamp();
			dateTime = formatter.parse(dateAndTime);
			dataChart.setDate_and_time(dateTime);
			sensorChartList.add(new SensorChart(dataChart.getDate_and_time()));

			System.out.println("Temp: " + temperature.getTemperature()
					+ " Fukt: " + humidity.getHumidity()
					+ " Tid: " + dataChart.getDate_and_time());

		}

		//repository.save(sensorChartList);
		//temperatureRepository.save(temperatureList);
		//humidityRepository.save(humidityList);
	}
}
