/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.jsflayer.wastegenerator;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.List;
import lombok.Data;

/**
 *
 * @author d.kariro
 */
@Named("wcsrbacking")
@RequestScoped
@Data
public class WasteCollectionServiceRequestBacking {
    
    private String hazardStatus;
    private String biodegradableStatus;
    private String naturalState;
    private String isWasteSorted;
    private String wasteClass;
    private List<String> keyMaterialsInWaste;
    
}
