package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YigongshenqingDao;
import com.entity.YigongshenqingEntity;
import com.service.YigongshenqingService;
import com.entity.vo.YigongshenqingVO;
import com.entity.view.YigongshenqingView;

@Service("yigongshenqingService")
public class YigongshenqingServiceImpl extends ServiceImpl<YigongshenqingDao, YigongshenqingEntity> implements YigongshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YigongshenqingEntity> page = this.selectPage(
                new Query<YigongshenqingEntity>(params).getPage(),
                new EntityWrapper<YigongshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YigongshenqingEntity> wrapper) {
		  Page<YigongshenqingView> page =new Query<YigongshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YigongshenqingVO> selectListVO(Wrapper<YigongshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YigongshenqingVO selectVO(Wrapper<YigongshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YigongshenqingView> selectListView(Wrapper<YigongshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YigongshenqingView selectView(Wrapper<YigongshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
