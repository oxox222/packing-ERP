package com.plz.modules.service;

import com.plz.modules.model.User;

public interface UserService {

    User findByUserName(String userName);
}
