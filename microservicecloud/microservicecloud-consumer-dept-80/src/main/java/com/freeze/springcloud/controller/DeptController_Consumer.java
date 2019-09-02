package com.freeze.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.freeze.springcloud.entities.Dept;

/**
 * <p>Title: DeptController_80</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2019年9月1日 下午12:30:39
 */

@RestController
public class DeptController_Consumer {
	
	private static final String REST_PROVIDER_URL = "http://127.0.0.1:8081";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/consumer/dept/add")
	public boolean add(@RequestBody Dept dept){
		return restTemplate.postForObject(REST_PROVIDER_URL+"/dept/add", dept, Boolean.class);
	}
	
	@GetMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id){
		return restTemplate.getForObject(REST_PROVIDER_URL+"/dept/get/"+id, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/consumer/dept/list")
	public List<Dept> list(){
		return restTemplate.getForObject(REST_PROVIDER_URL+"dept/list", List.class);
	}

}
