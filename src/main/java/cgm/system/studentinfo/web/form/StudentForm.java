package cgm.system.studentinfo.web.form;

import cgm.system.studentinfo.persistance.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class StudentForm {
    private Long id;
    private Long age;
    private String studentName;
    private String fatherName;
    private String studentEmail;
    private boolean active;

    public StudentForm(Student student){
        this.id = student.getStudentID();
        this.studentName = student.getStudentName();
        this.age = student.getAge();
        this.fatherName = student.getFatherName();
        this.studentEmail = student.getStudentEmail();
        this.active = student.isActive();
    }
}
