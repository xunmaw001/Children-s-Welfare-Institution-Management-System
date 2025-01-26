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
 * 后勤人员
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
@TableName("houqinrenyuan")
public class HouqinrenyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HouqinrenyuanEntity() {
		
	}
	
	public HouqinrenyuanEntity(T t) {
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
	 * 后勤工号
	 */
					
	private String houqingonghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 后勤姓名
	 */
					
	private String houqinxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
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
