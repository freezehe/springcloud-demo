package com.freeze.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>Title: WebConfig</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2019年9月1日 上午11:51:29
 */
@Configuration
public class WebConfig {
	
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

}
