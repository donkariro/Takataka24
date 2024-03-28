/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.dto;

import com.donkariro.takataka24.entity.Address;
import com.donkariro.takataka24.entity.PremisesOwnership;
import lombok.Data;

/**
 *
 * @author d.kariro
 */
@Data
public class PremisesDTO {
    
    private int id;
    private String name;
    private PremisesOwnership ownership;
    private Address address;
    private String category;
    private String type;
    
}
