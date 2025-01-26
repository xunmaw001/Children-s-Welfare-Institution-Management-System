package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingyangliuchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingyangliuchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyangliuchengView;


/**
 * 领养流程
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface LingyangliuchengService extends IService<LingyangliuchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyangliuchengVO> selectListVO(Wrapper<LingyangliuchengEntity> wrapper);
   	
   	LingyangliuchengVO selectVO(@Param("ew") Wrapper<LingyangliuchengEntity> wrapper);
   	
   	List<LingyangliuchengView> selectListView(Wrapper<LingyangliuchengEntity> wrapper);
   	
   	LingyangliuchengView selectView(@Param("ew") Wrapper<LingyangliuchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyangliuchengEntity> wrapper);
   	

}

