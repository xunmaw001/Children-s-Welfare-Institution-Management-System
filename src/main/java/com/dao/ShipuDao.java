package com.dao;

import com.entity.ShipuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipuVO;
import com.entity.view.ShipuView;


/**
 * 食谱
 * 
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
public interface ShipuDao extends BaseMapper<ShipuEntity> {
	
	List<ShipuVO> selectListVO(@Param("ew") Wrapper<ShipuEntity> wrapper);
	
	ShipuVO selectVO(@Param("ew") Wrapper<ShipuEntity> wrapper);
	
	List<ShipuView> selectListView(@Param("ew") Wrapper<ShipuEntity> wrapper);

	List<ShipuView> selectListView(Pagination page,@Param("ew") Wrapper<ShipuEntity> wrapper);
	
	ShipuView selectView(@Param("ew") Wrapper<ShipuEntity> wrapper);
	

}
