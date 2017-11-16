package sensoremctrl.iotproject.paad.Listeners;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;
import sensoremctrl.iotproject.paad.PaadApplication;

import java.io.IOException;
import java.nio.file.*;

@Component
public class CsvListener{

    private WatchService csvWatcher;


    private void createWatcher(){
            try {
                csvWatcher = FileSystems.getDefault().newWatchService();
                Path path = Paths.get("C:\\Users\\patri\\Desktop\\testWatcher");
                path.register(csvWatcher,
                        StandardWatchEventKinds.ENTRY_CREATE,
                        StandardWatchEventKinds.ENTRY_MODIFY);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

         private void checkOnCreateAndModify(){
             try {
                 WatchKey key;
                 while((key = csvWatcher.take()) !=null){
                     for (WatchEvent<?> event : key.pollEvents()){

                         SpringApplication.run(PaadApplication.class);

                         System.out.println("Event that happened: " + event.kind() + " File affected: " + event.context());
                     }
                     key.reset();
                 }
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }

    public void run() {
             createWatcher();
             checkOnCreateAndModify();
    }
}
