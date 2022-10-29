package com.example.handle.exception.controller;

import com.example.handle.exception.exception.ApiResponse;
import com.example.handle.exception.exception.SuccessResponse;
import com.example.handle.exception.request.UserRequest;
import com.example.handle.exception.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserServices userServices;

//    @GetMapping(value = {"", "all"})
//    public ResponseEntity<SuccessResponse> all() {
//        return ApiResponse.successOK(this.userRepository.findAll());
//    }

    @GetMapping(value = "/find")
    public ResponseEntity<SuccessResponse> findBy(@RequestBody UserRequest userRequest) {
        return ApiResponse.successOK(this.userServices.getById(userRequest));
    }

    @PostMapping("/create")
    public ResponseEntity<SuccessResponse> create(@Validated @RequestBody UserRequest userRequest) {
        return ApiResponse.successCreated(this.userServices.create(userRequest));
    }

    @PutMapping(value = "/update")
    public ResponseEntity<SuccessResponse> update(@Validated @RequestBody UserRequest userRequest) {
        return ApiResponse.successOK(this.userServices.update(userRequest));
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<SuccessResponse> delete(@RequestBody UserRequest userRequest) {
        this.userServices.delete(userRequest.getId());
        return ApiResponse.successOK();
    }

}
