package com.example.AuthSystem.service;

import com.example.AuthSystem.Repo.UserRepository;
import com.example.AuthSystem.entity.UserEntity;
import com.example.AuthSystem.io.ProfileRequest;
import com.example.AuthSystem.io.ProfileResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService{

private final UserRepository userRepository;
    @Override
    public ProfileResponse createProfile(ProfileRequest request) {
        UserEntity newProfile = converToUserEntity(request);
        newProfile = userRepository.save(newProfile);
        return null;
    }
}
