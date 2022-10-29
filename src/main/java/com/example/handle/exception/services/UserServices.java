package com.example.handle.exception.services;

import com.example.handle.exception.entities.User;
import com.example.handle.exception.mapper.UserMapper;
import com.example.handle.exception.repository.UserRepository;
import com.example.handle.exception.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public UserRequest getById(UserRequest userRequest) {
        if (Objects.isNull(userRequest)) return null;
        return UserMapper.convertToUserRequest(this.userRepository.findById(userRequest.getId()).get());
    }

    public UserRequest create(UserRequest userRequest) {
        if (Objects.isNull(userRequest)) return null;
        this.userRepository.save(UserMapper.convertToUser(userRequest));
        return userRequest;
    }

    public UserRequest update(UserRequest userRequest) {
        if (Objects.isNull(userRequest)) return null;
        User userResponse = this.userRepository.findById(userRequest.getId()).map(user -> {
            user.setNote(userRequest.getNote());
            user.setUsername(userRequest.getUsername());
            user.setPassword(userRequest.getPassword());
            return this.userRepository.save(user);
        }).orElse(null);
        return UserMapper.convertToUserRequest(userResponse);
    }

    public void delete(Long id) {
        User user = this.userRepository.findById(id).orElse(null);
        this.userRepository.deleteById(user.getId());
    }

}
