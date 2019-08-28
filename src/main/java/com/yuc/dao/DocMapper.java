/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yuc.dao;

import java.util.List;
import java.util.Map;

import com.yuc.model.Doc;
import org.springframework.stereotype.Repository;


@Repository
public interface DocMapper {
    
    Doc getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<Doc> listPage(Map<String, Object> params);
    
    int insert(Doc doc);
    
    int update(Doc doc);
    
    int deleteById(Integer id);
}