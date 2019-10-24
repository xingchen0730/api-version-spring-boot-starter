/*
 * Copyright (c) 2019-2029, xingchen (cyhdreamer@163.com) All Rights Reserved.
 *
 */

package version;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
 * @author chaiyunhao
 * @create 2019-10-15 15:31
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface ApiVersion {

    double value() default 1;
}
