package sensoremctrl.iotproject.paad.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.DateAndTimeLog;

public interface DateAndTimeRepository extends JpaRepository<DateAndTimeLog, Integer>{
}
