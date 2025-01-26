import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import aixinrenshiList from '../pages/aixinrenshi/list'
import aixinrenshiDetail from '../pages/aixinrenshi/detail'
import aixinrenshiAdd from '../pages/aixinrenshi/add'
import yuangongList from '../pages/yuangong/list'
import yuangongDetail from '../pages/yuangong/detail'
import yuangongAdd from '../pages/yuangong/add'
import houqinrenyuanList from '../pages/houqinrenyuan/list'
import houqinrenyuanDetail from '../pages/houqinrenyuan/detail'
import houqinrenyuanAdd from '../pages/houqinrenyuan/add'
import ertongxinxiList from '../pages/ertongxinxi/list'
import ertongxinxiDetail from '../pages/ertongxinxi/detail'
import ertongxinxiAdd from '../pages/ertongxinxi/add'
import yuansuofengcaiList from '../pages/yuansuofengcai/list'
import yuansuofengcaiDetail from '../pages/yuansuofengcai/detail'
import yuansuofengcaiAdd from '../pages/yuansuofengcai/add'
import huodongList from '../pages/huodong/list'
import huodongDetail from '../pages/huodong/detail'
import huodongAdd from '../pages/huodong/add'
import shipuList from '../pages/shipu/list'
import shipuDetail from '../pages/shipu/detail'
import shipuAdd from '../pages/shipu/add'
import lingyangliuchengList from '../pages/lingyangliucheng/list'
import lingyangliuchengDetail from '../pages/lingyangliucheng/detail'
import lingyangliuchengAdd from '../pages/lingyangliucheng/add'
import zhengcefaguiList from '../pages/zhengcefagui/list'
import zhengcefaguiDetail from '../pages/zhengcefagui/detail'
import zhengcefaguiAdd from '../pages/zhengcefagui/add'
import loudongList from '../pages/loudong/list'
import loudongDetail from '../pages/loudong/detail'
import loudongAdd from '../pages/loudong/add'
import susheList from '../pages/sushe/list'
import susheDetail from '../pages/sushe/detail'
import susheAdd from '../pages/sushe/add'
import lingyangshenqingList from '../pages/lingyangshenqing/list'
import lingyangshenqingDetail from '../pages/lingyangshenqing/detail'
import lingyangshenqingAdd from '../pages/lingyangshenqing/add'
import yigongshenqingList from '../pages/yigongshenqing/list'
import yigongshenqingDetail from '../pages/yigongshenqing/detail'
import yigongshenqingAdd from '../pages/yigongshenqing/add'
import juanzengxinxiList from '../pages/juanzengxinxi/list'
import juanzengxinxiDetail from '../pages/juanzengxinxi/detail'
import juanzengxinxiAdd from '../pages/juanzengxinxi/add'
import sushewupinList from '../pages/sushewupin/list'
import sushewupinDetail from '../pages/sushewupin/detail'
import sushewupinAdd from '../pages/sushewupin/add'
import wuziList from '../pages/wuzi/list'
import wuziDetail from '../pages/wuzi/detail'
import wuziAdd from '../pages/wuzi/add'
import wuzicaigouList from '../pages/wuzicaigou/list'
import wuzicaigouDetail from '../pages/wuzicaigou/detail'
import wuzicaigouAdd from '../pages/wuzicaigou/add'
import baoxiushenqingList from '../pages/baoxiushenqing/list'
import baoxiushenqingDetail from '../pages/baoxiushenqing/detail'
import baoxiushenqingAdd from '../pages/baoxiushenqing/add'
import baoxiuzhuangtaiList from '../pages/baoxiuzhuangtai/list'
import baoxiuzhuangtaiDetail from '../pages/baoxiuzhuangtai/detail'
import baoxiuzhuangtaiAdd from '../pages/baoxiuzhuangtai/add'
import sushefenpeiList from '../pages/sushefenpei/list'
import sushefenpeiDetail from '../pages/sushefenpei/detail'
import sushefenpeiAdd from '../pages/sushefenpei/add'
import lingyanghouxuList from '../pages/lingyanghouxu/list'
import lingyanghouxuDetail from '../pages/lingyanghouxu/detail'
import lingyanghouxuAdd from '../pages/lingyanghouxu/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'aixinrenshi',
					component: aixinrenshiList
				},
				{
					path: 'aixinrenshiDetail',
					component: aixinrenshiDetail
				},
				{
					path: 'aixinrenshiAdd',
					component: aixinrenshiAdd
				},
				{
					path: 'yuangong',
					component: yuangongList
				},
				{
					path: 'yuangongDetail',
					component: yuangongDetail
				},
				{
					path: 'yuangongAdd',
					component: yuangongAdd
				},
				{
					path: 'houqinrenyuan',
					component: houqinrenyuanList
				},
				{
					path: 'houqinrenyuanDetail',
					component: houqinrenyuanDetail
				},
				{
					path: 'houqinrenyuanAdd',
					component: houqinrenyuanAdd
				},
				{
					path: 'ertongxinxi',
					component: ertongxinxiList
				},
				{
					path: 'ertongxinxiDetail',
					component: ertongxinxiDetail
				},
				{
					path: 'ertongxinxiAdd',
					component: ertongxinxiAdd
				},
				{
					path: 'yuansuofengcai',
					component: yuansuofengcaiList
				},
				{
					path: 'yuansuofengcaiDetail',
					component: yuansuofengcaiDetail
				},
				{
					path: 'yuansuofengcaiAdd',
					component: yuansuofengcaiAdd
				},
				{
					path: 'huodong',
					component: huodongList
				},
				{
					path: 'huodongDetail',
					component: huodongDetail
				},
				{
					path: 'huodongAdd',
					component: huodongAdd
				},
				{
					path: 'shipu',
					component: shipuList
				},
				{
					path: 'shipuDetail',
					component: shipuDetail
				},
				{
					path: 'shipuAdd',
					component: shipuAdd
				},
				{
					path: 'lingyangliucheng',
					component: lingyangliuchengList
				},
				{
					path: 'lingyangliuchengDetail',
					component: lingyangliuchengDetail
				},
				{
					path: 'lingyangliuchengAdd',
					component: lingyangliuchengAdd
				},
				{
					path: 'zhengcefagui',
					component: zhengcefaguiList
				},
				{
					path: 'zhengcefaguiDetail',
					component: zhengcefaguiDetail
				},
				{
					path: 'zhengcefaguiAdd',
					component: zhengcefaguiAdd
				},
				{
					path: 'loudong',
					component: loudongList
				},
				{
					path: 'loudongDetail',
					component: loudongDetail
				},
				{
					path: 'loudongAdd',
					component: loudongAdd
				},
				{
					path: 'sushe',
					component: susheList
				},
				{
					path: 'susheDetail',
					component: susheDetail
				},
				{
					path: 'susheAdd',
					component: susheAdd
				},
				{
					path: 'lingyangshenqing',
					component: lingyangshenqingList
				},
				{
					path: 'lingyangshenqingDetail',
					component: lingyangshenqingDetail
				},
				{
					path: 'lingyangshenqingAdd',
					component: lingyangshenqingAdd
				},
				{
					path: 'yigongshenqing',
					component: yigongshenqingList
				},
				{
					path: 'yigongshenqingDetail',
					component: yigongshenqingDetail
				},
				{
					path: 'yigongshenqingAdd',
					component: yigongshenqingAdd
				},
				{
					path: 'juanzengxinxi',
					component: juanzengxinxiList
				},
				{
					path: 'juanzengxinxiDetail',
					component: juanzengxinxiDetail
				},
				{
					path: 'juanzengxinxiAdd',
					component: juanzengxinxiAdd
				},
				{
					path: 'sushewupin',
					component: sushewupinList
				},
				{
					path: 'sushewupinDetail',
					component: sushewupinDetail
				},
				{
					path: 'sushewupinAdd',
					component: sushewupinAdd
				},
				{
					path: 'wuzi',
					component: wuziList
				},
				{
					path: 'wuziDetail',
					component: wuziDetail
				},
				{
					path: 'wuziAdd',
					component: wuziAdd
				},
				{
					path: 'wuzicaigou',
					component: wuzicaigouList
				},
				{
					path: 'wuzicaigouDetail',
					component: wuzicaigouDetail
				},
				{
					path: 'wuzicaigouAdd',
					component: wuzicaigouAdd
				},
				{
					path: 'baoxiushenqing',
					component: baoxiushenqingList
				},
				{
					path: 'baoxiushenqingDetail',
					component: baoxiushenqingDetail
				},
				{
					path: 'baoxiushenqingAdd',
					component: baoxiushenqingAdd
				},
				{
					path: 'baoxiuzhuangtai',
					component: baoxiuzhuangtaiList
				},
				{
					path: 'baoxiuzhuangtaiDetail',
					component: baoxiuzhuangtaiDetail
				},
				{
					path: 'baoxiuzhuangtaiAdd',
					component: baoxiuzhuangtaiAdd
				},
				{
					path: 'sushefenpei',
					component: sushefenpeiList
				},
				{
					path: 'sushefenpeiDetail',
					component: sushefenpeiDetail
				},
				{
					path: 'sushefenpeiAdd',
					component: sushefenpeiAdd
				},
				{
					path: 'lingyanghouxu',
					component: lingyanghouxuList
				},
				{
					path: 'lingyanghouxuDetail',
					component: lingyanghouxuDetail
				},
				{
					path: 'lingyanghouxuAdd',
					component: lingyanghouxuAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
