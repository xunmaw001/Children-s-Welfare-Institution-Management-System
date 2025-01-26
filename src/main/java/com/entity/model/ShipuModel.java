package com.entity.model;

import com.entity.ShipuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 食谱
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
public class ShipuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 食谱封面
	 */
	
	private String shipufengmian;
		
	/**
	 * 食谱介绍
	 */
	
	private String shipujieshao;
				
	
	/**
	 * 设置：食谱封面
	 */
	 
	public void setShipufengmian(String shipufengmian) {
		this.shipufengmian = shipufengmian;
	}
	
	/**
	 * 获取：食谱封面
	 */
	public String getShipufengmian() {
		return shipufengmian;
	}
				
	
	/**
	 * 设置：食谱介绍
	 */
	 
	public void setShipujieshao(String shipujieshao) {
		this.shipujieshao = shipujieshao;
	}
	
	/**
	 * 获取：食谱介绍
	 */
	public String getShipujieshao() {
		return shipujieshao;
	}
			
}
