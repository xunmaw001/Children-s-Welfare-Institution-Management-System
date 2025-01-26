package com.dao;

import com.entity.LingyanghouxuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingyanghouxuVO;
import com.entity.view.LingyanghouxuView;


/**
 * 领养后续
 * 
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface LingyanghouxuDao extends BaseMapper<LingyanghouxuEntity> {
	
	List<LingyanghouxuVO> selectListVO(@Param("ew") Wrapper<LingyanghouxuEntity> wrapper);
	
	LingyanghouxuVO selectVO(@Param("ew") Wrapper<LingyanghouxuEntity> wrapper);
	
	List<LingyanghouxuView> selectListView(@Param("ew") Wrapper<LingyanghouxuEntity> wrapper);

	List<LingyanghouxuView> selectListView(Pagination page,@Param("ew") Wrapper<LingyanghouxuEntity> wrapper);
	
	LingyanghouxuView selectView(@Param("ew") Wrapper<LingyanghouxuEntity> wrapper);
	

}
