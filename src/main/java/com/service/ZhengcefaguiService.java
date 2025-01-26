package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhengcefaguiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhengcefaguiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhengcefaguiView;


/**
 * 政策法规
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface ZhengcefaguiService extends IService<ZhengcefaguiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhengcefaguiVO> selectListVO(Wrapper<ZhengcefaguiEntity> wrapper);
   	
   	ZhengcefaguiVO selectVO(@Param("ew") Wrapper<ZhengcefaguiEntity> wrapper);
   	
   	List<ZhengcefaguiView> selectListView(Wrapper<ZhengcefaguiEntity> wrapper);
   	
   	ZhengcefaguiView selectView(@Param("ew") Wrapper<ZhengcefaguiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhengcefaguiEntity> wrapper);
   	

}

