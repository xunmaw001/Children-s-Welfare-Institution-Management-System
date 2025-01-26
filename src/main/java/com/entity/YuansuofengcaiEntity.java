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
 * 院所风采
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
@TableName("yuansuofengcai")
public class YuansuofengcaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuansuofengcaiEntity() {
		
	}
	
	public YuansuofengcaiEntity(T t) {
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
	 * 院所名称
	 */
					
	private String yuansuomingcheng;
	
	/**
	 * 院所图片
	 */
					
	private String yuansuotupian;
	
	/**
	 * 创办时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：院所名称
	 */
	public void setYuansuomingcheng(String yuansuomingcheng) {
		this.yuansuomingcheng = yuansuomingcheng;
	}
	/**
	 * 获取：院所名称
	 */
	public String getYuansuomingcheng() {
		return yuansuomingcheng;
	}
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
