package org.multimodule.flyway.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.multimodule.flyway.entity.Order;
import org.multimodule.flyway.entity.OrderLine;
import org.multimodule.flyway.entity.id.MemberId;
import org.multimodule.flyway.entity.id.OrderId;
import org.multimodule.flyway.entity.id.OrderLineId;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.List;

/**
 * packageName    : org.multimodule.flyway.mapper
 * fileName       : OrderMapperTest
 * author         : AngryPig123
 * date           : 2024-04-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-06        AngryPig123       최초 생성
 */

@Slf4j
@MybatisTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    private Order saveOrder;

    @BeforeEach
    void beforeEach() {
        saveOrder = new Order(
                null,
                120000,
                new MemberId(1L),
                List.of(
                        new OrderLine(
                                null,
                                null,
                                "새우깡"
                        ),
                        new OrderLine(
                                null,
                                null,
                                "양파깡"
                        ),
                        new OrderLine(
                                null,
                                null,
                                "감자깡"
                        )
                )
        );
    }

    @Test
    @org.junit.jupiter.api.Order(1)
    void findOrderAll() {
        List<Order> orderAll = orderMapper.findOrderAll();
        log.info("findAll = {}", orderAll);
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    void findOrderById() {
        Order orderById = orderMapper.findOrderById(new OrderId(1L));
        log.info("findById = {}", orderById);
    }

    @Test
    @org.junit.jupiter.api.Order(3)
    void save() {
        orderMapper.saveOrder(saveOrder);
        orderMapper.saveOrderLine(saveOrder);
        orderMapper.findOrderById(saveOrder.getId());
    }

}