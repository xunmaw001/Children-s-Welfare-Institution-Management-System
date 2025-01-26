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


import com.dao.ShipuDao;
import com.entity.ShipuEntity;
import com.service.ShipuService;
import com.entity.vo.ShipuVO;
import com.entity.view.ShipuView;

@Service("shipuService")
public class ShipuServiceImpl extends ServiceImpl<ShipuDao, ShipuEntity> implements ShipuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipuEntity> page = this.selectPage(
                new Query<ShipuEntity>(params).getPage(),
                new EntityWrapper<ShipuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipuEntity> wrapper) {
		  Page<ShipuView> page =new Query<ShipuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipuVO> selectListVO(Wrapper<ShipuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipuVO selectVO(Wrapper<ShipuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipuView> selectListView(Wrapper<ShipuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipuView selectView(Wrapper<ShipuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
