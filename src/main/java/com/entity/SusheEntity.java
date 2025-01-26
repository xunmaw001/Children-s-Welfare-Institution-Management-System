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
 * 宿舍
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
@TableName("sushe")
public class SusheEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SusheEntity() {
		
	}
	
	public SusheEntity(T t) {
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
	 * 楼栋名称
	 */
					
	private String loudongmingcheng;
	
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
	 * 设置：楼栋名称
	 */
	public void setLoudongmingcheng(String loudongmingcheng) {
		this.loudongmingcheng = loudongmingcheng;
	}
	/**
	 * 获取：楼栋名称
	 */
	public String getLoudongmingcheng() {
		return loudongmingcheng;
	}
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
