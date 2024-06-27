package cgm.system.studentinfo.persistance.dao;

import cgm.system.studentinfo.persistance.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentDAO extends JpaRepository<Student,Long> {
}
