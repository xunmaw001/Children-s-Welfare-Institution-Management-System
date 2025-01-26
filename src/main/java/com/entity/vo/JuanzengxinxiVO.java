package com.entity.vo;

import com.entity.JuanzengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 捐赠信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public class JuanzengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 捐赠名称
	 */
	
	private String juanzengmingcheng;
		
	/**
	 * 捐赠类型
	 */
	
	private String juanzengleixing;
		
	/**
	 * 捐赠数量
	 */
	
	private Integer juanzengshuliang;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 捐赠时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date juanzengshijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：捐赠名称
	 */
	 
	public void setJuanzengmingcheng(String juanzengmingcheng) {
		this.juanzengmingcheng = juanzengmingcheng;
	}
	
	/**
	 * 获取：捐赠名称
	 */
	public String getJuanzengmingcheng() {
		return juanzengmingcheng;
	}
				
	
	/**
	 * 设置：捐赠类型
	 */
	 
	public void setJuanzengleixing(String juanzengleixing) {
		this.juanzengleixing = juanzengleixing;
	}
	
	/**
	 * 获取：捐赠类型
	 */
	public String getJuanzengleixing() {
		return juanzengleixing;
	}
				
	
	/**
	 * 设置：捐赠数量
	 */
	 
	public void setJuanzengshuliang(Integer juanzengshuliang) {
		this.juanzengshuliang = juanzengshuliang;
	}
	
	/**
	 * 获取：捐赠数量
	 */
	public Integer getJuanzengshuliang() {
		return juanzengshuliang;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机号
	 */
	 
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
				
	
	/**
	 * 设置：捐赠时间
	 */
	 
	public void setJuanzengshijian(Date juanzengshijian) {
		this.juanzengshijian = juanzengshijian;
	}
	
	/**
	 * 获取：捐赠时间
	 */
	public Date getJuanzengshijian() {
		return juanzengshijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
