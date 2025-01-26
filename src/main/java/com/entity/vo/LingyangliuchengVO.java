package com.entity.vo;

import com.entity.LingyangliuchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 领养流程
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public class LingyangliuchengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 审查
	 */
	
	private String shencha;
		
	/**
	 * 登记
	 */
	
	private String dengji;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：审查
	 */
	 
	public void setShencha(String shencha) {
		this.shencha = shencha;
	}
	
	/**
	 * 获取：审查
	 */
	public String getShencha() {
		return shencha;
	}
				
	
	/**
	 * 设置：登记
	 */
	 
	public void setDengji(String dengji) {
		this.dengji = dengji;
	}
	
	/**
	 * 获取：登记
	 */
	public String getDengji() {
		return dengji;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
