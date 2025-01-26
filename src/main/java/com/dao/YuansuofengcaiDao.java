package com.dao;

import com.entity.YuansuofengcaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuansuofengcaiVO;
import com.entity.view.YuansuofengcaiView;


/**
 * 院所风采
 * 
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
public interface YuansuofengcaiDao extends BaseMapper<YuansuofengcaiEntity> {
	
	List<YuansuofengcaiVO> selectListVO(@Param("ew") Wrapper<YuansuofengcaiEntity> wrapper);
	
	YuansuofengcaiVO selectVO(@Param("ew") Wrapper<YuansuofengcaiEntity> wrapper);
	
	List<YuansuofengcaiView> selectListView(@Param("ew") Wrapper<YuansuofengcaiEntity> wrapper);

	List<YuansuofengcaiView> selectListView(Pagination page,@Param("ew") Wrapper<YuansuofengcaiEntity> wrapper);
	
	YuansuofengcaiView selectView(@Param("ew") Wrapper<YuansuofengcaiEntity> wrapper);
	

}
