package org.multimodule.flyway.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * packageName    : org.multimodule.flyway.entity
 * fileName       : Member
 * author         : AngryPig123
 * date           : 2024-04-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-04        AngryPig123       최초 생성
 */

@Getter
@Setter
@AllArgsConstructor
public class Member {
    private Long id;
    private String name;
}
