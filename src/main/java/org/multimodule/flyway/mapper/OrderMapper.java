package org.multimodule.flyway.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.multimodule.flyway.entity.Order;
import org.multimodule.flyway.entity.id.OrderId;
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

    Order findOrderById(@Param("orderId") OrderId orderId);

    List<OrderLine> findOrderLineAll();

    void saveOrder(@Param("order") Order saveOrder);

    void saveOrderLine(@Param("order") Order saveOrder);

}
