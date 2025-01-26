package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SusheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SusheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SusheView;


/**
 * 宿舍
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface SusheService extends IService<SusheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SusheVO> selectListVO(Wrapper<SusheEntity> wrapper);
   	
   	SusheVO selectVO(@Param("ew") Wrapper<SusheEntity> wrapper);
   	
   	List<SusheView> selectListView(Wrapper<SusheEntity> wrapper);
   	
   	SusheView selectView(@Param("ew") Wrapper<SusheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SusheEntity> wrapper);
   	

}

