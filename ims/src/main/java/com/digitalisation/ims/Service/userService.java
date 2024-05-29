package com.digitalisation.ims.Service;
import com.digitalisation.ims.Repository.userRepository;
import com.digitalisation.ims.model.user;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class userService {
    private final userRepository userRepository;
    public List<user> getAllUsers() {
        return userRepository.findAll();
    }
    public Optional<user> getUserByName(String name) {
        return userRepository.findByName(name);
    }


}
