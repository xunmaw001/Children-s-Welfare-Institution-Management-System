package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AixinrenshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AixinrenshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AixinrenshiView;


/**
 * 爱心人士
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
public interface AixinrenshiService extends IService<AixinrenshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AixinrenshiVO> selectListVO(Wrapper<AixinrenshiEntity> wrapper);
   	
   	AixinrenshiVO selectVO(@Param("ew") Wrapper<AixinrenshiEntity> wrapper);
   	
   	List<AixinrenshiView> selectListView(Wrapper<AixinrenshiEntity> wrapper);
   	
   	AixinrenshiView selectView(@Param("ew") Wrapper<AixinrenshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AixinrenshiEntity> wrapper);
   	

}

