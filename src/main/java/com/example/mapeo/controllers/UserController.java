package com.example.mapeo.controllers;

import com.example.mapeo.dtos.UserRequestDTO;
import com.example.mapeo.dtos.UserResponseDTO;
import com.example.mapeo.exceptions.NotFoundException;
import com.example.mapeo.services.UserService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/")
    public ResponseEntity<?> index() {
        return ResponseEntity.ok(this.service.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {
        UserResponseDTO user = this.service.show(id);
        if (user == null) {
            throw new NotFoundException("id:" +  id);
        }
        return ResponseEntity.ok(user);

    }

    @PostMapping("/")
    public ResponseEntity<?> store(@Valid @RequestBody UserRequestDTO user) {
        return ResponseEntity.status(CREATED).body(this.service.store(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        this.service.deleteById(id);
        return ResponseEntity.status(NO_CONTENT).build();
    }
}
