package com.digitalisation.ims.Service;

import com.digitalisation.ims.Repository.userRepository;
import com.digitalisation.ims.Repository.InstructionRepository;
import com.digitalisation.ims.model.instruction;
import com.digitalisation.ims.model.user;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InstructionService {
    private final InstructionRepository instructionRepository;
    private final userRepository userRepository;
    public user getResponsableForInstruction(String instructionId) {
        instruction instruction = instructionRepository.findById(instructionId)
                .orElseThrow(() -> new RuntimeException("Instruction not found"));
        return userRepository.findById(instruction.getResponsable())
                .orElseThrow(() -> new RuntimeException("Responsable not found"));
    }
    public List<instruction> getAllInstructions() {
        return instructionRepository.findAll();
    }

    public instruction getInstructionById(String id) {
        return instructionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Instruction not found"));
    }

    public instruction saveInstruction(instruction instruction) {
        return instructionRepository.save(instruction);
    }


}
