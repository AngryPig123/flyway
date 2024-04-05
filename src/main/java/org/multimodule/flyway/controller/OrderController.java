package org.multimodule.flyway.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.multimodule.flyway.entity.Order;
import org.multimodule.flyway.entity.OrderLine;
import org.multimodule.flyway.mapper.OrderMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName    : org.multimodule.flyway.controller
 * fileName       : OrderController
 * author         : AngryPig123
 * date           : 2024-04-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-05        AngryPig123       최초 생성
 */

@Slf4j
@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderMapper orderMapper;

    @GetMapping(path = "/orders")
    public ResponseEntity<List<Order>> findOrderAll() {
        List<Order> orderList = orderMapper.findOrderAll();
        log.info("orderList = {}", orderList);
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

    @GetMapping(path = "/order-line")
    public ResponseEntity<List<OrderLine>> findOrderLineAll() {
        List<OrderLine> orderList = orderMapper.findOrderLineAll();
        log.info("orderList = {}", orderList);
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

}
