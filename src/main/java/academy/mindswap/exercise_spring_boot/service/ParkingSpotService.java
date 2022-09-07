package academy.mindswap.exercise_spring_boot.service;

import academy.mindswap.exercise_spring_boot.model.ParkingSpot;
import academy.mindswap.exercise_spring_boot.model.Teacher;
import academy.mindswap.exercise_spring_boot.repository.ParkingSpotRepository;
import academy.mindswap.exercise_spring_boot.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class ParkingSpotService {


    private final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public List<ParkingSpot> getParkingSpotRepository() {
        return parkingSpotRepository.findAll();
    }

    public ParkingSpot getParkingSpot(Integer id){
        return parkingSpotRepository.getReferenceById(id);
    }

    public ParkingSpot createParkingSpot(ParkingSpot parkingSpot){
        return parkingSpotRepository.save(parkingSpot);
    }

    public ParkingSpot setTeacherToParkingSpot(Teacher teacher, Integer id){
        parkingSpotRepository.findById(id).get().setTeacher(teacher);
        return parkingSpotRepository.findById(id).get();
    }
}
