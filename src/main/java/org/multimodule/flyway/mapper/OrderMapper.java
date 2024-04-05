package org.multimodule.flyway.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.multimodule.flyway.entity.Order;
import org.multimodule.flyway.entity.OrderLine;

import java.util.List;

/**
 * packageName    : org.multimodule.flyway.mapper
 * fileName       : OrderMapper
 * author         : AngryPig123
 * date           : 2024-04-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-05        AngryPig123       최초 생성
 */

@Mapper
public interface OrderMapper {
    List<Order> findOrderAll();

    List<OrderLine> findOrderLineAll();
}
