package com.tienda.landing.controller;

import com.tienda.landing.models.dto.UserDTO;
import com.tienda.landing.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
@Autowired
    private final UserService service;

public UserController(UserService service){
this.service = service;
}
    @GetMapping(value = "/user/id")
    public void getUserById(@PathVariable Long id) {

    }

    @PostMapping(value = "/user")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user) {
        return ResponseEntity.status(HttpStatus.OK).body(service.getUserById(id));

    }

    public void updateUser() {

    }

    public void updateAllUser() {

    }

    public void deleteUser() {

    }
}
