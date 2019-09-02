package com.freeze.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freeze.springcloud.dao.DeptDao;
import com.freeze.springcloud.entities.Dept;
import com.freeze.springcloud.service.IDeptService;

/**
 * <p>Title: DeptServiceImpl</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2019年9月1日 上午9:34:17
 */
@Service("deptService")
public class DeptServiceImpl implements IDeptService{
	
	@Autowired
	private DeptDao deptDao;

	@Override
	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return deptDao.findAll();
	}

}
