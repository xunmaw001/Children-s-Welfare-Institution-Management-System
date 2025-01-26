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
 * 物资采购
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
@TableName("wuzicaigou")
public class WuzicaigouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WuzicaigouEntity() {
		
	}
	
	public WuzicaigouEntity(T t) {
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
	 * 物资名称
	 */
					
	private String wuzimingcheng;
	
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
	 * 设置：物资名称
	 */
	public void setWuzimingcheng(String wuzimingcheng) {
		this.wuzimingcheng = wuzimingcheng;
	}
	/**
	 * 获取：物资名称
	 */
	public String getWuzimingcheng() {
		return wuzimingcheng;
	}
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
