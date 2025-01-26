package com.entity.model;

import com.entity.ZhengcefaguiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 政策法规
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public class ZhengcefaguiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 政策图片
	 */
	
	private String zhengcetupian;
		
	/**
	 * 政策内容
	 */
	
	private String zhengceneirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：政策图片
	 */
	 
	public void setZhengcetupian(String zhengcetupian) {
		this.zhengcetupian = zhengcetupian;
	}
	
	/**
	 * 获取：政策图片
	 */
	public String getZhengcetupian() {
		return zhengcetupian;
	}
				
	
	/**
	 * 设置：政策内容
	 */
	 
	public void setZhengceneirong(String zhengceneirong) {
		this.zhengceneirong = zhengceneirong;
	}
	
	/**
	 * 获取：政策内容
	 */
	public String getZhengceneirong() {
		return zhengceneirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
