/*
 * Copyright (c) 2019-2029, xingchen (cyhdreamer@163.com) All Rights Reserved.
 *
 */

package version;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment =SpringBootTest.WebEnvironment.MOCK,classes = TestApplication.class)
public class TestControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testV2() throws Exception {

        String result = this.mockMvc.perform(MockMvcRequestBuilders.get("/v2/user"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn().getResponse().getContentAsString();
        Assert.assertEquals(result,"2.1");

    }

    @Test
    public void testV3() throws Exception {

        String result = this.mockMvc.perform(MockMvcRequestBuilders.get("/v1/user"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn().getResponse().getContentAsString();
        Assert.assertEquals(result,"1");

    }

    @Test
    public void testV4() throws Exception {

        String result = this.mockMvc.perform(MockMvcRequestBuilders.get("/v4/user"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn().getResponse().getContentAsString();
        Assert.assertEquals(result,"4");

    }


    @Test
    public void test() throws Exception {

        String result = this.mockMvc.perform(MockMvcRequestBuilders.get("/user"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn().getResponse().getContentAsString();
        Assert.assertEquals(result,"0");

    }

}