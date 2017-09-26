package sensoremctrl.iotproject.paad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.SensorChart;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.CsvData;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.HumidityLog;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.TemperatureLog;
import sensoremctrl.iotproject.paad.FileManagement.DataLogger;
import sensoremctrl.iotproject.paad.model.ChartRepository;

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


	public static void main(String[] args) {
		SpringApplication.run(PaadApplication.class);

	}

	@Override
	@Transactional
	public void run(String... strings) throws Exception {


		List<CsvData> csvDataList = dataLogger.readCsv();

		TemperatureLog temperature = new TemperatureLog();
		HumidityLog humidity = new HumidityLog();
		SensorChart dataChart = new SensorChart();
		List<TemperatureLog> temperatureList = new ArrayList<>();
		List<HumidityLog> humidityList = new ArrayList<>();

		int temp;
		int humi;
		String dateAndTime;
		Date dateTime;
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (int i = 0; i < csvDataList.size(); i++) {
			temp = csvDataList.get(i).getTemperature();
			temperature.setTemperature(temp);

			humi = csvDataList.get(i).getHumidity();
			humidity.setHumidity(humi);


			dateAndTime = csvDataList.get(i).getDate_and_time();
			dateTime = formatter.parse(dateAndTime);
			dataChart.setDate_and_time(dateTime);

			temperatureList.add(temperature);
			humidityList.add(humidity);
			System.out.println("Temp: " + temperature.getTemperature()
					+ " Fukt: " + humidity.getHumidity()
					+ " Tid: " + dataChart.getDate_and_time());
		}





		List tempList = new ArrayList<TemperatureLog>(){{
			add(new TemperatureLog(temperature.getTemperature(), dataChart));
		}};
		dataChart.setTemperatureLog(tempList);

		List humiList = new ArrayList<HumidityLog>(){{
			add(new HumidityLog(humidity.getHumidity(), dataChart));
		}};
		dataChart.setHumidityLog(humiList);

		repository.save(new ArrayList<SensorChart>(){{
			add(dataChart);
		}});

//		SensorChart tempChart = new SensorChart();
//		List<TemperatureLog> tempTest = new ArrayList<TemperatureLog>(){{
//			add(new TemperatureLog(temperature.getTemperature(), dataChart));
//		}};
//		dataChart.setTemperatures(tempTest);
//
//
//		SensorChart humiChart = new SensorChart();
//		List<HumidityLog> humiTest = new ArrayList<HumidityLog>(){{
//			add(new HumidityLog(humidity.getHumidity(), dataChart));
//		}};
//		dataChart.setHumidities(humiTest);
//
//
//		repository.save(new ArrayList<SensorChart>(){{
//			add(dataChart);
//
//		}});
	}
}
