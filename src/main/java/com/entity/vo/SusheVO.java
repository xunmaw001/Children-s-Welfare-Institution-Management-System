package com.entity.vo;

import com.entity.SusheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 宿舍
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public class SusheVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宿舍位置
	 */
	
	private String susheweizhi;
		
	/**
	 * 宿舍名称
	 */
	
	private String sushemingcheng;
		
	/**
	 * 宿舍人数
	 */
	
	private Integer susherenshu;
		
	/**
	 * 宿舍配置
	 */
	
	private String sushepeizhi;
				
	
	/**
	 * 设置：宿舍位置
	 */
	 
	public void setSusheweizhi(String susheweizhi) {
		this.susheweizhi = susheweizhi;
	}
	
	/**
	 * 获取：宿舍位置
	 */
	public String getSusheweizhi() {
		return susheweizhi;
	}
				
	
	/**
	 * 设置：宿舍名称
	 */
	 
	public void setSushemingcheng(String sushemingcheng) {
		this.sushemingcheng = sushemingcheng;
	}
	
	/**
	 * 获取：宿舍名称
	 */
	public String getSushemingcheng() {
		return sushemingcheng;
	}
				
	
	/**
	 * 设置：宿舍人数
	 */
	 
	public void setSusherenshu(Integer susherenshu) {
		this.susherenshu = susherenshu;
	}
	
	/**
	 * 获取：宿舍人数
	 */
	public Integer getSusherenshu() {
		return susherenshu;
	}
				
	
	/**
	 * 设置：宿舍配置
	 */
	 
	public void setSushepeizhi(String sushepeizhi) {
		this.sushepeizhi = sushepeizhi;
	}
	
	/**
	 * 获取：宿舍配置
	 */
	public String getSushepeizhi() {
		return sushepeizhi;
	}
			
}
