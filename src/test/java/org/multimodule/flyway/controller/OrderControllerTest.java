package org.multimodule.flyway.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * packageName    : org.multimodule.flyway.controller
 * fileName       : OrderControllerTest
 * author         : AngryPig123
 * date           : 2024-04-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-05        AngryPig123       최초 생성
 */

@SpringBootTest
@AutoConfigureMockMvc
class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void findOrderAll() throws Exception {
        mockMvc.perform(
                        get("/orders")
                )
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    void findOrderLineAll() throws Exception {
        mockMvc.perform(
                        get("/order-line")
                )
                .andExpect(status().isOk())
                .andDo(print());
    }

}