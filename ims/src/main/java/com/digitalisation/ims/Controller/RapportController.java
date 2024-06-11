package com.digitalisation.ims.Controller;

import com.digitalisation.ims.Repository.RapportRepository;
import com.digitalisation.ims.model.rapport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rapport")
public class RapportController {

    @Autowired
    private RapportRepository Repository;

    @PostMapping
    public ResponseEntity<String> saveAudit(@RequestBody rapport rapport) {
        Repository.save(rapport);
        return ResponseEntity.status(HttpStatus.CREATED).body("rapport saved successfully");
    }
}