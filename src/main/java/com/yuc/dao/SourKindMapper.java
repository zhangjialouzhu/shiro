/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yuc.dao;

import java.util.List;
import java.util.Map;

import com.yuc.model.SourKind;
import org.springframework.stereotype.Repository;


@Repository
public interface SourKindMapper {
    
    SourKind getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<SourKind> listPage(Map<String, Object> params);
    
    int insert(SourKind sourKind);
    
    int update(SourKind sourKind);
    
    int deleteById(Integer id);
}