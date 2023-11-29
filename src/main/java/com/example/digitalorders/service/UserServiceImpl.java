package com.example.digitalorders.service;

import com.example.digitalorders.entities.User;
import com.example.digitalorders.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.getAllById(id);
    }
}
