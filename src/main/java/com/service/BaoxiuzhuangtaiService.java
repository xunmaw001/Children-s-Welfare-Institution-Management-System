package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxiuzhuangtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxiuzhuangtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxiuzhuangtaiView;


/**
 * 报修状态
 *
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface BaoxiuzhuangtaiService extends IService<BaoxiuzhuangtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiuzhuangtaiVO> selectListVO(Wrapper<BaoxiuzhuangtaiEntity> wrapper);
   	
   	BaoxiuzhuangtaiVO selectVO(@Param("ew") Wrapper<BaoxiuzhuangtaiEntity> wrapper);
   	
   	List<BaoxiuzhuangtaiView> selectListView(Wrapper<BaoxiuzhuangtaiEntity> wrapper);
   	
   	BaoxiuzhuangtaiView selectView(@Param("ew") Wrapper<BaoxiuzhuangtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiuzhuangtaiEntity> wrapper);
   	

}

