package com.yuc.service.impl;

import com.yuc.dao.MajorMapper;
import com.yuc.dao.ResourceMapper;
import com.yuc.model.Major;
import com.yuc.model.Resource;
import com.yuc.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements IResourceService{
    @Autowired
    private MajorMapper majorMapper;
    @Autowired
    private ResourceMapper resourceMapper;
    public List<Major> getResource() {
        return majorMapper.getResource();
    }

    public List<Resource> getResList(String cname) {
        return resourceMapper.getResource(cname);
    }

    public Resource sqlTest(String rid) {
        return resourceMapper.sqlTest(rid);
    }

    public Resource getById(String rid) {
        return resourceMapper.getById(rid);
    }

    public int insert(Resource resource) {
        return resourceMapper.insert(resource);
    }
}
