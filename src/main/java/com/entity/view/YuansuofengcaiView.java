package com.entity.view;

import com.entity.YuansuofengcaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 院所风采
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
@TableName("yuansuofengcai")
public class YuansuofengcaiView  extends YuansuofengcaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuansuofengcaiView(){
	}
 
 	public YuansuofengcaiView(YuansuofengcaiEntity yuansuofengcaiEntity){
 	try {
			BeanUtils.copyProperties(this, yuansuofengcaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
