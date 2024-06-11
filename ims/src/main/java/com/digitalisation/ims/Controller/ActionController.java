package com.digitalisation.ims.Controller;

import com.digitalisation.ims.Service.ActionService;
import com.digitalisation.ims.model.Action;
import com.digitalisation.ims.model.ims;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/action")
public class ActionController {
    private final ActionService actionService;

    @GetMapping
    public ResponseEntity<List<Action>> getAllActions() {
        List<Action> actions = actionService.getAllActions();
        return ResponseEntity.ok(actions);
    }
    @PostMapping
    public ResponseEntity<List<Action>> saveAllActions( @RequestBody List<Action> actions) {
        List<Action> savedActions = actionService.saveAllActions(actions);
        return ResponseEntity.ok(savedActions);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Action> updateAction(@PathVariable Long id, @RequestBody Action actionDetails) {
        try {
            Action updatedAction = actionService.updateAction(id, actionDetails);
            return ResponseEntity.ok(updatedAction);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}