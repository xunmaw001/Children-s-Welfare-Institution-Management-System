package com.entity.view;

import com.entity.LingyanghouxuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 领养后续
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
@TableName("lingyanghouxu")
public class LingyanghouxuView  extends LingyanghouxuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingyanghouxuView(){
	}
 
 	public LingyanghouxuView(LingyanghouxuEntity lingyanghouxuEntity){
 	try {
			BeanUtils.copyProperties(this, lingyanghouxuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
