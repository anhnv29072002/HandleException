package com.example.handle.exception.mapper;

import com.example.handle.exception.entities.User;
import com.example.handle.exception.request.UserRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserMapper {

    public static User convertToUser(UserRequest userRequest) {
        User user = new ObjectMapper().convertValue(userRequest, User.class);
        return user;
    }

    public static UserRequest convertToUserRequest(User user) {
        UserRequest userRequest = new ObjectMapper().convertValue(user, UserRequest.class);
        return userRequest;
    }

}