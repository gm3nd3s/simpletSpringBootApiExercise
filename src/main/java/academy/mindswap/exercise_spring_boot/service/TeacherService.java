package academy.mindswap.exercise_spring_boot.service;

import academy.mindswap.exercise_spring_boot.model.ParkingSpot;
import academy.mindswap.exercise_spring_boot.model.Teacher;
import academy.mindswap.exercise_spring_boot.repository.ParkingSpotRepository;
import academy.mindswap.exercise_spring_boot.service.ParkingSpotService;

import academy.mindswap.exercise_spring_boot.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getTeacherList() {
        return teacherRepository.findAll();
    }

    public Teacher getTeacher(Integer id){
        return teacherRepository.getReferenceById(id);
    }

    public Teacher createTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }
    @Autowired
    ParkingSpotService parkingSpotService;

    public ParkingSpot setParkingSpot(Integer teacherId, Integer id){
        return parkingSpotService.setTeacherToParkingSpot(teacherRepository.getReferenceById(teacherId),id);
    }

    public Teacher putTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
