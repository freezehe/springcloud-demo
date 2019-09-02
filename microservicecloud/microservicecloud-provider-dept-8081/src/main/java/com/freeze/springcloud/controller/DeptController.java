package com.freeze.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freeze.springcloud.entities.Dept;
import com.freeze.springcloud.service.IDeptService;

/**
 * <p>Title: DeptController</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2019年9月1日 上午9:39:18
 */
@RestController
public class DeptController {
	
	@Autowired
	private IDeptService deptService;
	
	@PostMapping("/dept/add")
	public boolean addDept(@RequestBody Dept dept){
		return deptService.add(dept);
	}
	
	@GetMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id){
		return deptService.get(id);
	}
	
	@GetMapping("/dept/list")
	public List<Dept> listDept(){
		return deptService.list();
	}

}
