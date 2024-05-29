package com.digitalisation.ims.Repository;

import com.digitalisation.ims.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface userRepository  extends JpaRepository<user,Integer> {
    Optional<user> findByName(String name);
    Optional<user> findByEmail(String email);


}
