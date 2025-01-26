package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushewupinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushewupinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushewupinView;


/**
 * 宿舍物品
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface SushewupinService extends IService<SushewupinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushewupinVO> selectListVO(Wrapper<SushewupinEntity> wrapper);
   	
   	SushewupinVO selectVO(@Param("ew") Wrapper<SushewupinEntity> wrapper);
   	
   	List<SushewupinView> selectListView(Wrapper<SushewupinEntity> wrapper);
   	
   	SushewupinView selectView(@Param("ew") Wrapper<SushewupinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushewupinEntity> wrapper);
   	

}

