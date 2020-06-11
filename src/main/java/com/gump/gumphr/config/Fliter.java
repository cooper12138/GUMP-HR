package com.gump.gumphr.config;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import java.util.Collection;

/** 根据用户传的请求地址 判断请求需要的角色
 * @author gump(zzc)
 * @version 1.0
 * @date 2020/6/11 23:11
 */
public class Fliter implements FilterInvocationSecurityMetadataSource {


    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
