package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 阿谭
 * <p>
 * 2022-09-21 12:22
 */
/*
* 只有在容器中的组件,才会拥有springboot的强大功能
* */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;

    private Integer price;

}
