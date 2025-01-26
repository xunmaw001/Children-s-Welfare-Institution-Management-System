package com.dao;

import com.entity.SusheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SusheVO;
import com.entity.view.SusheView;


/**
 * 宿舍
 * 
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface SusheDao extends BaseMapper<SusheEntity> {
	
	List<SusheVO> selectListVO(@Param("ew") Wrapper<SusheEntity> wrapper);
	
	SusheVO selectVO(@Param("ew") Wrapper<SusheEntity> wrapper);
	
	List<SusheView> selectListView(@Param("ew") Wrapper<SusheEntity> wrapper);

	List<SusheView> selectListView(Pagination page,@Param("ew") Wrapper<SusheEntity> wrapper);
	
	SusheView selectView(@Param("ew") Wrapper<SusheEntity> wrapper);
	

}
