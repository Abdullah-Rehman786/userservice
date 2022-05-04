package io.getarrays.userservice.repos;

import io.getarrays.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
