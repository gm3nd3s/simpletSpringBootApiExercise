package academy.mindswap.exercise_spring_boot.controller;

import academy.mindswap.exercise_spring_boot.model.ParkingSpot;
import academy.mindswap.exercise_spring_boot.model.Teacher;
import academy.mindswap.exercise_spring_boot.service.TeacherService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/teacher")
@Data
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping
    public List<Teacher> getAllTeachers(){
        return teacherService.getTeacherList();
    }

    @GetMapping("/{id}")
    public Teacher getTeacher(@PathVariable Integer id){
        return teacherService.getTeacher(id);
    }

    @PutMapping
    public Teacher putTeacher(@RequestBody Teacher teacher){
        return teacherService.putTeacher(teacher);
    }

    @PostMapping
    public Teacher postTeacher(@RequestBody Teacher teacher){
        return teacherService.createTeacher(teacher);
    }

    @PutMapping("/{idTeacher}/{idParkingSpot}")
    public ParkingSpot setParkingSpot(@PathVariable Integer idTeacher, @PathVariable Integer idParkingSpot){
        return teacherService.setParkingSpot(idTeacher, idParkingSpot);
    }


}
