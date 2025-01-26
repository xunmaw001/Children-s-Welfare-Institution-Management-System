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

import com.entity.AixinrenshiEntity;
import com.entity.view.AixinrenshiView;

import com.service.AixinrenshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 爱心人士
 * 后端接口
 * @author 
 * @email 
 * @date 2022-12-30 16:32:41
 */
@RestController
@RequestMapping("/aixinrenshi")
public class AixinrenshiController {
    @Autowired
    private AixinrenshiService aixinrenshiService;



    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		AixinrenshiEntity u = aixinrenshiService.selectOne(new EntityWrapper<AixinrenshiEntity>().eq("zhanghao", username));
		if(u==null || !u.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		String token = tokenService.generateToken(u.getId(), username,"aixinrenshi",  "爱心人士" );
		return R.ok().put("token", token);
	}
	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody AixinrenshiEntity aixinrenshi){
    	//ValidatorUtils.validateEntity(aixinrenshi);
    	AixinrenshiEntity u = aixinrenshiService.selectOne(new EntityWrapper<AixinrenshiEntity>().eq("zhanghao", aixinrenshi.getZhanghao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		aixinrenshi.setId(uId);
        aixinrenshiService.insert(aixinrenshi);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        AixinrenshiEntity u = aixinrenshiService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	AixinrenshiEntity u = aixinrenshiService.selectOne(new EntityWrapper<AixinrenshiEntity>().eq("zhanghao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
    	u.setMima("123456");
        aixinrenshiService.updateById(u);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,AixinrenshiEntity aixinrenshi, 
		HttpServletRequest request){

        EntityWrapper<AixinrenshiEntity> ew = new EntityWrapper<AixinrenshiEntity>();


		PageUtils page = aixinrenshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, aixinrenshi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,AixinrenshiEntity aixinrenshi, 
		HttpServletRequest request){
        EntityWrapper<AixinrenshiEntity> ew = new EntityWrapper<AixinrenshiEntity>();

		PageUtils page = aixinrenshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, aixinrenshi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( AixinrenshiEntity aixinrenshi){
       	EntityWrapper<AixinrenshiEntity> ew = new EntityWrapper<AixinrenshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( aixinrenshi, "aixinrenshi")); 
        return R.ok().put("data", aixinrenshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(AixinrenshiEntity aixinrenshi){
        EntityWrapper< AixinrenshiEntity> ew = new EntityWrapper< AixinrenshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( aixinrenshi, "aixinrenshi")); 
		AixinrenshiView aixinrenshiView =  aixinrenshiService.selectView(ew);
		return R.ok("查询爱心人士成功").put("data", aixinrenshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        AixinrenshiEntity aixinrenshi = aixinrenshiService.selectById(id);
        return R.ok().put("data", aixinrenshi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        AixinrenshiEntity aixinrenshi = aixinrenshiService.selectById(id);
        return R.ok().put("data", aixinrenshi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AixinrenshiEntity aixinrenshi, HttpServletRequest request){
    	aixinrenshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(aixinrenshi);
    	AixinrenshiEntity u = aixinrenshiService.selectOne(new EntityWrapper<AixinrenshiEntity>().eq("zhanghao", aixinrenshi.getZhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}

		aixinrenshi.setId(new Date().getTime());
        aixinrenshiService.insert(aixinrenshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody AixinrenshiEntity aixinrenshi, HttpServletRequest request){
    	aixinrenshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(aixinrenshi);
    	AixinrenshiEntity u = aixinrenshiService.selectOne(new EntityWrapper<AixinrenshiEntity>().eq("zhanghao", aixinrenshi.getZhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}

		aixinrenshi.setId(new Date().getTime());
        aixinrenshiService.insert(aixinrenshi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody AixinrenshiEntity aixinrenshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(aixinrenshi);
        aixinrenshiService.updateById(aixinrenshi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        aixinrenshiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<AixinrenshiEntity> wrapper = new EntityWrapper<AixinrenshiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = aixinrenshiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	








}
