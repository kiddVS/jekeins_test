package com.kidd.jekeinstest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JekeinstestApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("jekeins test!!!!");
	}
	@Test
	public void test1() {
		System.out.println("test1 start !!!!");
		Integer a = 0;
		Integer b = 1/a;
	}

	@Test
	public Boolean test2() {
		System.out.println("test2 start!!!!");
		return true;
	}
}
