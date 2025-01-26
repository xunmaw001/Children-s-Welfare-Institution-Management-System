package com.entity.view;

import com.entity.YigongshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 义工申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
@TableName("yigongshenqing")
public class YigongshenqingView  extends YigongshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YigongshenqingView(){
	}
 
 	public YigongshenqingView(YigongshenqingEntity yigongshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, yigongshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
