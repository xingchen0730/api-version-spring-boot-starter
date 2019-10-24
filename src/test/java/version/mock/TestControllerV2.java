/*
 * Copyright (c) 2019-2029, xingchen (cyhdreamer@163.com) All Rights Reserved.
 *
 */

package version.mock;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author chaiyunhao
 * @create 2019-10-15 15:51
 */
@RestController
public class TestControllerV2 implements ITestControllerV2{


    public String getUser2() {
        return "4";
    }
}
