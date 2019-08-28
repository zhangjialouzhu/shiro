package com.yuc.shiro;

import com.yuc.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;


import org.apache.log4j.Logger;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;


    public class Realm extends AuthorizingRealm {
        private Logger logger = Logger.getLogger(getClass());
        @Autowired
        private SysUserService sysUserService;
       // @Autowired
       // private SysRoleService sysRoleService;
       // @Autowired
       // private SysResourceService sysResourceService;

        @Override
        protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
           /* String username = (String) super.getAvailablePrincipal(principalCollection);
            if (StringUtil.isNotEmpty(username)) {
                //从数据库中获取当前登录用户的详细信息
                SysUser sysUser = sysUserService.getByUsername(username).getDataInfo();
                if (sysUser == null) {
                    throw new AuthorizationException();
                }
                //为当前用户设置角色和权限
                SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
                List<String> roleList = new ArrayList<String>();
                SysRoleParam sysRoleParam = new SysRoleParam();
                sysRoleParam.setUserId(sysUser.getId());
                sysRoleParam.setOrgId(sysUser.getOrgId());
                List<SysRole> sysRoles = sysRoleService.roleListByUser(sysRoleParam);
                for (SysRole sysRole : sysRoles) {
                    roleList.add(sysRole.getId());
                }
                List<String> permissionList = new ArrayList<String>();
                SysResourceParam param = new SysResourceParam();
                param.setRoleList(roleList);
                List<SysResource> sysResourceList = sysResourceService.resourceListByRole(param);
                for (SysResource sysResource : sysResourceList) {
                    permissionList.add(sysResource.getId());
                }
                simpleAuthorInfo.addRoles(roleList);
                simpleAuthorInfo.addStringPermissions(permissionList);
                return simpleAuthorInfo;
            } else {
                return null;
            }*/
           return null;
        }


        @Override
        protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

            return null;
            //没有返回登录用户名对应的SimpleAuthenticationInfo对象时,就会在LoginController中抛出UnknownAccountException异常
        }

        /**
         * 将一些数据放到ShiroSession中,以便于其它地方使用
         * 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
         */
        private void setSession(String key, Object value) {
            Subject currentUser = SecurityUtils.getSubject();
            if (null != currentUser) {
                Session session = currentUser.getSession();
                if (null != session) {
                    session.setAttribute(key, value);
                }
            }
        }
    }
