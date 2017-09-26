package sensoremctrl.iotproject.paad.model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.iotproject.paad.entities.SensorChart;

public interface ChartRepository extends JpaRepository<SensorChart, Integer> {
}
