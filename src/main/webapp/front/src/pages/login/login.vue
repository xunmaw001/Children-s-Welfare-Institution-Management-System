<template>
<div>
	<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20220912/aa7faefea6b542c2875341e3de45d3cf.png)","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
		<el-form ref="loginForm" :model="loginForm" :style='{"padding":"40px 20px 20px","boxShadow":"0 0px 0px rgba(64, 158, 255, .8)","margin":"0","borderRadius":"50px","background":"#fff","width":"400px","height":"auto"}' :rules="rules">
			<div v-if="false" :style='{"margin":"0 0 10px 0","color":"rgba(64, 158, 255, 1)","textAlign":"center","width":"100%","lineHeight":"44px","fontSize":"20px","textShadow":"4px 4px 2px rgba(64, 158, 255, .5)"}'>USER / LOGIN</div>
			<div v-if="true" :style='{"margin":"0 0 10px 0","color":"#FDB930","textAlign":"center","width":"100%","lineHeight":"44px","fontSize":"20px","fontWeight":"bold"}'>儿童福利院管理系统登录</div>
			<el-form-item class="list-item" :style='{"width":"80%","margin":"0 auto 10px"}' prop="username">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>账号：</div>
				<input :style='{"border":"1px solid #FDB930","padding":"0 10px","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","color":"#000","borderRadius":"10px","background":"#F9F9F9","width":"100%","fontSize":"14px","height":"44px"}' v-model="loginForm.username" placeholder="请输入账户">
			</el-form-item>
			<el-form-item class="list-item" :style='{"width":"80%","margin":"0 auto 10px"}' prop="password">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>密码：</div>
				<input :style='{"border":"1px solid #FDB930","padding":"0 10px","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","color":"#000","borderRadius":"10px","background":"#F9F9F9","width":"100%","fontSize":"14px","height":"44px"}' v-model="loginForm.password" placeholder="请输入密码" type="password">
			</el-form-item>
			<el-form-item v-if="roles.length>1" class="list-type" :style='{"width":"100%","margin":"20px auto"}' prop="role">
				<el-radio v-model="loginForm.tableName" :label="item.tableName" v-for="(item, index) in roles" :key="index" @change.native="getCurrentRow(item)">{{item.roleName}}</el-radio>
			</el-form-item>
			<el-form-item :style='{"width":"80%","margin":"20px auto"}'>
				<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"6px 0","outline":"none","color":"#fff","borderRadius":"35px","background":"#FDB930","width":"100%","fontSize":"14px","fontWeight":"bold","height":"44px"}' @click="submitForm('loginForm')">登录</el-button>
				<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"0 25%","outline":"none","color":"#fff","borderRadius":"35px","background":"#FDB930","width":"50%","fontSize":"14px","height":"44px"}' @click="resetForm('loginForm')">重置</el-button>
			</el-form-item>
			<div :style='{"width":"80%","margin":"20px auto","flexWrap":"wrap","display":"flex"}'>
			<router-link :style='{"cursor":"pointer","border":"1px solid #fff","padding":"4px 0","margin":"6px 0","color":"#000","textAlign":"center","background":"#EFECEC","borderWidth":"0 1px 0 0","display":"inline-block","width":"calc(50% - 2px)","fontSize":"14px","textDecoration":"none"}' :to="{path: '/register', query: {role: item.tableName,pageFlag:'register'}}" v-if="item.hasFrontRegister=='是'" v-for="(item, index) in roles" :key="index">注册{{item.roleName.replace('注册','')}}</router-link>
			</div>
		</el-form>
    </div>
</div>
</template>

<script>


