package com.domcj.test.common;

import java.util.Objects;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/02/17 14:38
 */
public class ExtendClass extends AbstractClass {
	private String cd;
	@Override
	public void test1() {

	}

	AbstractClass abstractClass = new AbstractClass() {
		@Override
		public void test1() {

		}
	};

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ExtendClass that = (ExtendClass) o;
		return Objects.equals(cd, that.cd) &&
				Objects.equals(abstractClass, that.abstractClass);
	}

	@Override
	public int hashCode() {

		return Objects.hash(cd, abstractClass);
	}
}
