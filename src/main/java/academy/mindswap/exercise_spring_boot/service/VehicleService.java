package academy.mindswap.exercise_spring_boot.service;

import academy.mindswap.exercise_spring_boot.model.Vehicle;
import academy.mindswap.exercise_spring_boot.model.Vehicle;
import academy.mindswap.exercise_spring_boot.repository.TeacherRepository;
import academy.mindswap.exercise_spring_boot.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleRepository.findAll();
    }

    public Vehicle getVehicle(Integer id){
        return vehicleRepository.getReferenceById(id);
    }

    public Vehicle createVehicle(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    public Vehicle putVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}
