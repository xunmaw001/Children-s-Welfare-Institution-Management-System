package com.entity.model;

import com.entity.LoudongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 楼栋
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public class LoudongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 入住人数
	 */
	
	private Integer ruzhurenshu;
		
	/**
	 * 楼栋地址
	 */
	
	private String loudongdizhi;
		
	/**
	 * 楼栋简介
	 */
	
	private String loudongjianjie;
				
	
	/**
	 * 设置：入住人数
	 */
	 
	public void setRuzhurenshu(Integer ruzhurenshu) {
		this.ruzhurenshu = ruzhurenshu;
	}
	
	/**
	 * 获取：入住人数
	 */
	public Integer getRuzhurenshu() {
		return ruzhurenshu;
	}
				
	
	/**
	 * 设置：楼栋地址
	 */
	 
	public void setLoudongdizhi(String loudongdizhi) {
		this.loudongdizhi = loudongdizhi;
	}
	
	/**
	 * 获取：楼栋地址
	 */
	public String getLoudongdizhi() {
		return loudongdizhi;
	}
				
	
	/**
	 * 设置：楼栋简介
	 */
	 
	public void setLoudongjianjie(String loudongjianjie) {
		this.loudongjianjie = loudongjianjie;
	}
	
	/**
	 * 获取：楼栋简介
	 */
	public String getLoudongjianjie() {
		return loudongjianjie;
	}
			
}
