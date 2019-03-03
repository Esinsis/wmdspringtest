package com.wmd.springtest.jparepcustomobj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wengmd
 * @date 19-1-15 下午4:38
 */
@SpringBootApplication(scanBasePackages = "com.wmd.springtest.jparepcustomobj")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
