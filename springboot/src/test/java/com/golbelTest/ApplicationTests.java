package com.golbelTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.main.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class ApplicationTests {
	
	@Autowired
	private BlogProperties blogProperties;
	
	@Test
	public void test1(){
		Assert.assertEquals(blogProperties.getName(), "lly7762");
		Assert.assertEquals(blogProperties.getTitle(), "test");
		System.out.println(blogProperties.getRandomLong());
	}

}
