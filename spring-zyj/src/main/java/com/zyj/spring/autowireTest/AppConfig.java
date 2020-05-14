package com.zyj.spring.autowireTest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan("com.zyj.spring.autowireTest")
@Import(AutowireRegistrar.class)
public class AppConfig {
}
