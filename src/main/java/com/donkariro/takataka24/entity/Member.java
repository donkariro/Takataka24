/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import static jakarta.persistence.EnumType.STRING;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author d.kariro
 */
@Entity
@Data
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="other_names")
    private String otherNames;
    private String email;
    @Column(name="phone_number")
    private String phoneNumber;
    private String password;
    @Enumerated(STRING)
    @Column(name="user_role")
    private UserRole role;
    @Enumerated(STRING)
    @Column(name="user_type")
    private UserType userType;
    
          
}
