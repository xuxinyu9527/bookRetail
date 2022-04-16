package com.xuxinyu.bookRetail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xuxinyu.*.dao")
public class BookRetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookRetailApplication.class, args);
	}

}
