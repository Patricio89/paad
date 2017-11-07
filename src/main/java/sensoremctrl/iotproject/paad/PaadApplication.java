package sensoremctrl.iotproject.paad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sensoremctrl.iotproject.paad.Listners.CsvListener;

@SpringBootApplication
public class PaadApplication {


	public static void main(String[] args)  {
		SpringApplication.run(PaadApplication.class);
		CsvListener listener = new CsvListener();
		listener.run();

	}
}
