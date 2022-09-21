package com.atguigu.boot.bean;

import lombok.*;

/**
 * 阿谭
 * <p>
 * 2022-09-21 11:02
 */
@Data
@ToString
//@AllArgsConstructor:部分情况构造器自己定制
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    private String name;

    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private Pet pet;
}
