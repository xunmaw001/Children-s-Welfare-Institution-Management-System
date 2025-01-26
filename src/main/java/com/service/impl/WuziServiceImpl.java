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


import com.dao.WuziDao;
import com.entity.WuziEntity;
import com.service.WuziService;
import com.entity.vo.WuziVO;
import com.entity.view.WuziView;

@Service("wuziService")
public class WuziServiceImpl extends ServiceImpl<WuziDao, WuziEntity> implements WuziService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuziEntity> page = this.selectPage(
                new Query<WuziEntity>(params).getPage(),
                new EntityWrapper<WuziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuziEntity> wrapper) {
		  Page<WuziView> page =new Query<WuziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuziVO> selectListVO(Wrapper<WuziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuziVO selectVO(Wrapper<WuziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuziView> selectListView(Wrapper<WuziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuziView selectView(Wrapper<WuziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
