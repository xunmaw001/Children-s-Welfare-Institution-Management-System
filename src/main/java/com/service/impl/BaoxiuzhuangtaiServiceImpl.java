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


import com.dao.BaoxiuzhuangtaiDao;
import com.entity.BaoxiuzhuangtaiEntity;
import com.service.BaoxiuzhuangtaiService;
import com.entity.vo.BaoxiuzhuangtaiVO;
import com.entity.view.BaoxiuzhuangtaiView;

@Service("baoxiuzhuangtaiService")
public class BaoxiuzhuangtaiServiceImpl extends ServiceImpl<BaoxiuzhuangtaiDao, BaoxiuzhuangtaiEntity> implements BaoxiuzhuangtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiuzhuangtaiEntity> page = this.selectPage(
                new Query<BaoxiuzhuangtaiEntity>(params).getPage(),
                new EntityWrapper<BaoxiuzhuangtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiuzhuangtaiEntity> wrapper) {
		  Page<BaoxiuzhuangtaiView> page =new Query<BaoxiuzhuangtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiuzhuangtaiVO> selectListVO(Wrapper<BaoxiuzhuangtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiuzhuangtaiVO selectVO(Wrapper<BaoxiuzhuangtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiuzhuangtaiView> selectListView(Wrapper<BaoxiuzhuangtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiuzhuangtaiView selectView(Wrapper<BaoxiuzhuangtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
