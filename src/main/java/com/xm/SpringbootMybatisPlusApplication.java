package com.xm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//开启mapper包扫描
@MapperScan("com.xm.mapper")
public class SpringbootMybatisPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisPlusApplication.class, args);
	}
}
