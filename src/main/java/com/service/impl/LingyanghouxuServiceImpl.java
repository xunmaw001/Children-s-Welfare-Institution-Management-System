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


import com.dao.LingyanghouxuDao;
import com.entity.LingyanghouxuEntity;
import com.service.LingyanghouxuService;
import com.entity.vo.LingyanghouxuVO;
import com.entity.view.LingyanghouxuView;

@Service("lingyanghouxuService")
public class LingyanghouxuServiceImpl extends ServiceImpl<LingyanghouxuDao, LingyanghouxuEntity> implements LingyanghouxuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingyanghouxuEntity> page = this.selectPage(
                new Query<LingyanghouxuEntity>(params).getPage(),
                new EntityWrapper<LingyanghouxuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingyanghouxuEntity> wrapper) {
		  Page<LingyanghouxuView> page =new Query<LingyanghouxuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingyanghouxuVO> selectListVO(Wrapper<LingyanghouxuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingyanghouxuVO selectVO(Wrapper<LingyanghouxuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingyanghouxuView> selectListView(Wrapper<LingyanghouxuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingyanghouxuView selectView(Wrapper<LingyanghouxuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
