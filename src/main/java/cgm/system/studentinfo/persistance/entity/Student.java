package cgm.system.studentinfo.persistance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column (name = "student_id")
    private Long studentID;

    @Column (name = "student_name")
    private String studentName;

    @Column (name = "age")
    private Long age;

    @Column (name = "father_name")
    private String fatherName;

    @Column (name = "student_email")
    private String studentEmail;

    @Column (name = "active")
    private boolean active;

}
