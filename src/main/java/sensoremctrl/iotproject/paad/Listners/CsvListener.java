package sensoremctrl.iotproject.paad.Listners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.*;

@Component
public class CsvListener implements Runnable{

    protected WatchService csvWatcher;
    protected Path path;
    protected WatchKey key;


        private void createWatcher(){
            try {
                csvWatcher = FileSystems.getDefault().newWatchService();
                path = Paths.get("C:\\Users\\patri\\Desktop\\testWatcher");
                path.register(csvWatcher,
                        StandardWatchEventKinds.ENTRY_CREATE,
                        StandardWatchEventKinds.ENTRY_MODIFY);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

         private void checkOnCreateAndModify(){
             try {
                 while((key = csvWatcher.take()) !=null){
                     for (WatchEvent<?> event : key.pollEvents()){

                         //Härinne skickar PAAD iväg data till databasen.

                         System.out.println("Event that happened: " + event.kind() + " File affected: " + event.context());
                     }
                     key.reset();
                 }
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }


    @Override
    public void run() {
             createWatcher();
             checkOnCreateAndModify();
    }
}
