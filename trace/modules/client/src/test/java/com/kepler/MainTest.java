package com.kepler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(value = "classpath:kepler-runtime.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MainTest {

	@Autowired
	private Printer printer;

	@Test
	public void test() throws Exception {
		for (int i = 0; i < 10000; i++) {
			System.out.println(this.printer.print("kepler", Printer.WOOD_PRINTER));
			Thread.sleep(1000 * 1);
		}
	}
}
