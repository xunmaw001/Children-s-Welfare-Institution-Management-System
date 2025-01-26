package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 领养流程
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
@TableName("lingyangliucheng")
public class LingyangliuchengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LingyangliuchengEntity() {
		
	}
	
	public LingyangliuchengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 申请
	 */
					
	private String shenqing;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：申请
	 */
	public void setShenqing(String shenqing) {
		this.shenqing = shenqing;
	}
	/**
	 * 获取：申请
	 */
	public String getShenqing() {
		return shenqing;
	}
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
