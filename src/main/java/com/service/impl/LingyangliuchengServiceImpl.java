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


import com.dao.LingyangliuchengDao;
import com.entity.LingyangliuchengEntity;
import com.service.LingyangliuchengService;
import com.entity.vo.LingyangliuchengVO;
import com.entity.view.LingyangliuchengView;

@Service("lingyangliuchengService")
public class LingyangliuchengServiceImpl extends ServiceImpl<LingyangliuchengDao, LingyangliuchengEntity> implements LingyangliuchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingyangliuchengEntity> page = this.selectPage(
                new Query<LingyangliuchengEntity>(params).getPage(),
                new EntityWrapper<LingyangliuchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingyangliuchengEntity> wrapper) {
		  Page<LingyangliuchengView> page =new Query<LingyangliuchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingyangliuchengVO> selectListVO(Wrapper<LingyangliuchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingyangliuchengVO selectVO(Wrapper<LingyangliuchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingyangliuchengView> selectListView(Wrapper<LingyangliuchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingyangliuchengView selectView(Wrapper<LingyangliuchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
