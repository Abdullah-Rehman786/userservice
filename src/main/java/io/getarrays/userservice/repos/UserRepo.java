package io.getarrays.userservice.repos;

import io.getarrays.userservice.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser, Long>{
    AppUser findByUsername(String username);
}
