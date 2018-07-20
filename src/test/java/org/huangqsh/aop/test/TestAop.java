package org.huangqsh.aop.test;

import javax.annotation.Resource;

import org.huangqsh.aop.service.AopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config/spring-*.xml"})
public class TestAop {
	@Resource
	private AopService aopService;

	@Test
	public  void test() {
		aopService.exception(0);
	}
}
