package com.atguigu.boot.config;

import com.atguigu.boot.bean.Car;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 阿谭
 * <p>
 * 2022-09-21 11:13
 */

/*
* 1.配置类里面使用@bean标注在方法上给容器注册组件,默认也是单实例的
* 2.配置类本身也是组件
* 3.proxyBeanMethods:代理bean的方法
*   Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
*   Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
*   组件依赖必须使用Full模式默认。其他默认是否Lite模式
*
* */
//@ConditionalOnBean(name = "tom")
@ConditionalOnMissingBean(name = "tom")
@Import({User.class})
@Configuration(proxyBeanMethods = true)//告诉springboot这是一个配置类 == 配置文件
@EnableConfigurationProperties(Car.class)
//1.开启Car配置绑定功能
//2.把这个car这个组件自动注入到容器中
public class MyConfig {

    //外部无论对配置类中的各个组件注册方法嗲用多少次获取的都是之前注册容器中的单实例对象

    @Bean//给容器添加组件.以方法名为组件的id.返回类型就是组件类型.返回的值,就是组件在容器中的实例
    public User user01(){
        User user = new User("张三", 21);
        //user组件依赖了pet组件
        user.setPet(tomcat());
        return user;
    }

    @Bean("tom22")
    public Pet tomcat(){
        return new Pet("cat01");
    }
}
