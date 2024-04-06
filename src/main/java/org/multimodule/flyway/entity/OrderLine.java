package org.multimodule.flyway.entity;

import lombok.*;
import org.multimodule.flyway.entity.id.OrderId;
import org.multimodule.flyway.entity.id.OrderLineId;

import java.io.Serializable;

/**
 * packageName    : org.multimodule.flyway.entity
 * fileName       : OrderLine
 * author         : AngryPig123
 * date           : 2024-04-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-04        AngryPig123       최초 생성
 */

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderLine {
    private OrderLineId orderLineId;
    private OrderId orderId;
    private String productName;
}
