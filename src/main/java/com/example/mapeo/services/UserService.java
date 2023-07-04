package com.example.mapeo.services;

import com.example.mapeo.dtos.UserRequestDTO;
import com.example.mapeo.dtos.UserResponseDTO;
import com.example.mapeo.entities.User;
import com.example.mapeo.mappers.BaseRequestMapper;
import com.example.mapeo.mappers.BaseResponseMapper;
import com.example.mapeo.mappers.UserRequestMapper;
import com.example.mapeo.mappers.UserResponseMapper;
import com.example.mapeo.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class UserService extends BaseService<User, Long, UserRequestDTO, UserResponseDTO>  {

    private static Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserRequestMapper request;

    @Autowired
    private UserResponseMapper response;

    @Override
    protected JpaRepository<User, Long> getRepository() {
        return this.repository;
    }

    @Override
    protected BaseRequestMapper<UserRequestDTO, User> getInputMapper() {
        return this.request;
    }

    @Override
    protected BaseResponseMapper<User, UserResponseDTO> getOutputMapper() {
        return this.response;
    }


}
