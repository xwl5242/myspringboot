package com.zhx.myspringboot.sys.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhx.myspringboot.frame.BaseController;
import com.zhx.myspringboot.sys.user.bean.SysUser;
import com.zhx.myspringboot.sys.user.service.SysUserService;

@RestController
@RequestMapping("/sys/user")
public class SysUserController extends BaseController {

	@Autowired
	private SysUserService sysUserService;
	
	@GetMapping("/{id}")
	public SysUser getUser(@PathVariable("id") String id){
		return sysUserService.get(id);
	}
	
	@GetMapping("/findList")
	public Object findList(SysUser user){
		List<SysUser> userList = sysUserService.findList(user);
		return pageList(userList);
	}
}
