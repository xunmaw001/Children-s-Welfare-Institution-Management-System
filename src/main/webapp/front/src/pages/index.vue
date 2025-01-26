<template>
	<div class="main-containers">
		<div class="top-container" :style='{"boxShadow":"0 0px 0px rgba(64, 158, 255, .3)","padding":"0 20px","alignItems":"center","display":"flex","justifyContent":"space-between","overflow":"hidden","top":"0","left":"0","background":"#FDB930","width":"100%","position":"fixed","height":"64px","zIndex":"1002"}'>
			<img v-if='true' :style='{"width":"0","objectFit":"cover","borderRadius":"100%","display":"block","height":"0"}' src='http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg'>
			<div v-if="true" :style='{"fontSize":"20px","color":"#fff","textAlign":"center","fontWeight":"bold"}'>儿童福利院管理系统</div>
			<div>
				<div v-if="false" :style='{"color":"#fff","fontSize":"14px","display":"inline-block"}'>0753-1234567</div>
				<el-button v-if="!Token" @click="toLogin()" :style='{"padding":"0 12px","margin":"0 0 0 10px","color":"#FDB930","borderRadius":"22px","background":"#fff","display":"inline-block","fontSize":"14px","lineHeight":"32px","height":"32px"}'>登录/注册</el-button>
                <el-button v-if="Token" @click="logout" :style='{"padding":"0 12px","margin":"0 0 0 10px","color":"#999","borderRadius":"22px","background":"#f4f4f5","display":"inline-block","fontSize":"14px","lineHeight":"32px","height":"32px"}'>退出</el-button>
			</div>
		</div>
		
		
		<div class="body-containers" :style='"horizontal" == "vertical" ? {"minHeight":"100vh","padding":"64px 0 0","margin":"0 0 0 210px","position":"relative","background":"rgba(64, 158, 255, .3)","display":"block"} : {"minHeight":"100vh","padding":"240px 0 0","margin":"0","position":"relative","background":"url(http://codegen.caihongy.cn/20220915/2bf68ea192d74b948521a777420aef08.png)  center center/cover no-repeat fixed"}'>
			<div class="menu-preview" :style='{"padding":"45px 30px","boxShadow":" 0px 4px 10px 0px rgba(0,0,0,0.302)","borderColor":"#efefef","margin":"0 auto","borderRadius":"10px","top":"64px","left":"100px","background":"#fff","borderWidth":"0 0 1px 0","width":"calc(100% - 200px)","position":"fixed","borderStyle":"solid","height":"auto","zIndex":"1003"}'>
				<el-menu class="el-menu-horizontal-demo" :style='{"border":0,"padding":"0","listStyle":"none","margin":"0","position":"relative","background":"#FFF"}' :default-active="activeIndex" :unique-opened="true" mode="horizontal" :router="true" @select="handleSelect">
					<el-image v-if="false" :style='{"width":"44px","margin":"8px 10px 8px 0","objectFit":"cover","borderRadius":"100%","float":"left","height":"44px"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" fit="cover"></el-image>
					<el-menu-item v-for="(menu, index) in menuList" :index="index + ''" :key="index" :route="menu.url">
						<i v-if="true" :style='{"padding":"0 10px","margin":"0","color":"inherit","width":"14px","lineHeight":"60px","fontSize":"14px","height":"60px"}' :class="iconArr[index]"></i>
						<span :style='{"padding":"0 10px","lineHeight":"60px","fontSize":"14px","color":"inherit","height":"60px"}'>{{menu.name}}</span>
					</el-menu-item>
					<el-menu-item @click="goBackend">
						<i v-if="true" :style='{"padding":"0 10px","margin":"0","color":"inherit","width":"14px","lineHeight":"60px","fontSize":"14px","height":"60px"}' class="el-icon-box"></i>
						<span :style='{"padding":"0 10px","lineHeight":"60px","fontSize":"14px","color":"inherit","height":"60px"}'>后台管理</span>
					</el-menu-item>
					<el-menu-item :index="menuList.length + 2 + ''" v-if="Token && notAdmin" @click="goMenu('/index/center')">
						<i v-if="true" :style='{"padding":"0 10px","margin":"0","color":"inherit","width":"14px","lineHeight":"60px","fontSize":"14px","height":"60px"}' class="el-icon-user"></i>
						<span :style='{"padding":"0 10px","lineHeight":"60px","fontSize":"14px","color":"inherit","height":"60px"}'>个人中心</span>
					</el-menu-item>
				</el-menu>
			</div>
			
			<div class="banner-preview" :style='{"width":"100%","height":"auto"}'>
				<el-carousel :style='{"width":"100%","margin":"0 auto"}' trigger="click" indicator-position="inside" arrow="always" type="default" direction="horizontal" height="400px" :autoplay="false" :interval="3000" :loop="true">
					<el-carousel-item :style='{"borderRadius":"10px","width":"100%","height":"100%"}' v-for="item in carouselList" :key="item.id">
						<el-image :style='{"objectFit":"cover","width":"100%","height":"100%"}' :src="baseUrl + item.value" fit="cover"></el-image>
					</el-carousel-item>
				</el-carousel>
			</div>
			
			<router-view></router-view>
			
			<div class="bottom-preview" :style='{"padding":"20px 0","alignItems":"center","background":"#000","flexDirection":"column","display":"flex","width":"100%","justifyContent":"center","height":"100px"}'>
			    <img :style='{"width":"0","objectFit":"cover","borderRadius":"100%","display":"block","height":"0"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" >
			    <div :style='{"margin":"10px 0 0","fontSize":"14px","lineHeight":"28px","color":"#333"}'></div>
			    <div :style='{"margin":"10px 0 0","fontSize":"14px","lineHeight":"28px","color":"#333"}'></div>
			    <div :style='{"margin":"10px 0 0","fontSize":"14px","lineHeight":"28px","color":"#333"}'></div>
			</div>
		</div>
		
	</div>
