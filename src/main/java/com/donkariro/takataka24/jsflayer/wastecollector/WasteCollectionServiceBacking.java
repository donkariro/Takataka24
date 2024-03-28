/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.jsflayer.wastecollector;

import jakarta.enterprise.context.RequestScoped;
import java.util.List;
import jdk.jfr.Name;
import lombok.Data;

/**
 *
 * @author d.kariro
 */
@Name("wcsbacking")
@RequestScoped
@Data
public class WasteCollectionServiceBacking {
    
    private String serviceProvided;
    private String wasteNaturalState;
    private String wasteClass;
    private boolean doYouHandleHazardousWaste;
    private List<String> treatmentMethods;
    private int volumeHandledWeekly;
    
}
