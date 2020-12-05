package com.jutixueyuan.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//此注解只能贴在方法上面
@Retention(RetentionPolicy.RUNTIME)//注解保留运行时
public @interface SwaggerUIAnncation {

}