</template>

<script>
import Vue from 'vue'
export default {
    data() {
		return {
            activeIndex: '0',
			roleMenus: [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看"],"menu":"爱心人士","menuJump":"列表","tableName":"aixinrenshi"}],"menu":"爱心人士管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"后勤人员","menuJump":"列表","tableName":"houqinrenyuan"}],"menu":"后勤人员管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"儿童信息","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除"],"menu":"院所风采","menuJump":"列表","tableName":"yuansuofengcai"}],"menu":"院所风采管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"活动","menuJump":"列表","tableName":"huodong"}],"menu":"活动管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"食谱","menuJump":"列表","tableName":"shipu"}],"menu":"食谱管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"领养流程","menuJump":"列表","tableName":"lingyangliucheng"}],"menu":"领养流程管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"政策法规","menuJump":"列表","tableName":"zhengcefagui"}],"menu":"政策法规管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看"],"menu":"楼栋","menuJump":"列表","tableName":"loudong"}],"menu":"楼栋管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"宿舍","menuJump":"列表","tableName":"sushe"}],"menu":"宿舍管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"领养申请","menuJump":"列表","tableName":"lingyangshenqing"}],"menu":"领养申请管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"义工申请","menuJump":"列表","tableName":"yigongshenqing"}],"menu":"义工申请管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"捐赠信息","menuJump":"列表","tableName":"juanzengxinxi"}],"menu":"捐赠信息管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看"],"menu":"宿舍物品","menuJump":"列表","tableName":"sushewupin"}],"menu":"宿舍物品管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"物资","menuJump":"列表","tableName":"wuzi"}],"menu":"物资管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"物资采购","menuJump":"列表","tableName":"wuzicaigou"}],"menu":"物资采购管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"报修申请","menuJump":"列表","tableName":"baoxiushenqing"}],"menu":"报修申请管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"报修状态","menuJump":"列表","tableName":"baoxiuzhuangtai"}],"menu":"报修状态管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"宿舍分配","menuJump":"列表","tableName":"sushefenpei"}],"menu":"宿舍分配管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"领养后续","menuJump":"列表","tableName":"lingyanghouxu"}],"menu":"领养后续管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","回复","删除"],"menu":"在线留言","tableName":"messages"}],"menu":"在线留言"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公益广告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","领养申请"],"menu":"儿童信息列表","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息模块"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"院所风采列表","menuJump":"列表","tableName":"yuansuofengcai"}],"menu":"院所风采模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"活动列表","menuJump":"列表","tableName":"huodong"}],"menu":"活动模块"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看"],"menu":"食谱列表","menuJump":"列表","tableName":"shipu"}],"menu":"食谱模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"领养流程列表","menuJump":"列表","tableName":"lingyangliucheng"}],"menu":"领养流程模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"政策法规列表","menuJump":"列表","tableName":"zhengcefagui"}],"menu":"政策法规模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","领养申请"],"menu":"儿童信息","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"领养申请","menuJump":"列表","tableName":"lingyangshenqing"}],"menu":"领养申请管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看"],"menu":"义工申请","menuJump":"列表","tableName":"yigongshenqing"}],"menu":"义工申请管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看"],"menu":"捐赠信息","menuJump":"列表","tableName":"juanzengxinxi"}],"menu":"捐赠信息管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"领养后续","menuJump":"列表","tableName":"lingyanghouxu"}],"menu":"领养后续管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","领养申请"],"menu":"儿童信息列表","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息模块"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"院所风采列表","menuJump":"列表","tableName":"yuansuofengcai"}],"menu":"院所风采模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"活动列表","menuJump":"列表","tableName":"huodong"}],"menu":"活动模块"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看"],"menu":"食谱列表","menuJump":"列表","tableName":"shipu"}],"menu":"食谱模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"领养流程列表","menuJump":"列表","tableName":"lingyangliucheng"}],"menu":"领养流程模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"政策法规列表","menuJump":"列表","tableName":"zhengcefagui"}],"menu":"政策法规模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"爱心人士","tableName":"aixinrenshi"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看"],"menu":"爱心人士","menuJump":"列表","tableName":"aixinrenshi"}],"menu":"爱心人士管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"儿童信息","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"活动","menuJump":"列表","tableName":"huodong"}],"menu":"活动管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除"],"menu":"食谱","menuJump":"列表","tableName":"shipu"}],"menu":"食谱管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","宿舍"],"menu":"楼栋","menuJump":"列表","tableName":"loudong"}],"menu":"楼栋管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","修改","分配","物品"],"menu":"宿舍","menuJump":"列表","tableName":"sushe"}],"menu":"宿舍管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","审核","领养后续"],"menu":"领养申请","menuJump":"列表","tableName":"lingyangshenqing"}],"menu":"领养申请管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","审核"],"menu":"义工申请","menuJump":"列表","tableName":"yigongshenqing"}],"menu":"义工申请管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","审核"],"menu":"捐赠信息","menuJump":"列表","tableName":"juanzengxinxi"}],"menu":"捐赠信息管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","删除"],"menu":"宿舍物品","menuJump":"列表","tableName":"sushewupin"}],"menu":"宿舍物品管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","删除"],"menu":"物资","menuJump":"列表","tableName":"wuzi"}],"menu":"物资管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"物资采购","menuJump":"列表","tableName":"wuzicaigou"}],"menu":"物资采购管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","审核"],"menu":"报修申请","menuJump":"列表","tableName":"baoxiushenqing"}],"menu":"报修申请管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"报修状态","menuJump":"列表","tableName":"baoxiuzhuangtai"}],"menu":"报修状态管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"宿舍分配","menuJump":"列表","tableName":"sushefenpei"}],"menu":"宿舍分配管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"领养后续","menuJump":"列表","tableName":"lingyanghouxu"}],"menu":"领养后续管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","领养申请"],"menu":"儿童信息列表","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息模块"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"院所风采列表","menuJump":"列表","tableName":"yuansuofengcai"}],"menu":"院所风采模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"活动列表","menuJump":"列表","tableName":"huodong"}],"menu":"活动模块"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看"],"menu":"食谱列表","menuJump":"列表","tableName":"shipu"}],"menu":"食谱模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"领养流程列表","menuJump":"列表","tableName":"lingyangliucheng"}],"menu":"领养流程模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"政策法规列表","menuJump":"列表","tableName":"zhengcefagui"}],"menu":"政策法规模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"员工","tableName":"yuangong"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看"],"menu":"宿舍物品","menuJump":"列表","tableName":"sushewupin"}],"menu":"宿舍物品管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","采购"],"menu":"物资","menuJump":"列表","tableName":"wuzi"}],"menu":"物资管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"物资采购","menuJump":"列表","tableName":"wuzicaigou"}],"menu":"物资采购管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","删除","报修状态"],"menu":"报修申请","menuJump":"列表","tableName":"baoxiushenqing"}],"menu":"报修申请管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"报修状态","menuJump":"列表","tableName":"baoxiuzhuangtai"}],"menu":"报修状态管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","领养申请"],"menu":"儿童信息列表","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息模块"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"院所风采列表","menuJump":"列表","tableName":"yuansuofengcai"}],"menu":"院所风采模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"活动列表","menuJump":"列表","tableName":"huodong"}],"menu":"活动模块"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看"],"menu":"食谱列表","menuJump":"列表","tableName":"shipu"}],"menu":"食谱模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"领养流程列表","menuJump":"列表","tableName":"lingyangliucheng"}],"menu":"领养流程模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"政策法规列表","menuJump":"列表","tableName":"zhengcefagui"}],"menu":"政策法规模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"后勤人员","tableName":"houqinrenyuan"}],
			baseUrl: '',
			carouselList: [],
			menuList: [],
			form: {
				ask: '',
				userid: localStorage.getItem('userid')
			},
			Token: localStorage.getItem('Token'),
            notAdmin: localStorage.getItem('sessionTable')!='"users"',
			timer: '',
			iconArr: [
				'el-icon-star-off',
				'el-icon-goods',
				'el-icon-warning',
				'el-icon-question',
				'el-icon-info',
				'el-icon-help',
				'el-icon-picture-outline-round',
				'el-icon-camera-solid',
				'el-icon-video-camera-solid',
				'el-icon-video-camera',
				'el-icon-bell',
				'el-icon-s-cooperation',
				'el-icon-s-order',
				'el-icon-s-platform',
				'el-icon-s-operation',
				'el-icon-s-promotion',
				'el-icon-s-release',
				'el-icon-s-ticket',
				'el-icon-s-management',
				'el-icon-s-open',
				'el-icon-s-shop',
				'el-icon-s-marketing',
				'el-icon-s-flag',
				'el-icon-s-comment',
				'el-icon-s-finance',
				'el-icon-s-claim',
				'el-icon-s-opportunity',
				'el-icon-s-data',
				'el-icon-s-check'
			],	
		}
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.menuList = this.$config.indexNav;
		this.getCarousel();
    },
    mounted() {
        this.activeIndex = localStorage.getItem('keyPath') || '0';
    },
    watch: {
        $route(newValue) {
            let that = this
            let url = window.location.href
            let arr = url.split('#')
            for (let x in this.menuList) {
                if (newValue.path == this.menuList[x].url) {
                    this.activeIndex = x
                }
            }
            this.Token = localStorage.getItem('Token')
        },
    },
    methods: {
        handleSelect(keyPath) {
            if (keyPath) {
                localStorage.setItem('keyPath', keyPath)
            }
        },
		toLogin() {
		  this.$router.push('/login');
		},
        logout() {
            localStorage.clear();
            Vue.http.headers.common['Token'] = "";
            this.$router.push('/index/home');
            this.activeIndex = '0'
            localStorage.setItem('keyPath', this.activeIndex)
            this.Token = ''
            this.$forceUpdate()
            this.$message({
                message: '登出成功',
                type: 'success',
                duration: 1000,
            });
        },
		getCarousel() {
			this.$http.get('config/list', {params: { page: 1, limit: 3 }}).then(res => {
				if (res.data.code == 0) {
					this.carouselList = res.data.data.list;
				}
			});
		},
		goBackend() {
			window.open(`${this.$config.baseUrl}admin/dist/index.html`, "_blank");
		},
		goMenu(path) {
            if (!localStorage.getItem('Token')) {
                this.toLogin();
            } else {
                this.$router.push(path);
            }
		},
    }
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.menu-preview {
	  .el-scrollbar {
	    height: 100%;
	
	    & /deep/ .scrollbar-wrapper {
	      overflow-x: hidden;
	    }
	  }
	}
	
	
	.menu-preview .el-menu-horizontal-demo .el-menu-item {
		cursor: pointer;
		border: 0;
		padding: 0 20px;
		margin: 0 10px 10px;
		color: #333;
		white-space: nowrap;
		display: flex;
		font-size: 14px;
		line-height: 50px;
		border-radius: 35px;
		background: #C9C9C9;
		align-items: center;
		position: relative;
		list-style: none;
		height: 50px;
	}
	
	.menu-preview .el-menu-horizontal-demo .el-menu-item:hover {
		cursor: pointer;
		border: 0;
		padding: 0 20px;
		margin: 0 10px 10px;
		color: #fff;
		white-space: nowrap;
		font-size: 14px;
		line-height: 50px;
		border-radius: 35px;
		background: #FDB930;
		position: relative;
		list-style: none;
		height: 50px;
	}
	
	.menu-preview .el-menu-horizontal-demo .el-menu-item.is-active {
		cursor: pointer;
		border: 0;
		padding: 0 20px;
		margin: 0 10px 10px;
		color: #fff;
		white-space: nowrap;
		font-size: 14px;
		line-height: 50px;
		border-radius: 35px;
		background: #FDB930;
		position: relative;
		list-style: none;
		height: 50px;
	}
	
	.banner-preview {
	  .el-carousel /deep/ .el-carousel__indicator button {
	    width: 0;
	    height: 0;
	    display: none;
	  }
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left:hover {
		background: red;
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right:hover {
		background: red;
	}

	.banner-preview .el-carousel /deep/ .el-carousel__indicators {
		padding: 0;
		margin: 0;
		z-index: 2;
		position: absolute;
		list-style: none;
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__indicators li {
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 12px;
		opacity: 0.4;
		transition: 0.3s;
		height: 12px;
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__indicators li:hover {
		padding: 0;
		margin: 0 4px;
		background: #FDB930;
		display: inline-block;
		width: 24px;
		opacity: 0.7;
		height: 12px;
	}
	
	.banner-preview .el-carousel /deep/ .el-carousel__indicators li.is-active {
		padding: 0;
		margin: 0 4px;
		background: #FDB930;
		display: inline-block;
		width: 24px;
		opacity: 1;
		height: 12px;
	}

    .chat-content {
      .left-content {
          width: 100%;
          text-align: left;
      }
      .right-content {
          width: 100%;
          text-align: right;
      }
    }
</style>
