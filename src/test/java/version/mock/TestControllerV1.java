/*
 * Copyright (c) 2019-2029, xingchen (cyhdreamer@163.com) All Rights Reserved.
 *
 */

package version.mock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import version.ApiVersion;

/**
 * @author chaiyunhao
 * @create 2019-10-15 15:51
 */
@RestController
@ApiVersion
public class TestControllerV1 {

    @GetMapping("/{version}/user")
    @ApiVersion(2.1)
    public String getUser() {
        return "2.1";
    }

    @GetMapping("/user")
    public String getUser2() {
        return "0";
    }


    @GetMapping("/{version}/user")
    public String getUser00() {
        return "1";
    }

}
