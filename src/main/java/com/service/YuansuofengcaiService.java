package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuansuofengcaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuansuofengcaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuansuofengcaiView;


/**
 * 院所风采
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
public interface YuansuofengcaiService extends IService<YuansuofengcaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuansuofengcaiVO> selectListVO(Wrapper<YuansuofengcaiEntity> wrapper);
   	
   	YuansuofengcaiVO selectVO(@Param("ew") Wrapper<YuansuofengcaiEntity> wrapper);
   	
   	List<YuansuofengcaiView> selectListView(Wrapper<YuansuofengcaiEntity> wrapper);
   	
   	YuansuofengcaiView selectView(@Param("ew") Wrapper<YuansuofengcaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuansuofengcaiEntity> wrapper);
   	

}

