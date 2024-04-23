package kp.kfpricefs.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    // adds id column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // adds firstName column
    @Column(name = "first_name")
    private String firstName;

    // adds lastName column
    @Column(name = "lastName")
    private String lastName;

    // adds email_id column
    @Column(name = "email_id", nullable = false, unique = true)
    private String email;
}
