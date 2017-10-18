package sensoremctrl.iotproject.paad.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.DateAndTimeLogg;

public interface DateAndTimeRepository extends JpaRepository<DateAndTimeLogg, Integer>{
}
