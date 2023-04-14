package com.spring.repo.controller;

import com.spring.repo.entity.UserDetails;
import com.spring.repo.service.UserDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserDetailsController {

    private final UserDetailsService service;

    public UserDetailsController(UserDetailsService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    List<UserDetails> getAll() {
        log.info("============= Get All Method Start =============");
        log.info("getAll() -> | ");
        List<UserDetails> all = service.getAll();
        log.info("getAll() -> | List User : {}",all);
        log.info("============= Get All Method End =============");
        return all;
    }
    @GetMapping("/get/{id}")
    UserDetails getById(@PathVariable String id) {
        log.info("============= Get By Id Method Start =============");
        log.info("getById(String) -> | Id : {}",id);
        UserDetails tempUser = service.getById(id);
        log.info("getById(String) -> | UserDetails : {}",tempUser);
        log.info("============= Get By Id Method End =============");
        return tempUser;
    }
    @PostMapping("/create")
    UserDetails create(@RequestBody UserDetails userDetails) {
        log.info("============= Create Method Start =============");
        log.info("create(UserDetails) -> | UserDetails : {}",userDetails);
        UserDetails user = service.create(userDetails);
        log.info("create(UserDetails) -> | UserDetails : {}",user);
        log.info("============= Create Method End =============");
        return user;
    }
    @PutMapping("/update/{id}")
    UserDetails update(@PathVariable String id,@RequestBody UserDetails userDetails) {
        log.info("============= Update Method Start =============");
        log.info("update(String,UserDetails) -> | Id : {} | UserDetails : {}",id,userDetails);
        UserDetails user = service.update(id, userDetails);
        log.info("update(String,UserDetails) -> | UserDetails : {}",user);
        log.info("============= Update Method End =============");
        return user;
    }
    @DeleteMapping("/delete/{id}")
    void deleteById(@PathVariable String id) {
        log.info("============= Delete By Id Method Start =============");
        log.info("deleteById(String) -> | Id : {}",id);
        service.deleteById(id);
        log.info("deleteById(String) -> | Id : {} | Deleted...",id);
        log.info("============= Delete By Id Method End =============");
    }


}
