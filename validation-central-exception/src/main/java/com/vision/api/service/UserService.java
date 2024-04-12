package com.vision.api.service;

import com.vision.api.dto.UserRequest;
import com.vision.api.entity.User;
import com.vision.api.exception.UserNotFoundException;
import com.vision.api.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public User saveUser(UserRequest userRequest) {
        User user = User.
                build(0, 
                		userRequest.getName(), 
                		userRequest.getEmail(),
                        userRequest.getMobile(), 
                        userRequest.getGender(), 
                        userRequest.getAge(),
                        userRequest.getNationality());
        return repository.save(user);
    }


    public List<User> getALlUsers() {
        return repository.findAll();
    }


    public User getUser(int id) throws UserNotFoundException {
        User user= repository.findByUserId(id);
        if(user!=null){
            return user;
        }else{
            throw new UserNotFoundException("user not found with id : "+id);
        }
    }
}
