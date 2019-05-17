package com.northlabs.demoservice.rest.controller;

import com.northlabs.demo.api.UserApi;
import com.northlabs.demo.api.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController implements UserApi {

    @Override
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setGender(User.GenderEnum.MALE);
        user.setDateOfBirth("01-01-1970");
        return ResponseEntity.ok(user);
    }
}
