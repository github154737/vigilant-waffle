package com.example.demo;

import com.example.demo.DAO.UserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserDAO userdao;

    @Test
    void contextLoads() {
        System.out.println("===========test case============");
        System.out.println(userdao.getByName("sa"));
        System.out.println(userdao.updateByName("test","ifsuccess"));

    }

}
