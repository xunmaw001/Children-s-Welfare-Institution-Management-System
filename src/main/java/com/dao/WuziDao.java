package com.dao;

import com.entity.WuziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuziVO;
import com.entity.view.WuziView;


/**
 * 物资
 * 
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface WuziDao extends BaseMapper<WuziEntity> {
	
	List<WuziVO> selectListVO(@Param("ew") Wrapper<WuziEntity> wrapper);
	
	WuziVO selectVO(@Param("ew") Wrapper<WuziEntity> wrapper);
	
	List<WuziView> selectListView(@Param("ew") Wrapper<WuziEntity> wrapper);

	List<WuziView> selectListView(Pagination page,@Param("ew") Wrapper<WuziEntity> wrapper);
	
	WuziView selectView(@Param("ew") Wrapper<WuziEntity> wrapper);
	

}
