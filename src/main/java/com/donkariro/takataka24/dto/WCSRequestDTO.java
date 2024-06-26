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
public class WCSRequestDTO {
    
    private String hazardousStatus;
    private String biodegradableStatus;
    private NaturalState naturalState;
    private boolean isWasteSorted;
    private String wasteClass;
    private List<String> keyMaterialsInWaste;
    
}
