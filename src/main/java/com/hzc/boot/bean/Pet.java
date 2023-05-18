package com.hzc.boot.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author hanzhichao7
 * @date 2023/3/21 19:43
 */
@Configuration
@ConditionalOnBean(name = "person")
public class Pet {

    private String name;
}
