package sensoremctrl.iotproject.paad.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.HumidityLog;

public interface HumidityRepository extends JpaRepository<HumidityLog, Integer> {
}

