package com.dao;

import com.entity.HuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongVO;
import com.entity.view.HuodongView;


/**
 * 活动
 * 
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
public interface HuodongDao extends BaseMapper<HuodongEntity> {
	
	List<HuodongVO> selectListVO(@Param("ew") Wrapper<HuodongEntity> wrapper);
	
	HuodongVO selectVO(@Param("ew") Wrapper<HuodongEntity> wrapper);
	
	List<HuodongView> selectListView(@Param("ew") Wrapper<HuodongEntity> wrapper);

	List<HuodongView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongEntity> wrapper);
	
	HuodongView selectView(@Param("ew") Wrapper<HuodongEntity> wrapper);
	

}
