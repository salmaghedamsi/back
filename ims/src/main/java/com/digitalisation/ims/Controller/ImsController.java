package com.digitalisation.ims.Controller;

import com.digitalisation.ims.Service.ImsService;
import com.digitalisation.ims.model.ims;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ims")
public class ImsController {
    private final ImsService imsService;
    @GetMapping
    public ResponseEntity<List<ims>> getAllIms() {
        List<ims> imsList = imsService.getAllIms();
        return ResponseEntity.ok(imsList);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ims> getUserById(@PathVariable Double id) {
        Optional<ims> ims = imsService.getImsById(id);
        return ims.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PostMapping
    public ims createIms(@RequestBody ims ims) {
        return imsService.createIms(ims);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ims> updateIms(@PathVariable Double id, @RequestBody ims imsDetails) {
        try {
            ims updatedIms = imsService.updateIms(id, imsDetails);
            return ResponseEntity.ok(updatedIms);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIms(@PathVariable Double id) {
        imsService.deleteIms(id);
        return ResponseEntity.noContent().build();
    }
}
