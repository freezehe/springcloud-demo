package com.freeze.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>Title: Dept</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2019年9月1日 上午7:51:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
public class Dept implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4456057818752690869L;

	/**
	 * 主键
	 */
	private Long deptno;
	
	/**
	 * 部门名称
	 */
	private String dname;
	
	/**
	 * 数据来源
	 */
	private String db_source;

}
