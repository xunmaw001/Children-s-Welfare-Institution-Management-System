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


import com.dao.ZhengcefaguiDao;
import com.entity.ZhengcefaguiEntity;
import com.service.ZhengcefaguiService;
import com.entity.vo.ZhengcefaguiVO;
import com.entity.view.ZhengcefaguiView;

@Service("zhengcefaguiService")
public class ZhengcefaguiServiceImpl extends ServiceImpl<ZhengcefaguiDao, ZhengcefaguiEntity> implements ZhengcefaguiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhengcefaguiEntity> page = this.selectPage(
                new Query<ZhengcefaguiEntity>(params).getPage(),
                new EntityWrapper<ZhengcefaguiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhengcefaguiEntity> wrapper) {
		  Page<ZhengcefaguiView> page =new Query<ZhengcefaguiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhengcefaguiVO> selectListVO(Wrapper<ZhengcefaguiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhengcefaguiVO selectVO(Wrapper<ZhengcefaguiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhengcefaguiView> selectListView(Wrapper<ZhengcefaguiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhengcefaguiView selectView(Wrapper<ZhengcefaguiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
