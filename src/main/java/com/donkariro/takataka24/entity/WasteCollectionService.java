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
public class WasteCollectionService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String serviceProvided;
    private NaturalState wasteNatState;
    private String wasteClass;
    private boolean doYouHandleHazardousWaste;
    private List<String> wasteTreatmentMethods;
    private int volumeHandledWeekly;
    
}
