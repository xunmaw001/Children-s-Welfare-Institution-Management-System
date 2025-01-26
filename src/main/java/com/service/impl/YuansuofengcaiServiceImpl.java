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


import com.dao.YuansuofengcaiDao;
import com.entity.YuansuofengcaiEntity;
import com.service.YuansuofengcaiService;
import com.entity.vo.YuansuofengcaiVO;
import com.entity.view.YuansuofengcaiView;

@Service("yuansuofengcaiService")
public class YuansuofengcaiServiceImpl extends ServiceImpl<YuansuofengcaiDao, YuansuofengcaiEntity> implements YuansuofengcaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuansuofengcaiEntity> page = this.selectPage(
                new Query<YuansuofengcaiEntity>(params).getPage(),
                new EntityWrapper<YuansuofengcaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuansuofengcaiEntity> wrapper) {
		  Page<YuansuofengcaiView> page =new Query<YuansuofengcaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuansuofengcaiVO> selectListVO(Wrapper<YuansuofengcaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuansuofengcaiVO selectVO(Wrapper<YuansuofengcaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuansuofengcaiView> selectListView(Wrapper<YuansuofengcaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuansuofengcaiView selectView(Wrapper<YuansuofengcaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
