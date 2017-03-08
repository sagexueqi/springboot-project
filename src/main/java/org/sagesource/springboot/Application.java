package org.sagesource.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Spring Boot 容器入口</p>
 * <pre>
 *     author      XueQi
 *     date        2017/3/8
 *     email       qi.xue@ucarinc.com
 * </pre>
 */
@SpringBootApplication  // 使用了@EnableAutoConfiguration注解的类 Spring Boot会扫描当前包和子包的类
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
