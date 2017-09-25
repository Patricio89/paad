package sensoremctrl.iotproject.paad.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import sensoremctrl.iotproject.paad.entities.Chart;

public interface ChartRepository extends JpaRepository<Chart, Integer> {
}
