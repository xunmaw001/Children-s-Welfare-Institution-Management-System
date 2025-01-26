<template>
<div class="home-preview" :style='{"width":"100%","margin":"10px auto"}'>




	
<div class="news" :style='{"padding":"0 calc((100% - 1200px) / 2) 0","margin":"0","position":"relative","background":"url(http://codegen.caihongy.cn/20220913/01d9cb30de0b48e6a2583bd7ea400575.png) center center/cover"}'>
	
	<div class="title" :style='{"width":"200px","margin":"10px 140px","lineHeight":"130px","textAlign":"center"}'>
		<span :style='{"color":"#FDB930","fontSize":"24px","fontWeight":"bold"}'>公益广告</span>
	</div>
	
	<div v-if="true" class="idea newsIdea" :style='{"padding":"0","top":"5%","flexWrap":"wrap","background":"#fff","display":"flex","width":"70%","position":"absolute","right":"0","justifyContent":"space-between","height":"16px"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"0"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"0"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"0"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"0"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	
	
	
	
	<!-- 样式五 -->
	<div v-if="newsList.length" class="list list5 index-pv1" :style='{"width":"100%","padding":"10px","background":"transparent","height":"auto"}'>
	  <div @click="toDetail('newsDetail', newsList[0])" v-if="newsList.length>0" class="list-item animation-box" :style='{"margin":"0 0 20px","overflow":"hidden","borderRadius":"10px","background":"#fff","width":"100%","position":"relative","height":"280px"}'>
	    <img :style='{"objectFit":"cover","width":"100%","height":"275px"}' :src="baseUrl + newsList[0].picture" alt="">
	    <div :style='{"padding":"10px","background":"rgba(0,0,0,.3)","display":"inline-block","width":"30%","position":"absolute","right":"0","height":"275px"}'>
	      <div :style='{"padding":"10px","lineHeight":"32px","fontSize":"16px","color":"#fff"}' class="new5-one-info-title line1">{{newsList[0].title}}</div>
	      <div :style='{"padding":"10px","lineHeight":"32px","fontSize":"14px","color":"#fff"}' class="new5-one-info-descript line3">{{newsList[0].introduction}}</div>
	      <div :style='{"padding":"10px","lineHeight":"32px","fontSize":"12px","color":"#fff"}' class="new5-one-info-time">{{newsList[0].addtime}}</div>
	    </div>
	  </div>
	  <div :style='{"width":"100%","flexWrap":"wrap","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}' class="list-body">
	    <div @click="toDetail('newsDetail', newsList[1])" v-if="newsList.length>1" class="new5-item animation-box" :style='{"padding":"10px","overflow":"hidden","borderRadius":"10px","background":"url(http://codegen.caihongy.cn/20220913/fa70d7f5030446afbb049ef21960f905.png) center center/cover no-repeat","width":"360px","position":"relative","height":"185px"}'>
	      <div :style='{"padding":"10px","color":"#fff","top":"30px","left":"10px","display":"inline-block","width":"60px","lineHeight":"1.5","fontSize":"12px","position":"absolute"}' class="new5-item-time">{{newsList[1].addtime.split(" ")[0]}}1</div>
	      <div :style='{"width":"calc(100% - 70px)","padding":"10px","margin":"0 0 0 70px","lineHeight":"1","fontSize":"16px","color":"#fff"}' class="new5-item-title line1">{{newsList[1].title}}</div>
	      <div :style='{"width":"calc(100% - 70px)","padding":"10px","margin":"0 0 0 70px","lineHeight":"32px","fontSize":"14px","color":"#fff"}' class="new5-item-descript line3">{{newsList[1].introduction}}</div>
	    </div>
		<div @click="toDetail('newsDetail', newsList[2])" v-if="newsList.length>2" class="new5-item animation-box" :style='{"padding":"10px","overflow":"hidden","borderRadius":"10px","background":"url(http://codegen.caihongy.cn/20220913/5218ff105b5d4e51ab339563405b9250.png) center center/cover no-repeat","width":"360px","position":"relative","height":"185px"}'>
		  <div :style='{"padding":"10px","color":"#fff","top":"30px","left":"10px","display":"inline-block","width":"60px","lineHeight":"1.5","fontSize":"12px","position":"absolute"}' class="new5-item-time">{{newsList[2].addtime.split(" ")[0]}}</div>
		  <div :style='{"width":"calc(100% - 70px)","padding":"10px","margin":"0 0 0 70px","lineHeight":"1","fontSize":"16px","color":"#fff"}' class="new5-item-title line1">{{newsList[2].title}}</div>
		  <div :style='{"width":"calc(100% - 70px)","padding":"10px","margin":"0 0 0 70px","lineHeight":"32px","fontSize":"14px","color":"#fff"}' class="new5-item-descript line3">{{newsList[2].introduction}}</div>
		</div>
		<div @click="toDetail('newsDetail', newsList[3])" v-if="newsList.length>3" class="new5-item animation-box" :style='{"padding":"10px","overflow":"hidden","borderRadius":"10px","background":"url(http://codegen.caihongy.cn/20220913/1607701f0a1e48ea8bbf4224c9c946b4.png) center center/cover no-repeat","width":"360px","position":"relative","height":"185px"}'>
		  <div :style='{"padding":"10px","color":"#fff","top":"30px","left":"10px","display":"inline-block","width":"60px","lineHeight":"1.5","fontSize":"12px","position":"absolute"}' class="new5-item-time">{{newsList[3].addtime.split(" ")[0]}}</div>
		  <div :style='{"width":"calc(100% - 70px)","padding":"10px","margin":"0 0 0 70px","lineHeight":"1","fontSize":"16px","color":"#fff"}' class="new5-item-title line1">{{newsList[3].title}}</div>
		  <div :style='{"width":"calc(100% - 70px)","padding":"10px","margin":"0 0 0 70px","lineHeight":"32px","fontSize":"14px","color":"#fff"}' class="new5-item-descript line3">{{newsList[3].introduction}}</div>
		</div>
	  </div>
	</div>
	
	
	
	
	
	
	<div @click="moreBtn('news')" :style='{"border":"0","margin":"10px auto","textAlign":"center","background":"#030303","display":"block","width":"200px","lineHeight":"56px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"18px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"0"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>


