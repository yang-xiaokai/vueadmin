package com.vueadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vueadmin.mapper")
public class VueadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueadminApplication.class, args);
	}

}
