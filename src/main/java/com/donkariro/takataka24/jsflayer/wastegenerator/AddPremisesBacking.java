/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.jsflayer.wastegenerator;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Data;

/**
 *
 * @author d.kariro
 */
@Named
@RequestScoped
@Data
public class AddPremisesBacking {
    
    private String name;
    private String ownership;
    private String county;
    private String city;
    private String estate;
    private String street;
    private String category;
    private String type;
    
    private String submitPremises(){
        return "";
    }
    
}
