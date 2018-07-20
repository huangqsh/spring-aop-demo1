package org.huangqsh.aop.service;

import org.springframework.stereotype.Service;

@Service
public class AopService {
	public void addEntity() {
		System.out.println("add an entity");
	}
	
	public void exception(int i) {
		
		System.out.println(1/i);
	}
}
