package com.freeze.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>Title: EurekaServer7001_App</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2019年9月1日 下午2:04:24
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003_App {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7003_App.class, args);
	}

}
