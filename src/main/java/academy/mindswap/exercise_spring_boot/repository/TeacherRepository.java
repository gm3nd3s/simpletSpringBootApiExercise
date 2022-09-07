package academy.mindswap.exercise_spring_boot.repository;

import academy.mindswap.exercise_spring_boot.model.Teacher;
import academy.mindswap.exercise_spring_boot.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository <Teacher, Integer>{

}
