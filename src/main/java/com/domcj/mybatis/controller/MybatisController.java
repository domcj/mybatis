package com.domcj.mybatis.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domcj.mybatis.entity.User;
import com.domcj.mybatis.mapper.UserMapper;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/02/02 12:13
 */
@RestController
public class MybatisController {

	@Resource
	private UserMapper userMapper;

	@GetMapping("/save")
	public User getUser() {
		User user = userMapper.getUserById(1L);
		return user;
	}
}
