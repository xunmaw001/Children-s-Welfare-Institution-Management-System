package com.dao;

import com.entity.BaoxiushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiushenqingVO;
import com.entity.view.BaoxiushenqingView;


/**
 * 报修申请
 * 
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface BaoxiushenqingDao extends BaseMapper<BaoxiushenqingEntity> {
	
	List<BaoxiushenqingVO> selectListVO(@Param("ew") Wrapper<BaoxiushenqingEntity> wrapper);
	
	BaoxiushenqingVO selectVO(@Param("ew") Wrapper<BaoxiushenqingEntity> wrapper);
	
	List<BaoxiushenqingView> selectListView(@Param("ew") Wrapper<BaoxiushenqingEntity> wrapper);

	List<BaoxiushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiushenqingEntity> wrapper);
	
	BaoxiushenqingView selectView(@Param("ew") Wrapper<BaoxiushenqingEntity> wrapper);
	

}
