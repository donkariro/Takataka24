/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donkariro.takataka24.jsflayer.wastegenerator;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.model.SelectItem;
import jakarta.faces.model.SelectItemGroup;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author d.kariro
 */
@Named
@RequestScoped
public class MultiSelectView {

    private List<SelectItem> categories;
    private String selection;

    @PostConstruct
    public void init() {
        categories = new ArrayList<>();
        SelectItemGroup residential = new SelectItemGroup("Residential");
        SelectItemGroup commercial = new SelectItemGroup("Commercial");
        SelectItemGroup industrial = new SelectItemGroup("Industrial");
        SelectItemGroup hospitality = new SelectItemGroup("Hospitality");

        
        SelectItem singleFamily = new SelectItem("single_family", "Single family home");
        SelectItem apartment = new SelectItem("apartment", "Apartment");
        SelectItem condo = new SelectItem("condo", "Condominium");
        SelectItem multiFamily = new SelectItem("multi_family", "Multi family home");
        SelectItem townhouse = new SelectItem("townhouse", "Townhouse");
        
        SelectItem retail = new SelectItem("retail", "Retail");
        SelectItem gasStation = new SelectItem("gas_station", "Gas station");
        SelectItem officeSpace = new SelectItem("office_space", "Office space");
        SelectItem hospital = new SelectItem("hospital", "Hospital");
        SelectItem mixedUse = new SelectItem("mixed_use", "Mixed use");
        SelectItem cinema = new SelectItem("cinema", "Cinema");
       
        SelectItem warehouse = new SelectItem("warehouse", "Warehouse");
        SelectItem manufacturingFacility = new SelectItem("manufacturing_facility", "Manufacturing Facility");
        SelectItem distributionCenter = new SelectItem("distribution_center", "Distribution center");
        SelectItem dataCenter = new SelectItem("data_center", "Data center");
        SelectItem foodProcessing = new SelectItem("food_processing_plant", "Food processing plant");
        SelectItem powerPlant = new SelectItem("power_plant", "Power plant");
        SelectItem solarGenStation = new SelectItem("solar_gen_station", "Solar generating station");
        SelectItem rnd = new SelectItem("research_and_dev", "Reasearch and development station");
        
        
        SelectItem hotel = new SelectItem("hotel", "Hotel");
        SelectItem restaurant = new SelectItem("restaurant", "Restaurant");
        SelectItem resort = new SelectItem("resort", "Resort");
        SelectItem casino = new SelectItem("casino", "Casino");
        
        residential.setSelectItems(new SelectItem[]{singleFamily, apartment, condo, multiFamily, townhouse});
        commercial.setSelectItems(new SelectItem[]{retail, gasStation, officeSpace, hospital, mixedUse, cinema});
        industrial.setSelectItems(new SelectItem[]{warehouse, manufacturingFacility, distributionCenter, dataCenter, foodProcessing, powerPlant, solarGenStation, rnd});
        hospitality.setSelectItems(new SelectItem[]{hotel, restaurant, resort, casino});

        categories.add(residential);
        categories.add(commercial);
        categories.add(industrial);
        categories.add(hospitality);
    }

    public List<SelectItem> getCategories() {
        return categories;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }
}
