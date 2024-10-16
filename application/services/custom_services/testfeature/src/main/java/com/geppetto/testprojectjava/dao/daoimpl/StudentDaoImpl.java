package com.geppetto.testprojectjava.dao.daoimpl;

import com.geppetto.testprojectjava.model.Student;
import com.geppetto.testprojectjava.repository.StudentRepository;
import com.geppetto.testprojectjava.dao.StudentDao;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class StudentDaoImpl implements StudentDao{

    private final StudentRepository studentRepository;

     public StudentDaoImpl(StudentRepository studentRepository) {
       this.studentRepository = studentRepository;
}

    @Override
    public Student create(Student student) {
      return studentRepository.save(student);
    }


    @Override
    public Optional<Student> getEntityById(String id) {
      return studentRepository.findById(id);
    }


    @Override
    public List<Student> getAllValues() {
      return studentRepository.findAll();
    }


    @Override
    public Optional<Student> update(String id) {
      return studentRepository.findById(id);
    }


    @Override
    public void delete(String id) {
      studentRepository.deleteById(id);
    }

}
