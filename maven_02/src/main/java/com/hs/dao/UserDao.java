package com.hs.dao;

import com.hs.domain.User;

public interface UserDao {

    public User findById(Integer id);
}
