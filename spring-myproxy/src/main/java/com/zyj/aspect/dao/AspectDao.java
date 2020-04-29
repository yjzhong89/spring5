package com.zyj.aspect.dao;

import org.springframework.stereotype.Component;

@Component
public class AspectDao implements Dao {
	@Override
	public void query() {
		System.out.println("dao query");
	}
}
