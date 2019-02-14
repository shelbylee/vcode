package org.sduwh.vcode.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sduwh.vcode.server.domain.User;
import org.sduwh.vcode.server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class VCodeTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = new User();
        user.setEmail("a1");
        user.setUsername("b1");
        user.setPassword("c1");
        userMapper.insert(user);
        System.out.println(user);
        System.out.println(userMapper.list());
    }
}
