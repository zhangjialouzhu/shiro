/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yuc.dao;

import java.util.List;
import java.util.Map;

import com.yuc.model.Vedio;
import org.springframework.stereotype.Repository;


@Repository
public interface VedioMapper {
    
    Vedio getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<Vedio> listPage(Map<String, Object> params);
    
    int insert(Vedio vedio);
    
    int update(Vedio vedio);
    
    int deleteById(Integer id);
}