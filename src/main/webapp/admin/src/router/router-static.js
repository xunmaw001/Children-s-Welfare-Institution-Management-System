import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import aixinrenshi from '@/views/modules/aixinrenshi/list'
    import yuangong from '@/views/modules/yuangong/list'
    import lingyangliucheng from '@/views/modules/lingyangliucheng/list'
    import sushe from '@/views/modules/sushe/list'
    import baoxiuzhuangtai from '@/views/modules/baoxiuzhuangtai/list'
    import lingyangshenqing from '@/views/modules/lingyangshenqing/list'
    import lingyanghouxu from '@/views/modules/lingyanghouxu/list'
    import yuansuofengcai from '@/views/modules/yuansuofengcai/list'
    import juanzengxinxi from '@/views/modules/juanzengxinxi/list'
    import wuzicaigou from '@/views/modules/wuzicaigou/list'
    import houqinrenyuan from '@/views/modules/houqinrenyuan/list'
    import zhengcefagui from '@/views/modules/zhengcefagui/list'
    import yigongshenqing from '@/views/modules/yigongshenqing/list'
    import sushewupin from '@/views/modules/sushewupin/list'
    import sushefenpei from '@/views/modules/sushefenpei/list'
    import messages from '@/views/modules/messages/list'
    import wuzi from '@/views/modules/wuzi/list'
    import baoxiushenqing from '@/views/modules/baoxiushenqing/list'
    import huodong from '@/views/modules/huodong/list'
    import shipu from '@/views/modules/shipu/list'
    import loudong from '@/views/modules/loudong/list'
    import ertongxinxi from '@/views/modules/ertongxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公益广告',
        component: news
      }
      ,{
	path: '/aixinrenshi',
        name: '爱心人士',
        component: aixinrenshi
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/lingyangliucheng',
        name: '领养流程',
        component: lingyangliucheng
      }
      ,{
	path: '/sushe',
        name: '宿舍',
        component: sushe
      }
      ,{
	path: '/baoxiuzhuangtai',
        name: '报修状态',
        component: baoxiuzhuangtai
      }
      ,{
	path: '/lingyangshenqing',
        name: '领养申请',
        component: lingyangshenqing
      }
      ,{
	path: '/lingyanghouxu',
        name: '领养后续',
        component: lingyanghouxu
      }
      ,{
	path: '/yuansuofengcai',
        name: '院所风采',
        component: yuansuofengcai
      }
      ,{
	path: '/juanzengxinxi',
        name: '捐赠信息',
        component: juanzengxinxi
      }
      ,{
	path: '/wuzicaigou',
        name: '物资采购',
        component: wuzicaigou
      }
      ,{
	path: '/houqinrenyuan',
        name: '后勤人员',
        component: houqinrenyuan
      }
      ,{
	path: '/zhengcefagui',
        name: '政策法规',
        component: zhengcefagui
      }
      ,{
	path: '/yigongshenqing',
        name: '义工申请',
        component: yigongshenqing
      }
      ,{
	path: '/sushewupin',
        name: '宿舍物品',
        component: sushewupin
      }
      ,{
	path: '/sushefenpei',
        name: '宿舍分配',
        component: sushefenpei
      }
      ,{
	path: '/messages',
        name: '在线留言',
        component: messages
      }
      ,{
	path: '/wuzi',
        name: '物资',
        component: wuzi
      }
      ,{
	path: '/baoxiushenqing',
        name: '报修申请',
        component: baoxiushenqing
      }
      ,{
	path: '/huodong',
        name: '活动',
        component: huodong
      }
      ,{
	path: '/shipu',
        name: '食谱',
        component: shipu
      }
      ,{
	path: '/loudong',
        name: '楼栋',
        component: loudong
      }
      ,{
	path: '/ertongxinxi',
        name: '儿童信息',
        component: ertongxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
