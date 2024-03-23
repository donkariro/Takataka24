/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.jsflayer;

import com.donkariro.takataka24.entity.UserRole;
import com.donkariro.takataka24.entity.UserType;
import jakarta.inject.Named;
import lombok.Data;

/**
 *
 * @author d.kariro
 */
@Named
@Data
public class SignUpBacking {
    
    private String firstName;
    private String otherNames;
    private String email;
    private UserType userType;
    private UserRole userRole;
    private String password;
    
}
