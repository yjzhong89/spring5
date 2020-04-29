package com.zyj.spring.mybatis.imports;

import com.zyj.spring.mybatis.service.UserService;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{UserService.class.getName()};
	}
}
