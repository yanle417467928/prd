package com.yanle.prd.domain;

import lombok.*;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/10 14:43
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Long id;

    private String name;

    private Integer age;
}