<div class="lists" :style='{"padding":"0 calc((100% - 1200px) / 2) 0","margin":"0 0 0","position":"relative","background":"url(http://codegen.caihongy.cn/20220913/41d4718b69ee477c9be83cc635a132dc.png) center center/cover no-repeat"}'>
	
	<div class="title" :style='{"width":"200px","margin":"10px 140px","lineHeight":"150px","textAlign":"center"}'>
	  <span :style='{"color":"#FDB930","fontSize":"24px","fontWeight":"bold"}'>儿童信息展示</span>
	</div>
	
	<div v-if="true" class="idea" :style='{"padding":"24px","top":"50%","flexWrap":"wrap","left":"0","background":"url(http://codegen.caihongy.cn/20220913/4326ded082814ee393dd812ed1b8b81c.png) center center/cover no-repeat","display":"flex","width":"100%","position":"absolute","justifyContent":"space-between"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"0"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"0"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"0"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"0"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<!-- 样式一 -->
	<div class="list list1 index-pv1" :style='{"padding":"0 10px","alignItems":"flex-start","flexWrap":"wrap","background":"transparent","display":"flex","width":"100%","justifyContent":"space-around","height":"auto"}'>
		<div :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"0 0 80px 0","overflow":"hidden","borderRadius":"10px","background":"#fff","display":"inline-block","width":"calc((100% / 4) - 40px)","position":"relative","height":"auto"}' v-for="(item,index) in ertongxinxiList" :key="index" @click="toDetail('ertongxinxiDetail', item)" class="list-item animation-box">
			<img :style='{"width":"275px","objectFit":"cover","display":"block","height":"180px"}' v-if="item.ertongzhaopian.substr(0,4)=='http'" :src="item.ertongzhaopian.split(',')[0]" alt="" />
			<img :style='{"width":"275px","objectFit":"cover","display":"block","height":"180px"}' v-else :src="baseUrl + (item.ertongzhaopian?item.ertongzhaopian.split(',')[0]:'')" alt="" />
			<div class="name line1" :style='{"padding":"0","lineHeight":"32px","fontSize":"14px","color":"#333","textAlign":"center"}'>{{item.ertongxingming}}</div>
		</div>
	</div>
	
	
	
	
	
	
	
	
	
	<div @click="moreBtn('ertongxinxi')" :style='{"border":"0","margin":"10px auto","textAlign":"center","background":"#030303","display":"block","width":"200px","lineHeight":"50px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"18px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"0"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>


</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        newsList: [],

        ertongxinxiList: [],
      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getNewsList();
      this.getList();
    },
    //方法集合
    methods: {
		getNewsList() {
			this.$http.get('news/list', {params: {
				page: 1,
				limit: 6,
			order: 'desc'}}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
          let autoSortUrl = "";
			
			this.$http.get('ertongxinxi/list', {params: {
				page: 1,
				limit: 7,
			}}).then(res => {
				if (res.data.code == 0) {
					this.ertongxinxiList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
	
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1.1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
</style>
