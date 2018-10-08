package com.qxglsys.formal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan("com.qxglsys.formal.filter")
@SpringBootApplication
public class FormalApplication {

    public static void main(String[] args) {
        SpringApplication.run(FormalApplication.class, args);
    }
}
