package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YigongshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YigongshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YigongshenqingView;


/**
 * 义工申请
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface YigongshenqingService extends IService<YigongshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YigongshenqingVO> selectListVO(Wrapper<YigongshenqingEntity> wrapper);
   	
   	YigongshenqingVO selectVO(@Param("ew") Wrapper<YigongshenqingEntity> wrapper);
   	
   	List<YigongshenqingView> selectListView(Wrapper<YigongshenqingEntity> wrapper);
   	
   	YigongshenqingView selectView(@Param("ew") Wrapper<YigongshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YigongshenqingEntity> wrapper);
   	

}

