package com.zhx.myspringboot.frame;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class BaseController {

	@Autowired
	private HttpServletRequest request;
	
	public <T> PageInfo<T> pageList(List<T> list){
		int pageNo = Integer.valueOf(request.getParameter("pageNo"));
		int pageSize = Integer.valueOf(request.getParameter("pageSize"));
		PageHelper.startPage(pageNo, pageSize);
		return new PageInfo<T>(list);
	}
}
