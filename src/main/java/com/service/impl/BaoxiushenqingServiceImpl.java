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


import com.dao.BaoxiushenqingDao;
import com.entity.BaoxiushenqingEntity;
import com.service.BaoxiushenqingService;
import com.entity.vo.BaoxiushenqingVO;
import com.entity.view.BaoxiushenqingView;

@Service("baoxiushenqingService")
public class BaoxiushenqingServiceImpl extends ServiceImpl<BaoxiushenqingDao, BaoxiushenqingEntity> implements BaoxiushenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiushenqingEntity> page = this.selectPage(
                new Query<BaoxiushenqingEntity>(params).getPage(),
                new EntityWrapper<BaoxiushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiushenqingEntity> wrapper) {
		  Page<BaoxiushenqingView> page =new Query<BaoxiushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiushenqingVO> selectListVO(Wrapper<BaoxiushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiushenqingVO selectVO(Wrapper<BaoxiushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiushenqingView> selectListView(Wrapper<BaoxiushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiushenqingView selectView(Wrapper<BaoxiushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
