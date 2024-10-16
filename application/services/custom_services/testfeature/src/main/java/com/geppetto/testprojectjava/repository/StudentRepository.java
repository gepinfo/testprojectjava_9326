package com.geppetto.testprojectjava.repository;

import com.geppetto.testprojectjava.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,String>  {

}
