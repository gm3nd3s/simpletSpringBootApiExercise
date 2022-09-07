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
@Table(name = "parkingSpots")
public class ParkingSpot {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    private Teacher teacher;

}
