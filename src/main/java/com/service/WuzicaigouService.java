package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzicaigouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzicaigouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzicaigouView;


/**
 * 物资采购
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface WuzicaigouService extends IService<WuzicaigouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzicaigouVO> selectListVO(Wrapper<WuzicaigouEntity> wrapper);
   	
   	WuzicaigouVO selectVO(@Param("ew") Wrapper<WuzicaigouEntity> wrapper);
   	
   	List<WuzicaigouView> selectListView(Wrapper<WuzicaigouEntity> wrapper);
   	
   	WuzicaigouView selectView(@Param("ew") Wrapper<WuzicaigouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzicaigouEntity> wrapper);
   	

}

