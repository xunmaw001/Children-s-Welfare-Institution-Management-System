package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxiushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxiushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxiushenqingView;


/**
 * 报修申请
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface BaoxiushenqingService extends IService<BaoxiushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiushenqingVO> selectListVO(Wrapper<BaoxiushenqingEntity> wrapper);
   	
   	BaoxiushenqingVO selectVO(@Param("ew") Wrapper<BaoxiushenqingEntity> wrapper);
   	
   	List<BaoxiushenqingView> selectListView(Wrapper<BaoxiushenqingEntity> wrapper);
   	
   	BaoxiushenqingView selectView(@Param("ew") Wrapper<BaoxiushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiushenqingEntity> wrapper);
   	

}

