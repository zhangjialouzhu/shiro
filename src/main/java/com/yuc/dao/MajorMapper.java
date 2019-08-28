package com.yuc.dao;

import com.yuc.model.Major;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MajorMapper {
    List<Major> getResource();
}
