package com.example.mapeo.mappers;

import com.example.mapeo.dtos.UserRequestDTO;
import com.example.mapeo.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserRequestMapper extends BaseRequestMapper<UserRequestDTO, User> {

}
