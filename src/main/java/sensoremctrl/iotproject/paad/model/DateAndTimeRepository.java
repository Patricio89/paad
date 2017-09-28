package sensoremctrl.iotproject.paad.model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.DateAndTimeLog;

// Define interface for DateAndTimeLog entitiy and Integer type for Primary key
public interface DateAndTimeRepository extends JpaRepository<DateAndTimeLog, Integer> {

}
