package com.yuc.controller;

import com.yuc.model.Major;
import com.yuc.model.MyBean;
import com.yuc.model.Resource;
import com.yuc.service.IResourceService;
import com.yuc.utils.JSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Controller
@RequestMapping(value = "/resource")
public class ResourceController {
    private Logger logger = LoggerFactory.getLogger(ResourceController.class);
    @Autowired
    IResourceService resourceService;
    @RequestMapping(value = "/index")
    public ModelAndView index(){
        //获取左侧列表
        List<Major> majors = resourceService.getResource();
        return new ModelAndView("resource/index").addObject("majors",majors);
    }

    @RequestMapping(value = "/getResource")
    @ResponseBody
    public List<Resource> getResource(String cname){
        JSONResult jsonResult = new JSONResult();
        List<Resource> resourceList = new ArrayList<Resource>();
        try{
            resourceList = resourceService.getResList(cname);
            jsonResult.setData(resourceList);
        }catch (Exception e){
            logger.error("{getResource}",e);
            jsonResult.setErrorInfo("获取数据出错！");
        }
        return resourceList;
    }
    @RequestMapping(value = "/beanTest")
    @ResponseBody
    public JSONResult BeanTest(@RequestBody MyBean  bean){
        JSONResult jsonResult = new JSONResult();
        try{
            jsonResult.setData("获取数据粗错");
        }catch (Exception e){
            logger.error("{getResource}",e);
            jsonResult.setErrorInfo("获取数据粗错！");
        }
        return jsonResult;
    }
    @RequestMapping(value = "/sqlTest")
    @ResponseBody
    public JSONResult SqlTest(String cid){
        JSONResult jsonResult = new JSONResult();
        try{
            Resource resource = resourceService.sqlTest(cid);
            jsonResult.setData(resource);
        }catch (Exception e){
            logger.error("{getResource}",e);
            jsonResult.setErrorInfo("获取数据粗错！");
        }
        return jsonResult;
    }
    @RequestMapping(value = "/idTest")
    @ResponseBody
    public JSONResult SqlTest1(){
        JSONResult jsonResult = new JSONResult();
        try{
            Resource resource = resourceService.getById("10");
            resourceService.insert(resource);
            System.out.println(resource.getRid());
            jsonResult.setData(resource);
        }catch (Exception e){
            logger.error("{getResource}",e);
            jsonResult.setErrorInfo("获取数据粗错！");
        }
        return jsonResult;
    }



}
