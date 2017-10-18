package sensoremctrl.iotproject.paad.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.TemperatureLogg;

public interface TemperatureRepository extends JpaRepository<TemperatureLogg, Integer> {
}
