package org.sqli.pfe.spring.mvc.repositories;

import org.sqli.pfe.spring.mvc.models.entities.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDao {

    List<Student>  findAll();

    Optional<Student> findById(long id);

    Student save(Student student);
}
