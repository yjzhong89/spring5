package com.zyj.spring.autowireTest;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class AutowireRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		GenericBeanDefinition doctorImpl = (GenericBeanDefinition) registry.getBeanDefinition("doctorImpl");
		doctorImpl.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_NAME);
		registry.registerBeanDefinition("doctorImpl", doctorImpl);

		GenericBeanDefinition student = (GenericBeanDefinition) registry.getBeanDefinition("student");
		student.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
		registry.registerBeanDefinition("student", student);
	}
}
