package com.entity.model;

import com.entity.BaoxiuzhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 报修状态
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public class BaoxiuzhuangtaiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宿舍名称
	 */
	
	private String sushemingcheng;
		
	/**
	 * 物品名称
	 */
	
	private String wupinmingcheng;
		
	/**
	 * 维修进程
	 */
	
	private String weixiujincheng;
				
	
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
	 * 设置：物品名称
	 */
	 
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
				
	
	/**
	 * 设置：维修进程
	 */
	 
	public void setWeixiujincheng(String weixiujincheng) {
		this.weixiujincheng = weixiujincheng;
	}
	
	/**
	 * 获取：维修进程
	 */
	public String getWeixiujincheng() {
		return weixiujincheng;
	}
			
}
