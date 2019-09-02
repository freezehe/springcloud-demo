package com.freeze.springcloud.service;

import java.util.List;

import com.freeze.springcloud.entities.Dept;

/**
 * <p>
 * Title: IDeptService
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author he_jiebing@jiuyv.com
 * @date 2019年9月1日 上午9:33:48
 */

public interface IDeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();

}
