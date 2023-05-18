package com.hzc.boot;

import com.hzc.ScannedScopeTest;
import com.hzc.boot.bean.Person;
import com.hzc.boot.bean.Student;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * SpringBoot学习
 *
 * @author hanzhichao7
 * @date 2023/3/15 11:03
 */
@RestController
@SpringBootApplication
//@Import(ScannedScopeTest.class)
public class MyApplication {

    //@RequestMapping("/hello")
    //public String hello() {
    //    return "Hello SpringBoot!";
    //}
    private int flag;

    public static void main(String[] args) {
        // 启动项目,并获取ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(MyApplication.class, args);
        // 1. 测试默认扫描包路径
        String[] beanNames = run.getBeanDefinitionNames();
        /*
        for (String beanName : beanNames) { // 默认是在com.hzc.boot路径
            System.out.println("beanNames: " + beanName);
        }

        boolean person = run.containsBean("person");
        boolean pet = run.containsBean("pet");
        boolean student = run.containsBean("student");
        System.out.println("测试@Conditional: person=" + person + ", pet=" + pet + ", student=" + student);
        Person person1 = run.getBean(Person.class);
        System.out.println(person1);
        Student student1 = run.getBean(Student.class);
        System.out.println(student1);

        System.out.println(new MyApplication().flag);
        */
    }
}
