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
 * 楼栋
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
@TableName("loudong")
public class LoudongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LoudongEntity() {
		
	}
	
	public LoudongEntity(T t) {
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
