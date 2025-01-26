package com.entity.vo;

import com.entity.YuansuofengcaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 院所风采
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
public class YuansuofengcaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 院所图片
	 */
	
	private String yuansuotupian;
		
	/**
	 * 创办时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangbanshijian;
		
	/**
	 * 单位地址
	 */
	
	private String danweidizhi;
		
	/**
	 * 服务理念
	 */
	
	private String fuwulinian;
		
	/**
	 * 获得荣誉
	 */
	
	private String huoderongyu;
		
	/**
	 * 发展历史
	 */
	
	private String fazhanlishi;
				
	
	/**
	 * 设置：院所图片
	 */
	 
	public void setYuansuotupian(String yuansuotupian) {
		this.yuansuotupian = yuansuotupian;
	}
	
	/**
	 * 获取：院所图片
	 */
	public String getYuansuotupian() {
		return yuansuotupian;
	}
				
	
	/**
	 * 设置：创办时间
	 */
	 
	public void setChuangbanshijian(Date chuangbanshijian) {
		this.chuangbanshijian = chuangbanshijian;
	}
	
	/**
	 * 获取：创办时间
	 */
	public Date getChuangbanshijian() {
		return chuangbanshijian;
	}
				
	
	/**
	 * 设置：单位地址
	 */
	 
	public void setDanweidizhi(String danweidizhi) {
		this.danweidizhi = danweidizhi;
	}
	
	/**
	 * 获取：单位地址
	 */
	public String getDanweidizhi() {
		return danweidizhi;
	}
				
	
	/**
	 * 设置：服务理念
	 */
	 
	public void setFuwulinian(String fuwulinian) {
		this.fuwulinian = fuwulinian;
	}
	
	/**
	 * 获取：服务理念
	 */
	public String getFuwulinian() {
		return fuwulinian;
	}
				
	
	/**
	 * 设置：获得荣誉
	 */
	 
	public void setHuoderongyu(String huoderongyu) {
		this.huoderongyu = huoderongyu;
	}
	
	/**
	 * 获取：获得荣誉
	 */
	public String getHuoderongyu() {
		return huoderongyu;
	}
				
	
	/**
	 * 设置：发展历史
	 */
	 
	public void setFazhanlishi(String fazhanlishi) {
		this.fazhanlishi = fazhanlishi;
	}
	
	/**
	 * 获取：发展历史
	 */
	public String getFazhanlishi() {
		return fazhanlishi;
	}
			
}
