package sensoremctrl.iotproject.paad.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.TemperatureLog;

public interface TemperatureRepository extends JpaRepository<TemperatureLog, Integer> {
}
