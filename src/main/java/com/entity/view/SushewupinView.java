package com.entity.view;

import com.entity.SushewupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿舍物品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
@TableName("sushewupin")
public class SushewupinView  extends SushewupinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SushewupinView(){
	}
 
 	public SushewupinView(SushewupinEntity sushewupinEntity){
 	try {
			BeanUtils.copyProperties(this, sushewupinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
