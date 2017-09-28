package sensoremctrl.iotproject.paad.model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.DateAndTimeLog;

public interface DateAndTimeRepository extends JpaRepository<DateAndTimeLog, Integer> {
}
