package io.getarrays.userservice;

import io.getarrays.userservice.models.Role;
import io.getarrays.userservice.models.User;
import io.getarrays.userservice.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

//	@Bean
//	CommandLineRunner run(UserService userService) {
//		return args -> {
//			userService.saveRole(new Role(null, "ROLE_USER"));
//			userService.saveRole(new Role(null, "ROLE_MANAGER"));
//			userService.saveRole(new Role(null, "ROLE_ADMIN"));
//			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//			userService.saveUser(new User(null, "John Travolta", "john", true, "jtravolta@mail.com", "6361234567", "john", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "Will Smith", "will", true, "jtravolta@mail.com", "6361234567", "will", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "Jim Carry", "jim", true, "jtravolta@mail.com", "6361234567", "jim", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "Arnold Schwarzenegger", "arnold", true, "jtravolta@mail.com", "6361234567", "arnold", "1234", new ArrayList<>()));
//
//			userService.addRoleToUser("john", "ROLE_USER");
//			userService.addRoleToUser("will", "ROLE_MANAGER");
//			userService.addRoleToUser("jim", "ROLE_ADMIN");
//			userService.addRoleToUser("arnold", "ROLE_SUPER_ADMIN");
//			userService.addRoleToUser("arnold", "ROLE_ADMIN");
//			userService.addRoleToUser("arnold", "ROLE_USER");
//		};
//	}
}

