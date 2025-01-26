package com.dao;

import com.entity.AixinrenshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AixinrenshiVO;
import com.entity.view.AixinrenshiView;


/**
 * 爱心人士
 * 
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
public interface AixinrenshiDao extends BaseMapper<AixinrenshiEntity> {
	
	List<AixinrenshiVO> selectListVO(@Param("ew") Wrapper<AixinrenshiEntity> wrapper);
	
	AixinrenshiVO selectVO(@Param("ew") Wrapper<AixinrenshiEntity> wrapper);
	
	List<AixinrenshiView> selectListView(@Param("ew") Wrapper<AixinrenshiEntity> wrapper);

	List<AixinrenshiView> selectListView(Pagination page,@Param("ew") Wrapper<AixinrenshiEntity> wrapper);
	
	AixinrenshiView selectView(@Param("ew") Wrapper<AixinrenshiEntity> wrapper);
	

}
