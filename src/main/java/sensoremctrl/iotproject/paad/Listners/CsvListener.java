package sensoremctrl.iotproject.paad.Listners;

import java.io.IOException;
import java.nio.file.*;

public class CsvListener implements Runnable{

    protected WatchService csvWatcher;
    protected Path path;
    protected WatchKey key;

        public void createWatcher(){
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

         public void checkOnCreateAndModify(){
             try {
                 while((key = csvWatcher.take()) !=null){
                     for (WatchEvent<?> event : key.pollEvents()){

                         //Härinne skickar PAAD iväg data till databasen.

                         System.out.println("Event that happened" + event.kind() + "File affected" + event.context());
                     }
                     key.reset();
                 }
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }


    @Override
    public void run() {

    }
}
