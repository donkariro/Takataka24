/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.donkariro.takataka24.mappers;

import com.donkariro.takataka24.dto.UserDTO;
import com.donkariro.takataka24.entity.Member;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 *
 * @author DonKariro
 */
@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface UserMapper {
     
   
    Member userDTOToUser(UserDTO dto);
    
    UserDTO memberToUserDTO(Member member);
}
