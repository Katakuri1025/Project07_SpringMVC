package com.bjpowernode.controller;

import com.bjpowernode.pojo.User;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author deuses
 * @creat 2022-09-01 21:39
 */
//@Controller
@RestController //controller_responseBody
@CrossOrigin   //支持跨域访问
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    public static final int PAGE_SIZE = 5;

    @RequestMapping("/selectUserPage")
//    @ResponseBody
    public List<User> selectUserPage(String userName,String userSex,Integer page){
        if(page == null){
            page = 1;
        }
        return userService.selectUserPage(userName,userSex,page,PAGE_SIZE);
    }

    @RequestMapping("/getRowCount")
//    @ResponseBody
    public int getRowCount(String userName, String userSex){
        return userService.getRowCount(userName,userSex);
    }

    @RequestMapping("/deleteUserById")
//    @ResponseBody
    public int deleteUserById(String userId){
        return userService.deleteUserById(userId);
    }

    @RequestMapping("/createUser")
//    @ResponseBody
    public int createUser(User user){
        String id = String.valueOf(System.currentTimeMillis());
        String num = (int)(Math.random()*9000 + 1000) + "";
        id += num;
        user.setUserId(id);
        return userService.createUser(user);
    }

    @RequestMapping("/updateUserById")
//    @ResponseBody
    public int updateUserById(User user){
        return userService.updateUserById(user);
    }

    @RequestMapping("/deleteUserByIdList")
//    @ResponseBody
    public int deleteUserByIdList(String[] userIdList){
        return userService.deleteUserByIdList(userIdList);
    }
}
