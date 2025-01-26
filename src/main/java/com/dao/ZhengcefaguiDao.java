package com.dao;

import com.entity.ZhengcefaguiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhengcefaguiVO;
import com.entity.view.ZhengcefaguiView;


/**
 * 政策法规
 * 
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface ZhengcefaguiDao extends BaseMapper<ZhengcefaguiEntity> {
	
	List<ZhengcefaguiVO> selectListVO(@Param("ew") Wrapper<ZhengcefaguiEntity> wrapper);
	
	ZhengcefaguiVO selectVO(@Param("ew") Wrapper<ZhengcefaguiEntity> wrapper);
	
	List<ZhengcefaguiView> selectListView(@Param("ew") Wrapper<ZhengcefaguiEntity> wrapper);

	List<ZhengcefaguiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhengcefaguiEntity> wrapper);
	
	ZhengcefaguiView selectView(@Param("ew") Wrapper<ZhengcefaguiEntity> wrapper);
	

}
