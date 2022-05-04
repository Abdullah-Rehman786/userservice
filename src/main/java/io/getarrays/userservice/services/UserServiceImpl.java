package io.getarrays.userservice.services;

import io.getarrays.userservice.models.User;
import io.getarrays.userservice.models.Role;
import io.getarrays.userservice.repos.RoleRepo;
import io.getarrays.userservice.repos.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
//requiredargsconstructor is for dependency injection
//slf4j is for logging
//Transactional allows us to perform actions on repos without having to explicitly
//call .save()
public class UserServiceImpl implements UserService{

    //These repos communicate with JPA to make querying easier
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    @Override
    public User saveUser(User user) {
        log.info("Saving new user {} to db", user.getUsername());
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role {} to db", role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding role {} to user {}", roleName, username);
        User user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);

        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("Fetching user {}", username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching all users");
        return userRepo.findAll();
    }
}
