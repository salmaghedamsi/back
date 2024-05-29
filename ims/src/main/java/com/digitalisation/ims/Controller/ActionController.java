package com.digitalisation.ims.Controller;

import com.digitalisation.ims.Service.ActionService;
import com.digitalisation.ims.model.Action;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}