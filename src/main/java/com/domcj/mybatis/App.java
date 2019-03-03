package com.domcj.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.annotation.Resource;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.domcj.mybatis.entity.User;
import com.domcj.mybatis.mapper.UserMapper;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/01/26 12:30
 */
@SpringBootApplication
public class App {

	@Resource
	private UserMapper userMapper;

	@Test
	public void test1() {
		User user = userMapper.getUserById(1L);
		System.out.println(user);
	}

	public static void main(String[] args) throws Exception{
//		SpringApplication.run(App.class, args);
		InputStream inputStream = getInputStream("mybatis.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		SqlSession sqlSession = sqlSessionFactory.openSession();
		SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH);
		sqlSession.commit();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User user = mapper.getUserById(1l);
//		User user = sqlSession.selectOne("com.domcj.mybatis.mapper.UserMapper.getUserById",1L);
		System.out.println(user);
	}
	public static InputStream getInputStream(String filepath) throws IOException {
		ClassLoader classloader = ClassLoader.getSystemClassLoader();
		URL resource = classloader.getResource(filepath);
		if (resource!=null) {
			return resource.openStream();
		}
		return null;
	}
}
