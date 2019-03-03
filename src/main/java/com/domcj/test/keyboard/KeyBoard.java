package com.domcj.test.keyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import sun.audio.AudioData;
import sun.audio.AudioDataStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/02/17 14:53
 */
public class KeyBoard {

	@Test
	public void test1() {
		List<Teacher> lists = new ArrayList<>();
		lists.add(new Teacher(10));
		lists.add(new Teacher(11));
		Collections.sort(lists, new Comparator<Teacher>() {
			@Override
			public int compare(Teacher o1, Teacher o2) {
				return o1.getAge()-o2.getAge();
			}
		});
	}

	public class Teacher {
		private int age;

		public Teacher(int age) {
			this.age = age;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}

	public static void main(String[] args) {
		InputStream resourceAsStream = KeyBoard.class.getResourceAsStream("/7499.wav");
		AudioStream audioStream = null;
		try {
			audioStream = new AudioStream(resourceAsStream);
			AudioData data = audioStream.getData();
		} catch (IOException e) {
			e.printStackTrace();
		}
		AudioPlayer.player.start(audioStream);
	}

}
