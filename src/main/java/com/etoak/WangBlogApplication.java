package com.etoak;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


/**启动类
 * @author wang
 */
@SpringBootApplication
@MapperScan("com.etoak.web.dao")
public class WangBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(WangBlogApplication.class, args);
	}

}
