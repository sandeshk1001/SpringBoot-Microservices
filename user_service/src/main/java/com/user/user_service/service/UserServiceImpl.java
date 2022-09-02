package com.user.user_service.service;

import com.user.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //manual list for testing
    List<User> list = List.of(
            new User(1311L, "Durgesh Tiwari", "23525625",new ArrayList<>()),
            new User(1312L, "Ankit Tiwari", "99999",new ArrayList<>()),
            new User(1314L, "Ravi Tiwari", "888",new ArrayList<>())
    );
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
