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
 * 食谱
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
@TableName("shipu")
public class ShipuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShipuEntity() {
		
	}
	
	public ShipuEntity(T t) {
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
	 * 食谱名称
	 */
					
	private String shipumingcheng;
	
	/**
	 * 食谱封面
	 */
					
	private String shipufengmian;
	
	/**
	 * 食谱介绍
	 */
					
	private String shipujieshao;
	
	
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
	 * 设置：食谱名称
	 */
	public void setShipumingcheng(String shipumingcheng) {
		this.shipumingcheng = shipumingcheng;
	}
	/**
	 * 获取：食谱名称
	 */
	public String getShipumingcheng() {
		return shipumingcheng;
	}
	/**
	 * 设置：食谱封面
	 */
	public void setShipufengmian(String shipufengmian) {
		this.shipufengmian = shipufengmian;
	}
	/**
	 * 获取：食谱封面
	 */
	public String getShipufengmian() {
		return shipufengmian;
	}
	/**
	 * 设置：食谱介绍
	 */
	public void setShipujieshao(String shipujieshao) {
		this.shipujieshao = shipujieshao;
	}
	/**
	 * 获取：食谱介绍
	 */
	public String getShipujieshao() {
		return shipujieshao;
	}

}
