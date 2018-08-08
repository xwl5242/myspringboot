package com.zhx.myspringboot.sys.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.zhx.myspringboot.sys.user.bean.SysUser;
import com.zhx.myspringboot.sys.user.dao.SysUserDao;
import com.zhx.myspringboot.sys.user.service.SysUserService;

@Service
@EnableTransactionManagement
public class SysUserServiceImpl implements SysUserService {
	
	@Autowired
	private SysUserDao sysUserDao;

	@Transactional(readOnly=true)
	@Override
	public SysUser get(String id) {
		return sysUserDao.get(id);
	}

	@Transactional(readOnly=true)
	@Override
	public List<SysUser> findList(SysUser user) {
		return sysUserDao.findList(user);
	}
	
}
