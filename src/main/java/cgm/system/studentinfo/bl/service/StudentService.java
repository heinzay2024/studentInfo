package cgm.system.studentinfo.bl.service;

import cgm.system.studentinfo.persistance.entity.Student;
import cgm.system.studentinfo.web.form.StudentForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();
    public Student getStudentById(Long id);
    public void doSaveStudent(Student student);
    public void doDeleteStudent(Long id);

}
