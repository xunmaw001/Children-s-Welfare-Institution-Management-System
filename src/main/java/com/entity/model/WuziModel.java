package com.entity.model;

import com.entity.WuziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 物资
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public class WuziModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 物资描述
	 */
	
	private String wuzimiaoshu;
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：物资描述
	 */
	 
	public void setWuzimiaoshu(String wuzimiaoshu) {
		this.wuzimiaoshu = wuzimiaoshu;
	}
	
	/**
	 * 获取：物资描述
	 */
	public String getWuzimiaoshu() {
		return wuzimiaoshu;
	}
			
}
