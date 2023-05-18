package com.hzc.boot.bean;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/**
 * @author hanzhichao7
 * @date 2023/3/21 19:43
 */
//@Component
//@ConditionalOnMissingBean(name = "pet")
//@ImportResource
@ConfigurationProperties(prefix = "student")
@Data
public class Student {

    private String name;

}
