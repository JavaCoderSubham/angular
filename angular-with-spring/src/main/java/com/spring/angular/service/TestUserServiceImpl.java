package com.spring.angular.service;

import com.spring.angular.entity.TestUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestUserServiceImpl implements TestUserService {

//    private final log =
    @Override
    public void createData(TestUser user) {
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
    }
}
