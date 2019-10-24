/*
 * Copyright (c) 2019-2029, xingchen (cyhdreamer@163.com) All Rights Reserved.
 *
 */

package version.mock;

import io.xingchen.everest.version.ApiVersion;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chaiyunhao
 * @create 2019-10-15 15:51
 */
@ApiVersion(4)
public interface ITestControllerV2 {



    @GetMapping("/{version}/user")
    String getUser2();
}
