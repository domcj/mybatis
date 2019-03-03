package com.domcj.mybatis.entity;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/01/26 12:57
 */
public class User {
	private Long id;
	private String name;

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
