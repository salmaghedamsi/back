package com.digitalisation.ims.Service;

import com.digitalisation.ims.Repository.userRepository;
import com.digitalisation.ims.Repository.InstructionRepository;
import com.digitalisation.ims.model.ims;
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
