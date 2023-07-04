package com.example.mapeo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;


public interface BaseRequestMapper<I,O> {

    O dtoToEntity(I request);

}
