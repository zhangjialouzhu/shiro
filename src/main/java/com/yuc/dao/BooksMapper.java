/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yuc.dao;

import java.util.List;
import java.util.Map;

import com.yuc.model.Books;
import org.springframework.stereotype.Repository;


@Repository
public interface BooksMapper {
    
    Books getById(Integer id);
    
    int countBy(Map<String, Object> params);

    List<Books> listPage(Map<String, Object> params);
    
    int insert(Books books);
    
    int update(Books books);
    
    int deleteById(Integer id);
}