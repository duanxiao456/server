package com.huateng.controller;

import com.huateng.entity.po.TUser;
import com.huateng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: duanxiao
 * @Date: 2020/7/21 10:31
 * @Description: TODO
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 登录
     * @return 用户信息
     */
    @ResponseBody
    @PostMapping("/login")
    public TUser login(@RequestBody TUser user) {
        return userService.login(user);
    }

    /**
     * 登录
     * @return 用户信息
     */
    @ResponseBody
    @PostMapping("/register")
    public int register(@RequestBody TUser user) {
        return userService.register(user);
    }
}
