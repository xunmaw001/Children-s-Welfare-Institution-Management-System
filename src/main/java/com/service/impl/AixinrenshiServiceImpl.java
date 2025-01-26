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


import com.dao.AixinrenshiDao;
import com.entity.AixinrenshiEntity;
import com.service.AixinrenshiService;
import com.entity.vo.AixinrenshiVO;
import com.entity.view.AixinrenshiView;

@Service("aixinrenshiService")
public class AixinrenshiServiceImpl extends ServiceImpl<AixinrenshiDao, AixinrenshiEntity> implements AixinrenshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AixinrenshiEntity> page = this.selectPage(
                new Query<AixinrenshiEntity>(params).getPage(),
                new EntityWrapper<AixinrenshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AixinrenshiEntity> wrapper) {
		  Page<AixinrenshiView> page =new Query<AixinrenshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AixinrenshiVO> selectListVO(Wrapper<AixinrenshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AixinrenshiVO selectVO(Wrapper<AixinrenshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AixinrenshiView> selectListView(Wrapper<AixinrenshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AixinrenshiView selectView(Wrapper<AixinrenshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
