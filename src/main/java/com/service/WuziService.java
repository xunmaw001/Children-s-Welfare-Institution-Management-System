package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuziView;


/**
 * 物资
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface WuziService extends IService<WuziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuziVO> selectListVO(Wrapper<WuziEntity> wrapper);
   	
   	WuziVO selectVO(@Param("ew") Wrapper<WuziEntity> wrapper);
   	
   	List<WuziView> selectListView(Wrapper<WuziEntity> wrapper);
   	
   	WuziView selectView(@Param("ew") Wrapper<WuziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuziEntity> wrapper);
   	

}

