package com.freeze.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>Title: DeptProvider8001_App</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2019年9月1日 上午9:44:56
 */

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8081_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8081_App.class, args);
	}

}
