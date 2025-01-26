package com.dao;

import com.entity.BaoxiuzhuangtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiuzhuangtaiVO;
import com.entity.view.BaoxiuzhuangtaiView;


/**
 * 报修状态
 * 
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
public interface BaoxiuzhuangtaiDao extends BaseMapper<BaoxiuzhuangtaiEntity> {
	
	List<BaoxiuzhuangtaiVO> selectListVO(@Param("ew") Wrapper<BaoxiuzhuangtaiEntity> wrapper);
	
	BaoxiuzhuangtaiVO selectVO(@Param("ew") Wrapper<BaoxiuzhuangtaiEntity> wrapper);
	
	List<BaoxiuzhuangtaiView> selectListView(@Param("ew") Wrapper<BaoxiuzhuangtaiEntity> wrapper);

	List<BaoxiuzhuangtaiView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiuzhuangtaiEntity> wrapper);
	
	BaoxiuzhuangtaiView selectView(@Param("ew") Wrapper<BaoxiuzhuangtaiEntity> wrapper);
	

}
