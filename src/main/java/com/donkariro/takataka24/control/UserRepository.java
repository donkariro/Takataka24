/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package com.donkariro.takataka24.control;

import com.donkariro.takataka24.entity.User;
import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 *
 * @author DonKariro
 */
@Stateless
@LocalBean
public class UserRepository {

    @PersistenceContext
    EntityManager entityManger;
    
    public void insertUser(User user){
        entityManger.persist(user);
        
    }
    
}
