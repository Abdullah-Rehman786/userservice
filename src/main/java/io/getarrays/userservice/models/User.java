package io.getarrays.userservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.AUTO;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String first_name;
    private String last_name;
    private boolean is_admin;
    private String email_address;
    private String phone_number;
    private String username;
    private String password;

    @ManyToMany(fetch = EAGER)
    private Collection<Role> roles = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
