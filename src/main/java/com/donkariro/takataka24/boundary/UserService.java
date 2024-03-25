/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package com.donkariro.takataka24.boundary;

import com.donkariro.takataka24.control.UserRepository;
import com.donkariro.takataka24.entity.User;
import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;
import jakarta.inject.Inject;

/**
 *
 * @author DonKariro
 */
@Stateless
@LocalBean
public class UserService {

    @Inject
    private UserRepository userRepository;
    
    public void addUser(User user){
        this.userRepository.insertUser(user);
    }
}
