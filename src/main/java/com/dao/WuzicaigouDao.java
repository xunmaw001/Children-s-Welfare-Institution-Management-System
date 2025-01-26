package com.dao;

import com.entity.WuzicaigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzicaigouVO;
import com.entity.view.WuzicaigouView;


/**
 * 物资采购
 * 
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface WuzicaigouDao extends BaseMapper<WuzicaigouEntity> {
	
	List<WuzicaigouVO> selectListVO(@Param("ew") Wrapper<WuzicaigouEntity> wrapper);
	
	WuzicaigouVO selectVO(@Param("ew") Wrapper<WuzicaigouEntity> wrapper);
	
	List<WuzicaigouView> selectListView(@Param("ew") Wrapper<WuzicaigouEntity> wrapper);

	List<WuzicaigouView> selectListView(Pagination page,@Param("ew") Wrapper<WuzicaigouEntity> wrapper);
	
	WuzicaigouView selectView(@Param("ew") Wrapper<WuzicaigouEntity> wrapper);
	

}
