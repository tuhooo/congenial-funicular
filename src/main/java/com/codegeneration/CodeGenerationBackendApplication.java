package com.codegeneration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.codegeneration.mapper")
public class CodeGenerationBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeGenerationBackendApplication.class, args);
    }

}
