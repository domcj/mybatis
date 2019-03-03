package com.domcj.mybatis.enums;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/02/05 12:41
 */
public enum MyEnum {
	RED("red"), WHITE("white"), BLACK("black");

	private String color;

	private MyEnum(String color) {

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public MyEnum getEnumByKey(String key) {
		for (MyEnum myEnum : MyEnum.values()) {
			if (key.equals(myEnum.getColor())) {
				return myEnum;
			}
		}
		return null;
	}
}
