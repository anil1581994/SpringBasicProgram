package com.bridgelabz.service;
import com.bridgelabz.model.Login;
import com.bridgelabz.model.User;

public interface UserService {
    void register(User user);
    User validateUser(Login login);
}
