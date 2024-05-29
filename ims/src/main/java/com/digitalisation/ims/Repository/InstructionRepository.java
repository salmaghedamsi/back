package com.digitalisation.ims.Repository;

import com.digitalisation.ims.model.instruction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructionRepository extends JpaRepository<instruction,String> {
}
