/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.jsflayer.wastegenerator;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author d.kariro
 */
@Named
@ViewScoped
public class AutoCompleteView implements Serializable {

    @Getter
    @Setter
    List<String> materialTypes = Arrays.asList("Food wastes", "paper", "cardboard", "plastics", "textiles", "leather", "yard wastes", "wood", "glass", "metals", "ashes", "consumer"
            + "                                  electronics", "batteries", "oil", "tires", "household", "Street sweepings", "landscape", "tree trimmings", "general wastes recreational areas", "sludge", "Spoiled food wastes", "agricultural wastes");

    @Getter
    @Setter
    private List<String> selectedMaterial;
    
    @PostConstruct
    public void init() {
        
    }


    public List<String> completeMaterial(String query) {
        String queryLowerCase = query.toLowerCase();       
        return materialTypes.stream().filter(t -> t.toLowerCase().startsWith(queryLowerCase)).collect(Collectors.toList());
    }

  

}
