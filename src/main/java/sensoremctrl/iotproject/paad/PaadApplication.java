package sensoremctrl.iotproject.paad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sensoremctrl.iotproject.paad.Listeners.CsvListener;

@SpringBootApplication
public class PaadApplication {

	public static void main(String[] args)  {
		SpringApplication.run(PaadApplication.class);
		CsvListener csvListener = new CsvListener();
		csvListener.run();

	}
}
