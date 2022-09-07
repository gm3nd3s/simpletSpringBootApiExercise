package academy.mindswap.exercise_spring_boot.controller;

import academy.mindswap.exercise_spring_boot.model.Teacher;
import academy.mindswap.exercise_spring_boot.model.Vehicle;
import academy.mindswap.exercise_spring_boot.service.TeacherService;
import academy.mindswap.exercise_spring_boot.service.VehicleService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
@Data
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public List<Vehicle> getAllVehicles(){
        return vehicleService.getVehicleList();
    }

    @GetMapping("/{id}")
    public Vehicle getVehicle(@PathVariable Integer id){
        return vehicleService.getVehicle(id);
    }

    @PutMapping
    public Vehicle putVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.putVehicle(vehicle);
    }

    @PostMapping
    public Vehicle postVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.createVehicle(vehicle);
    }

}
