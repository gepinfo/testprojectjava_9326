package com.geppetto.testprojectjava.dao.daoimpl;

import com.geppetto.testprojectjava.model.User;
import com.geppetto.testprojectjava.repository.UserRepository;
import com.geppetto.testprojectjava.dao.UserDao;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao{

    private final UserRepository userRepository;

     public UserDaoImpl(UserRepository userRepository) {
       this.userRepository = userRepository;
}





}
