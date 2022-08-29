package org.cap.demo.repo;

import org.cap.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student, Integer>{

}
