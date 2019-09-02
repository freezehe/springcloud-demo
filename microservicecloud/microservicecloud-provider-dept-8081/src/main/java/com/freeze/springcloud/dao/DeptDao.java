package com.freeze.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.freeze.springcloud.entities.Dept;

/**
 * <p>Title: DeptDao</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2019年9月1日 上午9:24:30
 */
@Mapper
public interface DeptDao {
	
	/**
	 * 添加部门
	 * @param dept
	 * @return
	 */
	public boolean addDept(Dept dept);

	/**
	 * 根据ID查询部门
	 * @param id
	 * @return
	 */
	public Dept findById(Long id);

	/**
	 * 查询所有部门
	 * @return
	 */
	public List<Dept> findAll();

}
