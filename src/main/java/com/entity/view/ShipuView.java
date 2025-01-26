package com.entity.view;

import com.entity.ShipuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 食谱
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
@TableName("shipu")
public class ShipuView  extends ShipuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShipuView(){
	}
 
 	public ShipuView(ShipuEntity shipuEntity){
 	try {
			BeanUtils.copyProperties(this, shipuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
