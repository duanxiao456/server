package com.huateng.service;

import com.huateng.entity.po.TUser;

/**
 * @Author: duanxiao
 * @Date: 2020/4/9 11:54
 * @Description: 用户业务接口
 */
public interface UserService {

    /**
     * 登录
     *
     * @param user 用户实体
     */
    TUser login(TUser user);

    /**
     * 注册
     *
     * @param user 用户实体
     */
    int register(TUser user);
}
