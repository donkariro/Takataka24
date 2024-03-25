/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.jsflayer;

import com.donkariro.takataka24.boundary.UserService;
import com.donkariro.takataka24.dto.UserDTO;
import com.donkariro.takataka24.dto.UserMapper;
import com.donkariro.takataka24.entity.UserRole;
import com.donkariro.takataka24.entity.UserType;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Data;

/**
 *
 * @author d.kariro
 */
@Named
@Data
public class SignUpBacking {
    
    @Inject
    private UserService userService;
    @Inject
    private UserDTO userDTO;
    @Inject
    private UserMapper userMapper;
    
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
        userDTO.setPassword(password);
        
        this.userService.addUser(this.userMapper.userDTOToUser(userDTO));
        return "";
    }
    
}
