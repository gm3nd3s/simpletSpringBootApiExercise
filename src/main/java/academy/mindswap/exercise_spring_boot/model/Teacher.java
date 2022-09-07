package academy.mindswap.exercise_spring_boot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer age;

    @OneToOne
    private ParkingSpot parkingSpot;

}
