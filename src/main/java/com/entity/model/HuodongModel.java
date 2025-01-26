package com.entity.model;

import com.entity.HuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 活动
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
public class HuodongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 活动图片
	 */
	
	private String huodongtupian;
		
	/**
	 * 活动内容
	 */
	
	private String huodongneirong;
		
	/**
	 * 举办时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jubanshijian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：活动图片
	 */
	 
	public void setHuodongtupian(String huodongtupian) {
		this.huodongtupian = huodongtupian;
	}
	
	/**
	 * 获取：活动图片
	 */
	public String getHuodongtupian() {
		return huodongtupian;
	}
				
	
	/**
	 * 设置：活动内容
	 */
	 
	public void setHuodongneirong(String huodongneirong) {
		this.huodongneirong = huodongneirong;
	}
	
	/**
	 * 获取：活动内容
	 */
	public String getHuodongneirong() {
		return huodongneirong;
	}
				
	
	/**
	 * 设置：举办时间
	 */
	 
	public void setJubanshijian(Date jubanshijian) {
		this.jubanshijian = jubanshijian;
	}
	
	/**
	 * 获取：举办时间
	 */
	public Date getJubanshijian() {
		return jubanshijian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
