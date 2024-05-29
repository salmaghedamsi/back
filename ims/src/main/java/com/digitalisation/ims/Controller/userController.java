package com.digitalisation.ims.Controller;
import com.digitalisation.ims.Service.userService;
import com.digitalisation.ims.model.user;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class userController {

    private final userService userService;


    @GetMapping
    public ResponseEntity<List<user>> getAllUsers() {
        List<user> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
    @GetMapping("/{name}")
    public ResponseEntity<user> getUserByName(@PathVariable String name) {
        Optional<user> user = userService.getUserByName(name);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }}