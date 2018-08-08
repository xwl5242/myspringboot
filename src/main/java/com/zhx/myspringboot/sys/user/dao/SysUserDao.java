package com.zhx.myspringboot.sys.user.dao;

import java.util.List;

import com.zhx.myspringboot.sys.user.bean.SysUser;

public interface SysUserDao {

	SysUser get(String id);

	List<SysUser> findList(SysUser user);

}
