package com.entity.view;

import com.entity.LingyangliuchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 领养流程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
@TableName("lingyangliucheng")
public class LingyangliuchengView  extends LingyangliuchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingyangliuchengView(){
	}
 
 	public LingyangliuchengView(LingyangliuchengEntity lingyangliuchengEntity){
 	try {
			BeanUtils.copyProperties(this, lingyangliuchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
