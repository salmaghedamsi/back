package com.digitalisation.ims.Controller;

import com.digitalisation.ims.Service.InstructionService;
import com.digitalisation.ims.model.ims;
import com.digitalisation.ims.model.instruction;
import com.digitalisation.ims.model.user;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("instruction")
public class InstructionController {
    private final InstructionService instructionService;
    @GetMapping
    public ResponseEntity<List<instruction>> getAllInstructions() {
        List<instruction> instructions = instructionService.getAllInstructions();
        return ResponseEntity.ok(instructions);
    }

    @GetMapping("/{id}")
    public ResponseEntity<instruction> getInstructionById(@PathVariable String id) {
        instruction instruction = instructionService.getInstructionById(id);
        return ResponseEntity.ok(instruction);
    }

    @PostMapping
    public ResponseEntity<instruction> createInstruction(@RequestBody instruction instruction) {
        instruction savedInstruction = instructionService.saveInstruction(instruction);
        return ResponseEntity.ok(savedInstruction);
    }

    @GetMapping("/{id}/responsable")
    public ResponseEntity<user> getResponsableForInstruction(@PathVariable String id) {
        user user = instructionService.getResponsableForInstruction(id);
        return ResponseEntity.ok(user);
    }


    }
