package com.digitalisation.ims.Repository;

import com.digitalisation.ims.model.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends JpaRepository<Action,Long> {
}
