package com.digitalisation.ims.Repository;

import com.digitalisation.ims.model.ims;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImsRepository extends JpaRepository<ims, Double> {
}