package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.LingyangliuchengEntity;
import com.entity.view.LingyangliuchengView;

import com.service.LingyangliuchengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 领养流程
 * 后端接口
 * @author 
 * @email 
 * @date 2022-12-30 16:32:42
 */
@RestController
@RequestMapping("/lingyangliucheng")
public class LingyangliuchengController {
    @Autowired
    private LingyangliuchengService lingyangliuchengService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LingyangliuchengEntity lingyangliucheng, 
		HttpServletRequest request){

        EntityWrapper<LingyangliuchengEntity> ew = new EntityWrapper<LingyangliuchengEntity>();


		PageUtils page = lingyangliuchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lingyangliucheng), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LingyangliuchengEntity lingyangliucheng, 
		HttpServletRequest request){
        EntityWrapper<LingyangliuchengEntity> ew = new EntityWrapper<LingyangliuchengEntity>();

		PageUtils page = lingyangliuchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lingyangliucheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LingyangliuchengEntity lingyangliucheng){
       	EntityWrapper<LingyangliuchengEntity> ew = new EntityWrapper<LingyangliuchengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lingyangliucheng, "lingyangliucheng")); 
        return R.ok().put("data", lingyangliuchengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LingyangliuchengEntity lingyangliucheng){
        EntityWrapper< LingyangliuchengEntity> ew = new EntityWrapper< LingyangliuchengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lingyangliucheng, "lingyangliucheng")); 
		LingyangliuchengView lingyangliuchengView =  lingyangliuchengService.selectView(ew);
		return R.ok("查询领养流程成功").put("data", lingyangliuchengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LingyangliuchengEntity lingyangliucheng = lingyangliuchengService.selectById(id);
        return R.ok().put("data", lingyangliucheng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LingyangliuchengEntity lingyangliucheng = lingyangliuchengService.selectById(id);
        return R.ok().put("data", lingyangliucheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LingyangliuchengEntity lingyangliucheng, HttpServletRequest request){
    	lingyangliucheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lingyangliucheng);

        lingyangliuchengService.insert(lingyangliucheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LingyangliuchengEntity lingyangliucheng, HttpServletRequest request){
    	lingyangliucheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lingyangliucheng);

        lingyangliuchengService.insert(lingyangliucheng);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LingyangliuchengEntity lingyangliucheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lingyangliucheng);
        lingyangliuchengService.updateById(lingyangliucheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lingyangliuchengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<LingyangliuchengEntity> wrapper = new EntityWrapper<LingyangliuchengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = lingyangliuchengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	








}
