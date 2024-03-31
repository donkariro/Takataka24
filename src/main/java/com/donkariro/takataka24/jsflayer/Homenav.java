/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.jsflayer;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author DonKariro
 */
@Named
@RequestScoped
public class Homenav {
    
    public String goToSignup(){
        return "signup";
    }
    
    public String goToLogin(){
        return "login";
    }
    
}
