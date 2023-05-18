package com.hzc.boot.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author hanzhichao7
 * @date 2023/3/20 16:37
 */
@Data
@ConfigurationProperties(prefix = "person")
@Component
@EnableConfigurationProperties(Student.class)
public class Person {

    private String name;
    private String age;

    @Autowired
    private Student student;

}
