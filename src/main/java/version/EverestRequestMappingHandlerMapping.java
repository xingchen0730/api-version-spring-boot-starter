/*
 * Copyright (c) 2019-2029, xingchen (cyhdreamer@163.com) All Rights Reserved.
 *
 */

package version;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.Assert;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @author chaiyunhao
 * @create 2019-10-15 15:38
 */
public class EverestRequestMappingHandlerMapping extends RequestMappingHandlerMapping {

    /**
     * 不主动获取类上注解创建 condition 只有方法上注解不存在时才获取
     * @param method
     * @return
     */
    @Override
    protected RequestCondition<?> getCustomMethodCondition(Method method) {
        // 扫描方法上的 @ApiVersion
        ApiVersion apiVersion = AnnotationUtils.findAnnotation(method, ApiVersion.class);
        if(apiVersion == null){
            apiVersion = AnnotationUtils.findAnnotation(method.getDeclaringClass(), ApiVersion.class);
        }
        return createRequestCondition(apiVersion);
    }

    private RequestCondition<ApiVersionCondition> createRequestCondition(ApiVersion apiVersion) {
        if (Objects.isNull(apiVersion)) {
            return null;
        }
        final int value = (int)Math.floor(apiVersion.value());
        Assert.isTrue(value >= 1, "Api Version Must be greater than or equal to 1");
        return new ApiVersionCondition(value);
    }
}
