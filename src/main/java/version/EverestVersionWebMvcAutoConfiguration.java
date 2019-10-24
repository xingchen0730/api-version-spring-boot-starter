/*
 * Copyright (c) 2019-2029, xingchen (cyhdreamer@163.com) All Rights Reserved.
 *
 */

package version;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @author chaiyunhao
 * @create 2019-10-15 15:40
 */
@Configuration
public class EverestVersionWebMvcAutoConfiguration extends WebMvcConfigurationSupport {

    @Override
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        return new EverestRequestMappingHandlerMapping();
    }
}
