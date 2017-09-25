package sensoremctrl.iotproject.paad;

import org.apache.commons.collections.ArrayStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sensoremctrl.iotproject.paad.entities.Chart;
import sensoremctrl.iotproject.paad.entities.CsvData;
import sensoremctrl.iotproject.paad.entities.Humidity;
import sensoremctrl.iotproject.paad.entities.Temperature;
import sensoremctrl.iotproject.paad.fileconfig.DataLogger;
import sensoremctrl.iotproject.paad.model.ChartRepository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PaadApplication implements CommandLineRunner {

	@Autowired
	DataLogger dataLogger;

//	@Autowired
//	ChartRepository repository;


	public static void main(String[] args) {
		SpringApplication.run(PaadApplication.class);

	}

	@Override
	@Transactional
	public void run(String... strings) throws Exception {


		List<CsvData> csvDataList = dataLogger.readCsv();

		Temperature temperature = new Temperature();
		Humidity humidity = new Humidity();
		Chart dataChart = new Chart();
		List<Temperature> temperatureList = new ArrayList<>();
		List<Humidity> humidityList = new ArrayList<>();

		int temp;
		int humi;
		String dateAndTime = null;
		for (int i = 0; i < csvDataList.size(); i++) {
			temp = csvDataList.get(i).getTemperature();
			humi = csvDataList.get(i).getHumidity();
			dateAndTime = csvDataList.get(i).getclockdate();
			temperature.setTemperature(temp);
			humidity.setHumidity(humi);
			dataChart.setclockdate(dateAndTime);
			temperatureList.add(temperature);
			humidityList.add(humidity);
			System.out.println("Temp: " + temperature.getTemperature()
					+ " Fukt: " + humidity.getHumidity()
					+ " Tid: " + dataChart.getclockdate());
		}
//
//		Chart total = new Chart(temperatureList, humidityList, dateAndTime);



//		Chart tempChart = new Chart();
//		List<Temperature> tempTest = new ArrayList<Temperature>(){{
//			add(new Temperature(temperature.getTemperature(), dataChart));
//		}};
//		dataChart.setTemperatures(tempTest);
//
//
//		Chart humiChart = new Chart();
//		List<Humidity> humiTest = new ArrayList<Humidity>(){{
//			add(new Humidity(humidity.getHumidity(), dataChart));
//		}};
//		dataChart.setHumidities(humiTest);
//
//
//		repository.save(new ArrayList<Chart>(){{
//			add(dataChart);
//
//		}});
	}
}
