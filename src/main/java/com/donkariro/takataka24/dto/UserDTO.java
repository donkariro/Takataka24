/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.dto;

import com.donkariro.takataka24.entity.UserRole;
import com.donkariro.takataka24.entity.UserType;
import lombok.Data;

/**
 *
 * @author DonKariro
 */
@Data
public class UserDTO {
    
    private String firstName;
    private String otherNames;
    private String email;
    private String phoneNumber;
    private UserType userType;
    private UserRole userRole;
    private String password; 
    
    
}
