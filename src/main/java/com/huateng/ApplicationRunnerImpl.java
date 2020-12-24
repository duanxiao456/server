package com.huateng;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: duanxiao
 * @Date: 2020/1/8 17:22
 * @Description: 项目启动完成后加载中间件
 */
@Component
public class ApplicationRunnerImpl implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("success");
    }
}