/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.donkariro.takataka24.dto;

import com.donkariro.takataka24.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 *
 * @author DonKariro
 */
@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface UserMapper {
    
    User userDTOToUser(UserDTO dto);
}
