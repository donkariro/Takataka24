/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.jsflayer;

import com.donkariro.takataka24.boundary.UserService;
import com.donkariro.takataka24.dto.UserDTO;
import com.donkariro.takataka24.mappers.UserMapper;
import com.donkariro.takataka24.entity.UserRole;
import com.donkariro.takataka24.entity.UserType;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.security.enterprise.identitystore.Pbkdf2PasswordHash;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

/**
 *
 * @author d.kariro
 */
@Named
@RequestScoped
@Data
public class SignUpBacking {
    
    @Inject
    private UserService userService;
    @Inject
    private UserDTO userDTO;
    @Inject
    private UserMapper userMapper;
    @Inject 
    Pbkdf2PasswordHash passwordHash;
    
    private String firstName;
    private String otherNames;
    private String email;
    private String userType;
    private String userRole;
    private String password;
    private String confirmPassword;
    
    public String signUp(){
        userDTO.setFirstName(firstName);
        userDTO.setOtherNames(otherNames);
        userDTO.setEmail(email);
        userDTO.setUserType(UserType.INDIVIDUAL);
        userDTO.setUserRole(UserRole.RECYCLER);
        userDTO.setPassword(this.passwordHash.generate(password.toCharArray()));
        
        this.userService.addUser(this.userMapper.userDTOToUser(userDTO));
        
        return "";
    }
    @PostConstruct
    public void init(){
        Map<String, String> parameters = new HashMap<>();
        parameters.put("Pbkdf2PasswordHash.Iterations", "3072");
        parameters.put("Pbkdf2PasswordHash.Algorithm", "PBKDF2WithHmacSHA512");
        parameters.put("Pbkdf2PasswordHash.SaltSizeBytes", "64");
        passwordHash.initialize(parameters);
    }
    
    
}
