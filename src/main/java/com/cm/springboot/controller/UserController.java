package com.cm.springboot.controller;

import com.cm.springboot.mapper.UserMapper;
import com.cm.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("test")
    @ResponseBody
    public String  test(){
        return "Test";
    }

    @RequestMapping("user")
    @ResponseBody
    public List<User> getUser(){
        return userMapper.listAll();
    }

    @RequestMapping("insert1")
    @ResponseBody
    public String insert1(){
        String s = null;
        try {
            User user = new User("lisi",98,"19812345678");
            userMapper.insert(user);
            s = "ok";
        }catch (Exception e){
            System.out.println(e.getMessage());
            s = "出错了";
        }
        return s;
    }

    @RequestMapping("insert")
    @ResponseBody
    public String  insert(){
        String s = null;
        try {
            List<User> users = new ArrayList<>();
            User user = new User("lisi",98,"19812345678");
            User user1 = new User("si",98,"19812345678");
            User user2 = new User("i",98,"19812345678");
            users.add(user);
            users.add(user1);
            users.add(user2);
            for (User u :users){
                System.out.println(u);
            }
            userMapper.inserts(users);
            s = "ok";
        }catch (Exception e){
            System.out.println(e.getMessage());
            s = "出错了";
        }
        return s;
    }
}
