package org.test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A {
	@BeforeClass
	private static void test() {
System.out.println("gow");
	}
	@AfterClass
	private static void test1() {
System.out.println("guna");


	}
	@Test
	private void test2() {
System.out.println("dhana");
	}

}
