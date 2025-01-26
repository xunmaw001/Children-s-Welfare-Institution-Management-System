package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipuView;


/**
 * 食谱
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
public interface ShipuService extends IService<ShipuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipuVO> selectListVO(Wrapper<ShipuEntity> wrapper);
   	
   	ShipuVO selectVO(@Param("ew") Wrapper<ShipuEntity> wrapper);
   	
   	List<ShipuView> selectListView(Wrapper<ShipuEntity> wrapper);
   	
   	ShipuView selectView(@Param("ew") Wrapper<ShipuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipuEntity> wrapper);
   	

}

