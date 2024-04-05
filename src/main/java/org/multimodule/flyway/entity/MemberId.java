package org.multimodule.flyway.entity;

import lombok.*;

/**
 * packageName    : org.multimodule.flyway.entity
 * fileName       : OrderId
 * author         : AngryPig123
 * date           : 2024-04-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-06        AngryPig123       최초 생성
 */

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberId {
    private Long id;
}
