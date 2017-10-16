package sensoremctrl.iotproject.paad.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.HumidityLogg;

public interface HumidityRepository extends JpaRepository<HumidityLogg, Integer> {
}

