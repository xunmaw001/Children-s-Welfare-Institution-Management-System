package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ErtongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ErtongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ErtongxinxiView;


/**
 * 儿童信息
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
public interface ErtongxinxiService extends IService<ErtongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ErtongxinxiVO> selectListVO(Wrapper<ErtongxinxiEntity> wrapper);
   	
   	ErtongxinxiVO selectVO(@Param("ew") Wrapper<ErtongxinxiEntity> wrapper);
   	
   	List<ErtongxinxiView> selectListView(Wrapper<ErtongxinxiEntity> wrapper);
   	
   	ErtongxinxiView selectView(@Param("ew") Wrapper<ErtongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ErtongxinxiEntity> wrapper);
   	

}

