package com.huateng.service;

import com.huateng.dao.mapper.TUserMapper;
import com.huateng.entity.po.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: duanxiao
 * @Date: 2020/7/23 10:38
 * @Description: 用户业务实现类
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public TUser login(TUser user) {
        return tUserMapper.findUser(user.getUserName(), user.getPassword());
    }

    @Override
    public int register(TUser user) {
        return tUserMapper.insertSelective(user);
    }
}
