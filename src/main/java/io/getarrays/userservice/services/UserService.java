package io.getarrays.userservice.services;

import io.getarrays.userservice.models.AppUser;
import io.getarrays.userservice.models.Role;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser appUser);
    Role saveRole(Role role);
    void addRoleToAppUser(String username, String roleName);
    AppUser getUser(String username);

    /*This should be refactored so that requests to get users are not returning potentially
    millions of users from the db. the number returned should be application specific and
    possibly return a specific set based on an incoming page number parameter*/
    List<AppUser> getUsers();
}
