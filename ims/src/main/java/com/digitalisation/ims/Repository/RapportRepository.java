package com.digitalisation.ims.Repository;

import com.digitalisation.ims.model.rapport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RapportRepository extends JpaRepository<rapport, Long> {
}