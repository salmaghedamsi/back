package com.digitalisation.ims.Service;

import com.digitalisation.ims.Repository.RapportRepository;
import com.digitalisation.ims.Repository.userRepository;
import com.digitalisation.ims.model.ims;
import com.digitalisation.ims.model.instruction;
import com.digitalisation.ims.model.rapport;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RapportService {
    private final RapportRepository Repository;
    public rapport createRapport(rapport rapport) {
        return Repository.save(rapport);
    }
    public List<rapport> getAllRapport() {
        return Repository.findAll();
    }

    public rapport getInstructionById(long id) {
        return Repository.findById(id)
                .orElseThrow(() -> new RuntimeException("rapprt not found"));
    }

}