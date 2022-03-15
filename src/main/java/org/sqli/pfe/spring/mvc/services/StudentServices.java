package org.sqli.pfe.spring.mvc.services;

import org.sqli.pfe.spring.mvc.models.entities.Student;

import java.util.List;

public interface StudentServices {

    List<Student> getAllStudents();

    Student searchById(long id);

    Student addNewStudent(Student student);

}
