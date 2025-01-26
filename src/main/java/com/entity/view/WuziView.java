package com.entity.view;

import com.entity.WuziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物资
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
@TableName("wuzi")
public class WuziView  extends WuziEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuziView(){
	}
 
 	public WuziView(WuziEntity wuziEntity){
 	try {
			BeanUtils.copyProperties(this, wuziEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
