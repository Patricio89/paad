package sensoremctrl.iotproject.paad.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import sensoremctrl.iotproject.paad.DatabaseManagement.Entities.SupervisedData;

public interface SupervisedDataRepository extends JpaRepository<SupervisedData, String> {
}
