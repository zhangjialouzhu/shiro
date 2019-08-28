package com.yuc.service.impl; 

import com.yuc.model.SysUser;
import com.yuc.service.SysUserService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* UserServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>05/04/2018</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/conf/spring.xml","classpath*:/conf/spring-mvc.xml","classpath*:/conf/spring-mybatis.xml"})
public class UserServiceImplTest {

@Before
public void before() throws Exception {

} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: insert(User user) 
* 
*/ 
@Test
public void testInsert() throws Exception {
    SysUser user = new SysUser();
}


} 
