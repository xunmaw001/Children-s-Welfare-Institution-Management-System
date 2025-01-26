package com.entity.vo;

import com.entity.WuzicaigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 物资采购
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public class WuzicaigouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 采购数量
	 */
	
	private String caigoushuliang;
		
	/**
	 * 后勤工号
	 */
	
	private String houqingonghao;
		
	/**
	 * 后勤姓名
	 */
	
	private String houqinxingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
				
	
	/**
	 * 设置：采购数量
	 */
	 
	public void setCaigoushuliang(String caigoushuliang) {
		this.caigoushuliang = caigoushuliang;
	}
	
	/**
	 * 获取：采购数量
	 */
	public String getCaigoushuliang() {
		return caigoushuliang;
	}
				
	
	/**
	 * 设置：后勤工号
	 */
	 
	public void setHouqingonghao(String houqingonghao) {
		this.houqingonghao = houqingonghao;
	}
	
	/**
	 * 获取：后勤工号
	 */
	public String getHouqingonghao() {
		return houqingonghao;
	}
				
	
	/**
	 * 设置：后勤姓名
	 */
	 
	public void setHouqinxingming(String houqinxingming) {
		this.houqinxingming = houqinxingming;
	}
	
	/**
	 * 获取：后勤姓名
	 */
	public String getHouqinxingming() {
		return houqinxingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
			
}
