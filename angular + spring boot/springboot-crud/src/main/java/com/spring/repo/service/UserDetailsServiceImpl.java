package com.spring.repo.service;

import com.spring.repo.entity.UserDetails;
import com.spring.repo.exception.UserNotFoundException;
import com.spring.repo.repository.UserDetailsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService{

    private final UserDetailsRepository repository;

    public UserDetailsServiceImpl(UserDetailsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<UserDetails> getAll() {
        log.info("getAll() -> | ");
        List<UserDetails> all = repository.findAll();
        log.info("getAll() -> | User Details : {}",all);
        return all;
    }

    @Override
    public UserDetails getById(String id) {
        log.info("getById(String) -> | Id : {}",id);
        UserDetails userDetails = repository.findById(id).orElseThrow(UserNotFoundException::new);
        log.info("getById(String) -> | UserDetails : {}",userDetails);
        return userDetails;
    }

    @Override
    public UserDetails create(UserDetails userDetails) {
        log.info("create(UserDetails) -> | UserDetails Param : {}",userDetails);
        userDetails.setUserId(UUID.randomUUID().toString());
        log.info("create(UserDetails) -> | UserDetails setUserId: {}",userDetails);
        UserDetails save = repository.save(userDetails);
        log.info("create(UserDetails) -> | UserDetails return : {}",save);
        return save;
    }

    @Override
    public UserDetails update(String id, UserDetails userDetails) {
        log.info("update(String,UserDetails) -> | Id : {} | UserDetails : {}",id,userDetails);
        UserDetails tempUser = getById(id);
        tempUser.setName(userDetails.getName());
        tempUser.setEmail(userDetails.getEmail());
        tempUser.setPassword(userDetails.getPassword());

        log.info("update(String,UserDetails) -> | UserDetails : {}",tempUser);
        UserDetails save = repository.save(tempUser);
        log.info("update(String,UserDetails) -> | UserDetails : {}",save);
        return save;
    }

    private boolean findIdIsPresent(String id) {
        UserDetails user = getById(id);
        return user != null;
    }

    @Override
    public void deleteById(String id) {
        log.info("deleteById(String) -> | Id : {}",id);
        if(id != null) {
            boolean found = findIdIsPresent(id);
            if(found) {
                log.info("deleteById(String) -> | Id : {} | Present",id);
                repository.deleteById(id);
            }
            else {
                log.info("deleteById(String) -> | Id : {} | Not Present",id);
                throw new UserNotFoundException();
            }
        }
        log.info("deleteById(String) -> | Id : {} | Deleted...",id);
    }


}
