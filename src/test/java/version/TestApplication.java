/*
 * Copyright (c) 2019-2029, xingchen (cyhdreamer@163.com) All Rights Reserved.
 *
 */

package version;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.StandardEnvironment;

/**
 * @author chaiyunhao
 * @create 2019-10-15 16:27
 */
@SpringBootApplication
@Import(EverestVersionWebMvcAutoConfiguration.class)
public class TestApplication {
    public static void main(String[] args){
        SpringApplicationBuilder builder = new SpringApplicationBuilder();
        builder.environment(new StandardEnvironment());
        builder.sources(TestApplication.class);
        builder.main(TestApplication.class);
        builder.run(args);
    }
}
