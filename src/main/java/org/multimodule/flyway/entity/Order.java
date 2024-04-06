package org.multimodule.flyway.entity;

import lombok.*;
import org.multimodule.flyway.entity.id.MemberId;
import org.multimodule.flyway.entity.id.OrderId;

import java.io.Serializable;
import java.util.List;

/**
 * packageName    : org.multimodule.flyway.entity
 * fileName       : Order
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
public class Order {
    private OrderId id;
    private Integer price;
    private MemberId memberId;
    private List<OrderLine> orderLines;
}