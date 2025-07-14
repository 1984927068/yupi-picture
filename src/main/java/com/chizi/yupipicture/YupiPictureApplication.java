package com.chizi.yupipicture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.chizi.yupipicture.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class YupiPictureApplication {

    public static void main(String[] args) {
        SpringApplication.run(YupiPictureApplication.class, args);
    }

}
