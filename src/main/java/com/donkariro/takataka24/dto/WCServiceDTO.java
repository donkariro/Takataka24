/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.dto;

import com.donkariro.takataka24.entity.NaturalState;
import java.util.List;
import lombok.Data;

/**
 *
 * @author d.kariro
 */
@Data
public class WCServiceDTO {
    
    private String serviceProvided;
    private NaturalState wasteNatState;
    private String wasteClass;
    private boolean doYouHandleHazardousWaste;
    private List<String> wasteTreatmentMethods;
    private int volumeHandledWeekly;
    
}
