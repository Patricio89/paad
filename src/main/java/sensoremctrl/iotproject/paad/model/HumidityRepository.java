package sensoremctrl.iotproject.paad.model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.iotproject.paad.DatabaseManagement.entities.HumidityLog;

public interface HumidityRepository extends JpaRepository<HumidityLog, Integer> {
}
