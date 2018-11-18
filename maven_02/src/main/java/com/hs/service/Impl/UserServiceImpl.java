package com.hs.service.Impl;

import com.hs.dao.UserDao;
import com.hs.domain.User;
import com.hs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Integer id ) {

        return userDao.findById(id);
    }
}
