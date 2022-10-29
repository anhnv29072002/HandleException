package com.example.handle.exception.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ApiResponse {

    public static ResponseEntity<SuccessResponse> successOK(Object object){
        return ResponseEntity.ok(new SuccessResponse(SuccessResponse.SUCCESS, HttpStatus.OK.value(),object));
    }

    public static ResponseEntity<SuccessResponse> successOK(){
        return ResponseEntity.ok(new SuccessResponse(SuccessResponse.SUCCESS, HttpStatus.OK.value(),null));
    }

    public static ResponseEntity<SuccessResponse> successCreated(Object object){
        return ResponseEntity.ok(new SuccessResponse(SuccessResponse.SUCCESS, HttpStatus.CREATED.value(),object));
    }

}
