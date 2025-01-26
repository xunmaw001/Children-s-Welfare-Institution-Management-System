package com.dao;

import com.entity.LingyangliuchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingyangliuchengVO;
import com.entity.view.LingyangliuchengView;


/**
 * 领养流程
 * 
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface LingyangliuchengDao extends BaseMapper<LingyangliuchengEntity> {
	
	List<LingyangliuchengVO> selectListVO(@Param("ew") Wrapper<LingyangliuchengEntity> wrapper);
	
	LingyangliuchengVO selectVO(@Param("ew") Wrapper<LingyangliuchengEntity> wrapper);
	
	List<LingyangliuchengView> selectListView(@Param("ew") Wrapper<LingyangliuchengEntity> wrapper);

	List<LingyangliuchengView> selectListView(Pagination page,@Param("ew") Wrapper<LingyangliuchengEntity> wrapper);
	
	LingyangliuchengView selectView(@Param("ew") Wrapper<LingyangliuchengEntity> wrapper);
	

}
