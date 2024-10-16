package com.geppetto.testprojectjava.dao;

import com.geppetto.testprojectjava.model.Student;
import java.util.List;
import java.util.Optional;


public interface StudentDao {

    Student create(Student student);


    Optional<Student> getEntityById(String id);


    List<Student> getAllValues();


    Optional<Student> update(String id);


    void delete(String id);

}
