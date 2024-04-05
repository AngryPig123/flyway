package org.multimodule.flyway.entity;

import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

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
@ToString
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Order implements Serializable {
    private OrderId id;
    private Integer price;
    private MemberId memberId;
    private List<OrderLine> orderLines;
}