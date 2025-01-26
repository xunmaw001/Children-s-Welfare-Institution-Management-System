package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingyanghouxuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingyanghouxuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyanghouxuView;


/**
 * 领养后续
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface LingyanghouxuService extends IService<LingyanghouxuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyanghouxuVO> selectListVO(Wrapper<LingyanghouxuEntity> wrapper);
   	
   	LingyanghouxuVO selectVO(@Param("ew") Wrapper<LingyanghouxuEntity> wrapper);
   	
   	List<LingyanghouxuView> selectListView(Wrapper<LingyanghouxuEntity> wrapper);
   	
   	LingyanghouxuView selectView(@Param("ew") Wrapper<LingyanghouxuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyanghouxuEntity> wrapper);
   	

}

