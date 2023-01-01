package com.lemon.spring1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.lemon"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
