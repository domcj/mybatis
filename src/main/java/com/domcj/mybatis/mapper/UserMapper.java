package com.domcj.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.domcj.mybatis.entity.User;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/01/26 12:46
 */
@Mapper
public interface UserMapper {
	User getUserById(Long id);
}
