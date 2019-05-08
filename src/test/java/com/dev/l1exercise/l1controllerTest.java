package com.dev.l1exercise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = L1Controller.class)
public class l1controllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getTextTest() throws  Exception{
        mvc.perform(get("/getText/{text}","This is a test Message")).andExpect(status().isOk())
                .andExpect(content().string("This is a test Message"));
    }

}