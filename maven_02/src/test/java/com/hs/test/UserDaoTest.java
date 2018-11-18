package com.hs.test;

import com.hs.dao.UserDao;
import com.hs.domain.User;
import com.hs.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
    @Test
    public void findById(){
        //先获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

      /*  //获取dao代理对象
       UserDao userDao = ac.getBean(UserDao.class);

       //调用方法
        User user = userDao.findById(41);

        System.out.println(user.getUsername());*/

        UserService servcie = ac.getBean(UserService.class);

        User user = servcie.findById(41);
        System.out.println(user.getUsername());

    }

}
