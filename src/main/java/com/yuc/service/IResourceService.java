package com.yuc.service;

import com.yuc.model.Major;
import com.yuc.model.Resource;

import java.util.List;

public interface IResourceService {
    List<Major> getResource();
    List<Resource> getResList(String cname);
    Resource sqlTest(String rid);
    Resource getById(String rid);
    int insert(Resource resource);
}
