package com.domcj.mybatis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.domcj.mybatis.entity.User;
import com.domcj.mybatis.mapper.UserMapper;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/02/02 08:54
 */
public class MybatisTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void test1() {
		User user = userMapper.getUserById(1L);
		System.out.println(user);
	}
}
