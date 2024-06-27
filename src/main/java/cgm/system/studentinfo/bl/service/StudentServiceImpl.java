package cgm.system.studentinfo.bl.service;

import cgm.system.studentinfo.persistance.dao.StudentDAO;
import cgm.system.studentinfo.persistance.entity.Student;
import cgm.system.studentinfo.web.form.StudentForm;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO;

    List<Student> students = new ArrayList<>();


    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudentById(Long id) {

        return students.stream().filter(student -> student.getStudentID()
                .equals(id)).findFirst().orElse(null);
    }

    @Override
    public void doSaveStudent(Student student) {
        students.add(student);
    }

    @Override
    public void doDeleteStudent(Long id) {
        studentDAO.deleteById(id);
    }
}
