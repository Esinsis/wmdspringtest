package com.wmd.springtest.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wengmd
 * @date 19-1-15 下午4:38
 */
@SpringBootApplication(scanBasePackages = "com.wmd.springtest.validation")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
