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


import com.dao.SusheDao;
import com.entity.SusheEntity;
import com.service.SusheService;
import com.entity.vo.SusheVO;
import com.entity.view.SusheView;

@Service("susheService")
public class SusheServiceImpl extends ServiceImpl<SusheDao, SusheEntity> implements SusheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SusheEntity> page = this.selectPage(
                new Query<SusheEntity>(params).getPage(),
                new EntityWrapper<SusheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SusheEntity> wrapper) {
		  Page<SusheView> page =new Query<SusheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SusheVO> selectListVO(Wrapper<SusheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SusheVO selectVO(Wrapper<SusheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SusheView> selectListView(Wrapper<SusheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SusheView selectView(Wrapper<SusheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