export default {
	//数据集合
	data() {
		return {
			roleMenus: [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看"],"menu":"爱心人士","menuJump":"列表","tableName":"aixinrenshi"}],"menu":"爱心人士管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"后勤人员","menuJump":"列表","tableName":"houqinrenyuan"}],"menu":"后勤人员管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"儿童信息","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除"],"menu":"院所风采","menuJump":"列表","tableName":"yuansuofengcai"}],"menu":"院所风采管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"活动","menuJump":"列表","tableName":"huodong"}],"menu":"活动管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"食谱","menuJump":"列表","tableName":"shipu"}],"menu":"食谱管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"领养流程","menuJump":"列表","tableName":"lingyangliucheng"}],"menu":"领养流程管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"政策法规","menuJump":"列表","tableName":"zhengcefagui"}],"menu":"政策法规管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看"],"menu":"楼栋","menuJump":"列表","tableName":"loudong"}],"menu":"楼栋管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"宿舍","menuJump":"列表","tableName":"sushe"}],"menu":"宿舍管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"领养申请","menuJump":"列表","tableName":"lingyangshenqing"}],"menu":"领养申请管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"义工申请","menuJump":"列表","tableName":"yigongshenqing"}],"menu":"义工申请管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"捐赠信息","menuJump":"列表","tableName":"juanzengxinxi"}],"menu":"捐赠信息管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看"],"menu":"宿舍物品","menuJump":"列表","tableName":"sushewupin"}],"menu":"宿舍物品管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"物资","menuJump":"列表","tableName":"wuzi"}],"menu":"物资管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"物资采购","menuJump":"列表","tableName":"wuzicaigou"}],"menu":"物资采购管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"报修申请","menuJump":"列表","tableName":"baoxiushenqing"}],"menu":"报修申请管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"报修状态","menuJump":"列表","tableName":"baoxiuzhuangtai"}],"menu":"报修状态管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"宿舍分配","menuJump":"列表","tableName":"sushefenpei"}],"menu":"宿舍分配管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"领养后续","menuJump":"列表","tableName":"lingyanghouxu"}],"menu":"领养后续管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","回复","删除"],"menu":"在线留言","tableName":"messages"}],"menu":"在线留言"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公益广告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","领养申请"],"menu":"儿童信息列表","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息模块"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"院所风采列表","menuJump":"列表","tableName":"yuansuofengcai"}],"menu":"院所风采模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"活动列表","menuJump":"列表","tableName":"huodong"}],"menu":"活动模块"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看"],"menu":"食谱列表","menuJump":"列表","tableName":"shipu"}],"menu":"食谱模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"领养流程列表","menuJump":"列表","tableName":"lingyangliucheng"}],"menu":"领养流程模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"政策法规列表","menuJump":"列表","tableName":"zhengcefagui"}],"menu":"政策法规模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","领养申请"],"menu":"儿童信息","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"领养申请","menuJump":"列表","tableName":"lingyangshenqing"}],"menu":"领养申请管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看"],"menu":"义工申请","menuJump":"列表","tableName":"yigongshenqing"}],"menu":"义工申请管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看"],"menu":"捐赠信息","menuJump":"列表","tableName":"juanzengxinxi"}],"menu":"捐赠信息管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"领养后续","menuJump":"列表","tableName":"lingyanghouxu"}],"menu":"领养后续管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","领养申请"],"menu":"儿童信息列表","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息模块"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"院所风采列表","menuJump":"列表","tableName":"yuansuofengcai"}],"menu":"院所风采模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"活动列表","menuJump":"列表","tableName":"huodong"}],"menu":"活动模块"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看"],"menu":"食谱列表","menuJump":"列表","tableName":"shipu"}],"menu":"食谱模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"领养流程列表","menuJump":"列表","tableName":"lingyangliucheng"}],"menu":"领养流程模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"政策法规列表","menuJump":"列表","tableName":"zhengcefagui"}],"menu":"政策法规模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"爱心人士","tableName":"aixinrenshi"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看"],"menu":"爱心人士","menuJump":"列表","tableName":"aixinrenshi"}],"menu":"爱心人士管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"儿童信息","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"活动","menuJump":"列表","tableName":"huodong"}],"menu":"活动管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除"],"menu":"食谱","menuJump":"列表","tableName":"shipu"}],"menu":"食谱管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","宿舍"],"menu":"楼栋","menuJump":"列表","tableName":"loudong"}],"menu":"楼栋管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","修改","分配","物品"],"menu":"宿舍","menuJump":"列表","tableName":"sushe"}],"menu":"宿舍管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","审核","领养后续"],"menu":"领养申请","menuJump":"列表","tableName":"lingyangshenqing"}],"menu":"领养申请管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","审核"],"menu":"义工申请","menuJump":"列表","tableName":"yigongshenqing"}],"menu":"义工申请管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","审核"],"menu":"捐赠信息","menuJump":"列表","tableName":"juanzengxinxi"}],"menu":"捐赠信息管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","删除"],"menu":"宿舍物品","menuJump":"列表","tableName":"sushewupin"}],"menu":"宿舍物品管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","删除"],"menu":"物资","menuJump":"列表","tableName":"wuzi"}],"menu":"物资管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"物资采购","menuJump":"列表","tableName":"wuzicaigou"}],"menu":"物资采购管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","审核"],"menu":"报修申请","menuJump":"列表","tableName":"baoxiushenqing"}],"menu":"报修申请管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"报修状态","menuJump":"列表","tableName":"baoxiuzhuangtai"}],"menu":"报修状态管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"宿舍分配","menuJump":"列表","tableName":"sushefenpei"}],"menu":"宿舍分配管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"领养后续","menuJump":"列表","tableName":"lingyanghouxu"}],"menu":"领养后续管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","领养申请"],"menu":"儿童信息列表","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息模块"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"院所风采列表","menuJump":"列表","tableName":"yuansuofengcai"}],"menu":"院所风采模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"活动列表","menuJump":"列表","tableName":"huodong"}],"menu":"活动模块"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看"],"menu":"食谱列表","menuJump":"列表","tableName":"shipu"}],"menu":"食谱模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"领养流程列表","menuJump":"列表","tableName":"lingyangliucheng"}],"menu":"领养流程模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"政策法规列表","menuJump":"列表","tableName":"zhengcefagui"}],"menu":"政策法规模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"员工","tableName":"yuangong"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看"],"menu":"宿舍物品","menuJump":"列表","tableName":"sushewupin"}],"menu":"宿舍物品管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","采购"],"menu":"物资","menuJump":"列表","tableName":"wuzi"}],"menu":"物资管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"物资采购","menuJump":"列表","tableName":"wuzicaigou"}],"menu":"物资采购管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","删除","报修状态"],"menu":"报修申请","menuJump":"列表","tableName":"baoxiushenqing"}],"menu":"报修申请管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"报修状态","menuJump":"列表","tableName":"baoxiuzhuangtai"}],"menu":"报修状态管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","领养申请"],"menu":"儿童信息列表","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息模块"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"院所风采列表","menuJump":"列表","tableName":"yuansuofengcai"}],"menu":"院所风采模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"活动列表","menuJump":"列表","tableName":"huodong"}],"menu":"活动模块"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看"],"menu":"食谱列表","menuJump":"列表","tableName":"shipu"}],"menu":"食谱模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"领养流程列表","menuJump":"列表","tableName":"lingyangliucheng"}],"menu":"领养流程模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"政策法规列表","menuJump":"列表","tableName":"zhengcefagui"}],"menu":"政策法规模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"后勤人员","tableName":"houqinrenyuan"}],
			loginForm: {
				username: '',
				password: '',
				tableName: '',
				code: '',
			},
			role: '',
            roles: [],
			rules: {
				username: [
					{ required: true, message: '请输入账户', trigger: 'blur' }
				],
				password: [
					{ required: true, message: '请输入密码', trigger: 'blur' }
				]
			},
			codes: [{
				num: 1,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}, {
				num: 2,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}, {
				num: 3,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}, {
				num: 4,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}]
		}
	},
	created() {
        for(let item in this.roleMenus) {
            if(this.roleMenus[item].hasFrontLogin=='是') {
                this.roles.push(this.roleMenus[item]);
            }
        }
	},
	mounted() {
	},
    //方法集合
    methods: {
		randomString() {
			var len = 4;
			var chars = [
			  'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
			  'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
			  'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
			  'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			  'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
			  '3', '4', '5', '6', '7', '8', '9'
			]
			var colors = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f']
			var sizes = ['14', '15', '16', '17', '18']
			
			var output = []
			for (var i = 0; i < len; i++) {
			  // 随机验证码
			  var key = Math.floor(Math.random() * chars.length)
			  this.codes[i].num = chars[key]
			  // 随机验证码颜色
			  var code = '#'
			  for (var j = 0; j < 6; j++) {
			    var key = Math.floor(Math.random() * colors.length)
			    code += colors[key]
			  }
			  this.codes[i].color = code
			  // 随机验证码方向
			  var rotate = Math.floor(Math.random() * 45)
			  var plus = Math.floor(Math.random() * 2)
			  if (plus == 1) rotate = '-' + rotate
			  this.codes[i].rotate = 'rotate(' + rotate + 'deg)'
			  // 随机验证码字体大小
			  var size = Math.floor(Math.random() * sizes.length)
			  this.codes[i].size = sizes[size] + 'px'
			}
		},
      getCurrentRow(row) {
        this.role = row.roleName;
      },
      submitForm(formName) {
        if (this.roles.length!=1) {
            if (!this.role) {
                this.$message.error("请选择登录用户类型");
                return false;
            }
        } else {
            this.role = this.roles[0].roleName;
            this.loginForm.tableName = this.roles[0].tableName;
        }
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.$http.get(`${this.loginForm.tableName}/login`, {params: this.loginForm}).then(res => {
              if (res.data.code === 0) {
                localStorage.setItem('Token', res.data.token);
                localStorage.setItem('UserTableName', this.loginForm.tableName);
                localStorage.setItem('username', this.loginForm.username);
                localStorage.setItem('adminName', this.loginForm.username);
                localStorage.setItem('sessionTable', this.loginForm.tableName);
                localStorage.setItem('role', this.role);
                localStorage.setItem('keyPath', this.$config.indexNav.length+2);
                this.$router.push('/index/center');
                this.$message({
                  message: '登录成功',
                  type: 'success',
                  duration: 1500,
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.container {
		position: relative;
		background: url(http://codegen.caihongy.cn/20220912/aa7faefea6b542c2875341e3de45d3cf.png);
		
		.el-form-item {
		  & /deep/ .el-form-item__content {
		    width: 100%;
		  }
		}
		
		.list-item /deep/ .el-input .el-input__inner {
			border: 1px solid #FDB930;
			border-radius: 10px;
			padding: 0 10px;
			box-shadow: 0 0 0px rgba(64, 158, 255, .5);
			color: #000;
			background: #F9F9F9;
			width: 100%;
			font-size: 14px;
			height: 44px;
		}
		
		.list-code /deep/ .el-input .el-input__inner {
			border: 1px solid #FDB930;
			border-radius: 10px 0 0 10px;
			padding: 0 10px;
			outline: none;
			color: #000;
			background: #F9F9F9;
			display: inline-block;
			vertical-align: middle;
			width: calc(100% - 80px);
			font-size: 14px;
			height: 44px;
		}
		
		.list-type /deep/ .el-radio__input .el-radio__inner {
			background: rgba(53, 53, 53, 0);
			border-color: #666666;
		}
		.list-type /deep/ .el-radio__input.is-checked .el-radio__inner {
			background: #FDB930;
			border-color: #FDB930;
		}
		.list-type /deep/ .el-radio__label {
			color: #666666;
			font-size: 14px;
		}
		.list-type /deep/ .el-radio__input.is-checked+.el-radio__label {
			color: #FDB930;
			font-size: 14px;
		}
	}
</style>
