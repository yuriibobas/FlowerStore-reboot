package ua.edu.ucu.apps.lab9.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.edu.ucu.apps.lab9.model.AppUser;
import ua.edu.ucu.apps.lab9.repository.AppUserRepository;

@Service
public class AppUserService {
    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    public AppUser createUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    public Optional<AppUser> getUserbyEmail(String email) {
        return appUserRepository.findUserByEmail(email);
    }
}
