package com.entity.vo;

import com.entity.SushewupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 宿舍物品
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public class SushewupinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宿舍名称
	 */
	
	private String sushemingcheng;
		
	/**
	 * 物品名称
	 */
	
	private String wupinmingcheng;
		
	/**
	 * 物品数量
	 */
	
	private Integer wupinshuliang;
		
	/**
	 * 物品简介
	 */
	
	private String wupinjianjie;
				
	
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
	 * 设置：物品名称
	 */
	 
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
				
	
	/**
	 * 设置：物品数量
	 */
	 
	public void setWupinshuliang(Integer wupinshuliang) {
		this.wupinshuliang = wupinshuliang;
	}
	
	/**
	 * 获取：物品数量
	 */
	public Integer getWupinshuliang() {
		return wupinshuliang;
	}
				
	
	/**
	 * 设置：物品简介
	 */
	 
	public void setWupinjianjie(String wupinjianjie) {
		this.wupinjianjie = wupinjianjie;
	}
	
	/**
	 * 获取：物品简介
	 */
	public String getWupinjianjie() {
		return wupinjianjie;
	}
			
}
