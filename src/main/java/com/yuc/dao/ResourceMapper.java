/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yuc.dao;

import java.util.List;
import java.util.Map;

import com.yuc.model.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ResourceMapper {

    Resource getById(String rid);

    List<Resource> getResource(@Param(value = "cname") String cname);

    List<Resource> listPage(Map<String, Object> params);

    int insert(Resource resource);

    int update(Resource resource);

    int deleteById(Integer id);

    Resource sqlTest(@Param("rid") String rid);
}