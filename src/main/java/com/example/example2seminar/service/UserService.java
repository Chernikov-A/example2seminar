package com.example.example2seminar.service;

import com.example.example2seminar.model.User;
import com.example.example2seminar.repositories.UserRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepositories userRepositories;

    public UserService(UserRepositories userRepositories) {
        this.userRepositories = userRepositories;
    }

    public List<User>  findAll(){
        return userRepositories.findAll();
    }
    public User saveUser(User user){
        return userRepositories.save(user);
    }

    public User deleteByld(int id){ return userRepositories.deleteByld(id);}
    public User updateUser(User user) {return userRepositories.update(user);}

    public User getOne(int id){
        System.out.println("user service get id: " + id);
        return userRepositories.getOne(id);
    }
}
