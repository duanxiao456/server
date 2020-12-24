package com.huateng.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TUser {
    private Long tuId;
    private Long toId;
    private String loginName;
    private String password;
    private String userName;
    private String mobile;
    private String email;
    private Date genTime;
    private Date loginTime;
    private Date lastLoginTime;
    private Long count;
}