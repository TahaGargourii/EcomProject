package com.example.ecommerceProject.services;

import com.example.ecommerceProject.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user) ;
    //Role saveRole(Role role) ;
    void addRoletoUser(String username) ;

    void addRoletoUser(String username, String roleName);

    User getUser(String userName) ;
    List<User>getUser();


    User findUserByUserName(String userName);
}
