package com.dao;

import com.entity.YigongshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YigongshenqingVO;
import com.entity.view.YigongshenqingView;


/**
 * 义工申请
 * 
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface YigongshenqingDao extends BaseMapper<YigongshenqingEntity> {
	
	List<YigongshenqingVO> selectListVO(@Param("ew") Wrapper<YigongshenqingEntity> wrapper);
	
	YigongshenqingVO selectVO(@Param("ew") Wrapper<YigongshenqingEntity> wrapper);
	
	List<YigongshenqingView> selectListView(@Param("ew") Wrapper<YigongshenqingEntity> wrapper);

	List<YigongshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<YigongshenqingEntity> wrapper);
	
	YigongshenqingView selectView(@Param("ew") Wrapper<YigongshenqingEntity> wrapper);
	

}
