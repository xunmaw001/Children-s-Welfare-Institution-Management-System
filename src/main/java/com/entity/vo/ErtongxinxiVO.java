package com.entity.vo;

import com.entity.ErtongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 儿童信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
public class ErtongxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 儿童照片
	 */
	
	private String ertongzhaopian;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 爱好
	 */
	
	private String aihao;
		
	/**
	 * 儿童资料
	 */
	
	private String ertongziliao;
				
	
	/**
	 * 设置：儿童照片
	 */
	 
	public void setErtongzhaopian(String ertongzhaopian) {
		this.ertongzhaopian = ertongzhaopian;
	}
	
	/**
	 * 获取：儿童照片
	 */
	public String getErtongzhaopian() {
		return ertongzhaopian;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：爱好
	 */
	 
	public void setAihao(String aihao) {
		this.aihao = aihao;
	}
	
	/**
	 * 获取：爱好
	 */
	public String getAihao() {
		return aihao;
	}
				
	
	/**
	 * 设置：儿童资料
	 */
	 
	public void setErtongziliao(String ertongziliao) {
		this.ertongziliao = ertongziliao;
	}
	
	/**
	 * 获取：儿童资料
	 */
	public String getErtongziliao() {
		return ertongziliao;
	}
			
}
