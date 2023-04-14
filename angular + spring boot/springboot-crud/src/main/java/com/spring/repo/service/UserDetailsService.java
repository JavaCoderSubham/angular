package com.spring.repo.service;

import com.spring.repo.entity.UserDetails;

import java.util.List;

public interface UserDetailsService {
    List<UserDetails> getAll();
    UserDetails getById(String id);
    UserDetails create(UserDetails userDetails);
    UserDetails update(String id, UserDetails userDetails);
    void deleteById(String id);
}
