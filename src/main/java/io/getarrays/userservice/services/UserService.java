package io.getarrays.userservice.services;

import io.getarrays.userservice.models.User;
import io.getarrays.userservice.models.Role;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);

    /*This should be refactored so that requests to get users are not returning potentially
    millions of users from the db. the number returned should be application specific and
    possibly return a specific set based on an incoming page number parameter*/
    List<User> getUsers();
}
