package com.lagou.edu.mvcframework.annotations;

import java.lang.annotation.*;

/**
 * @author ze666
 * @description 安全路径
 * @date 2021/1/13 14:49
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Security {
    String[] value() default {};
}
