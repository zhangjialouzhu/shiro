package com.yuc.dao;

import com.yuc.model.SysUser;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository


public interface UserMapper {

    int insert(SysUser user);
}
