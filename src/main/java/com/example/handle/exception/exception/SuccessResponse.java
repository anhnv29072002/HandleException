package com.example.handle.exception.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SuccessResponse {

    private String message;
    private int status;
    private Object data;

    public final static String SUCCESS = "SUCCESS";
    public final static String FAILED = "FAILED";

}
