package com.lbrce.finamodule;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserVerifficationTest {
	UserVeriffication uv=new UserVeriffication();
	@Test
	public void testcase1()
	{
		Assert.assertEquals(true,uv.check("usha","usha@2020"));
	}
	@Test
	public void testcase2()
	{
		Assert.assertEquals(true,uv.check("usha","usha@2020"));
	}
	@Test
	public void testcase3()
	{
		Assert.assertEquals(false,uv.check("usha","usha@2020"));
	}
	@Test
	public void testcase4()
	{
		Assert.assertEquals(false,uv.check("usha","usha@2020"));
	}

}
