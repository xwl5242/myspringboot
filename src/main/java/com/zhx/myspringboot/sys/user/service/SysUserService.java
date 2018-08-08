package com.zhx.myspringboot.sys.user.service;

import java.util.List;

import com.zhx.myspringboot.sys.user.bean.SysUser;

public interface SysUserService {

	SysUser get(String id);

	List<SysUser> findList(SysUser user);

}
