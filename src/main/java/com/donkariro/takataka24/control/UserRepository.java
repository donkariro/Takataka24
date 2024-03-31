/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package com.donkariro.takataka24.control;

import com.donkariro.takataka24.entity.Member;
import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.security.enterprise.identitystore.Pbkdf2PasswordHash;

/**
 *
 * @author DonKariro
 */
@Stateless
@LocalBean
public class UserRepository {

    @PersistenceContext
    EntityManager entityManger;
    
    public void insertUser(Member user){
        
        entityManger.persist(user);
        
    }
    
}
