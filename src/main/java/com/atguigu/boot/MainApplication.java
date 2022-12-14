package com.atguigu.boot;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * 阿谭
 * <p>
 * 2022-09-20 14:34
 */
/*
主程序类
@SpringBootApplication:这是一个SpringBoot应用
*/
@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class MainApplication {
    public static void main(String[] args) {
        //1,返回我们ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //2.查看容器里边的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }
        //3.从容器中获得组件
//        Pet tom01 = run.getBean("tomcat", Pet.class);
//        Pet tom02 = run.getBean("tomcat", Pet.class);
//        System.out.println("组件:"+(tom01 == tom02));
//
//        //4.com.atguigu.boot.config.MyConfig$$EnhancerBySpringCGLIB$$8ce26f5@522b2631
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//
//
//        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法.springboot总会检查这个组件是否在容器中用
//        //保持组件单实例
//        User user = bean.user01();
//        User user1 = bean.user01();
//        System.out.println(user == user1);
//
//        User user01 = run.getBean("user01", User.class);
//        Pet tomcat = run.getBean("tomcat", Pet.class);
//
//        System.out.println("用户的宠物:"+(user01.getPet() == tomcat));
//
//        //5.读取组件
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        System.out.println("========");
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }

        boolean tom = run.containsBean("tom");
        System.out.println("容器中Tom组件: "+tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中user01组件: "+user01);

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中tom22组件："+tom22);

        System.out.println("================");

        boolean haha = run.containsBean("haha");
        boolean hehe = run.containsBean("hehe");
        System.out.println("haha："+haha);//true
        System.out.println("hehe："+hehe);//true
    }
}
