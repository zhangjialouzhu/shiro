package com.yuc.service;

import com.yuc.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhangbin on 2017/2/21.
 */
@Component
public class SysUserService  {

    @Autowired
    private UserMapper sysUserMapper;


}
