package com.zhx.myspringboot.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.zhx.myspringboot.frame.BaseController;
import com.zhx.myspringboot.sys.user.bean.SysUser;

@Controller
public class LoginController extends BaseController {

	@PostMapping("/login")
	public String login(SysUser user){
		
		return "";
	}
}
