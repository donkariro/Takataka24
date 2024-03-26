/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author d.kariro
 */
@Entity
@Data
public class WasteCollectionServiceRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String hazardousStatus;
    private String biodegradableStatus;
    private NaturalState naturalState;
    private boolean isWasteSorted;
    private String wasteClass;
    private List<String> keyMaterialsInWaste;

    
}
