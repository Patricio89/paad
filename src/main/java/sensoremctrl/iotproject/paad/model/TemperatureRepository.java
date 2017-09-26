package sensoremctrl.iotproject.paad.model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.TemperatureLog;

public interface TemperatureRepository extends JpaRepository<TemperatureLog, Integer> {
}
