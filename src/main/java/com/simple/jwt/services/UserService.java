package com.simple.jwt.services;

import com.simple.jwt.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService
{
    private static Map<String, User> users = new HashMap<String, User>();
    static {
        users.put(
                "user1", User
                            .builder()
                            .userName("user1")
                            .passWord("123") // Never do this!
                            .email("user1@romania.com")
                            .role(User.ROLE_ADMIN)
                            .isActivated(true)
                            .build()
        );
    }

    public User findUserByUserName(String userName)
    {
        return users.get(userName);
    }


    public Boolean authenticate(String userName, String passWord)
    {
        User user = findUserByUserName(userName);
        if (null!=user)
        {
            return user.getPassWord().equals(passWord);
        }
        return false;
    }
}
