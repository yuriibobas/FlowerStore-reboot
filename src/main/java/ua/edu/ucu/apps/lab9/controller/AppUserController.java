package ua.edu.ucu.apps.lab9.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab9.model.AppUser;
import ua.edu.ucu.apps.lab9.service.AppUserService;

@RestController
public class AppUserController {
    private AppUserService appUserService;

    @Autowired        // @Component
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping("/users")
    public List<AppUser> getUsers() {
        return appUserService.getUsers();
    }

    @PostMapping("/users")
    public AppUser createUser(@RequestBody AppUser appUser) {
        return appUserService.createUser(appUser);
    }

    @GetMapping("/users/email")
    public ResponseEntity<AppUser> getUserByEmail(@RequestParam String email) {
        Optional<AppUser> userByEmail = appUserService.getUserbyEmail(email);
        if (userByEmail.isPresent()) {
            return ResponseEntity.ok(userByEmail.get());
        }
        return ResponseEntity.notFound().build();
    }
}
