<template>
<div class="center-preview" :style='{"width":"1200px","margin":"0 auto 10px","position":"relative"}'>
	<div class="title" :style='{"margin":"10px 0","fontSize":"20px","lineHeight":"54px","color":"#333","textAlign":"center","background":"#f5f5f5"}'>{{ title }}</div>

    <el-tabs tab-position="left" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","background":"#fff"}' @tab-click="handleClick">
      <el-tab-pane label="个人中心">
        <el-form class="center-preview-pv" ref="sessionForm" :model="sessionForm" :rules="rules" label-width="80px">
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='aixinrenshi'" label="账号" prop="zhanghao">
            <el-input v-model="sessionForm.zhanghao" placeholder="账号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='aixinrenshi'" label="密码" prop="mima">
            <el-input type="password" v-model="sessionForm.mima" placeholder="密码"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='aixinrenshi'" label="姓名" prop="xingming">
            <el-input v-model="sessionForm.xingming" placeholder="姓名" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='aixinrenshi'" label="性别">
            <el-select v-model="sessionForm.xingbie" placeholder="请选择性别" >
              <el-option v-for="(item, index) in dynamicProp.xingbie" :key="index" :label="item" :value="item"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='aixinrenshi'" label="年龄" prop="nianling">
            <el-input v-model="sessionForm.nianling" placeholder="年龄" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='aixinrenshi'" label="头像">
            <el-upload
              class="avatar-uploader"
              :action="uploadUrl"
              :headers="headers"
              :show-file-list="false"
              :on-success="aixinrenshitouxiangHandleAvatarSuccess">
              <img :style='{"border":"1px dashed rgba(64, 158, 255, 1)","cursor":"pointer","color":"#3226BB","borderRadius":"0","textAlign":"center","borderImage":"linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1","width":"100px","fontSize":"32px","lineHeight":"100px","height":"100px"}' v-if="sessionForm.touxiang" :src="baseUrl + sessionForm.touxiang" class="avatar">
              <i v-else class="el-icon-plus avatar-uploader-icon"></i>
            </el-upload>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='aixinrenshi'" label="手机号" prop="shoujihao">
            <el-input v-model="sessionForm.shoujihao" placeholder="手机号" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='yuangong'" label="员工工号" prop="yuangonggonghao">
            <el-input v-model="sessionForm.yuangonggonghao" placeholder="员工工号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='yuangong'" label="密码" prop="mima">
            <el-input type="password" v-model="sessionForm.mima" placeholder="密码"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='yuangong'" label="员工姓名" prop="yuangongxingming">
            <el-input v-model="sessionForm.yuangongxingming" placeholder="员工姓名" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='yuangong'" label="性别">
            <el-select v-model="sessionForm.xingbie" placeholder="请选择性别" >
              <el-option v-for="(item, index) in dynamicProp.xingbie" :key="index" :label="item" :value="item"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='yuangong'" label="照片">
            <el-upload
              class="avatar-uploader"
              :action="uploadUrl"
              :headers="headers"
              :show-file-list="false"
              :on-success="yuangongzhaopianHandleAvatarSuccess">
              <img :style='{"border":"1px dashed rgba(64, 158, 255, 1)","cursor":"pointer","color":"#3226BB","borderRadius":"0","textAlign":"center","borderImage":"linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1","width":"100px","fontSize":"32px","lineHeight":"100px","height":"100px"}' v-if="sessionForm.zhaopian" :src="baseUrl + sessionForm.zhaopian" class="avatar">
              <i v-else class="el-icon-plus avatar-uploader-icon"></i>
            </el-upload>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='yuangong'" label="员工电话" prop="yuangongdianhua">
            <el-input v-model="sessionForm.yuangongdianhua" placeholder="员工电话" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='houqinrenyuan'" label="后勤工号" prop="houqingonghao">
            <el-input v-model="sessionForm.houqingonghao" placeholder="后勤工号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='houqinrenyuan'" label="密码" prop="mima">
            <el-input type="password" v-model="sessionForm.mima" placeholder="密码"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='houqinrenyuan'" label="后勤姓名" prop="houqinxingming">
            <el-input v-model="sessionForm.houqinxingming" placeholder="后勤姓名" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='houqinrenyuan'" label="性别">
            <el-select v-model="sessionForm.xingbie" placeholder="请选择性别" >
              <el-option v-for="(item, index) in dynamicProp.xingbie" :key="index" :label="item" :value="item"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='houqinrenyuan'" label="照片">
            <el-upload
              class="avatar-uploader"
              :action="uploadUrl"
              :headers="headers"
              :show-file-list="false"
              :on-success="houqinrenyuanzhaopianHandleAvatarSuccess">
              <img :style='{"border":"1px dashed rgba(64, 158, 255, 1)","cursor":"pointer","color":"#3226BB","borderRadius":"0","textAlign":"center","borderImage":"linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1","width":"100px","fontSize":"32px","lineHeight":"100px","height":"100px"}' v-if="sessionForm.zhaopian" :src="baseUrl + sessionForm.zhaopian" class="avatar">
              <i v-else class="el-icon-plus avatar-uploader-icon"></i>
            </el-upload>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"transparent"}' v-if="userTableName=='houqinrenyuan'" label="手机" prop="shouji">
            <el-input v-model="sessionForm.shouji" placeholder="手机" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"0","margin":"0"}'>
            <el-button :style='{"border":"0","cursor":"pointer","padding":"0 40px","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"35px","background":"#FDB930","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="primary" @click="onSubmit('sessionForm')">更新信息</el-button>
            <el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0 40px","margin":"0","outline":"none","color":"#565656","borderRadius":"35px","background":"#BEBEBE","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="danger" @click="logout">退出登录</el-button>
          </el-form-item>
        </el-form>
		
        <el-dialog title="用户充值" :visible.sync="dialogFormVisibleMoney" width="726px" center>
          <el-form :model="chongzhiForm">
            <el-form-item label="充值金额" label-width="120px">
              <el-input type="number" v-model="chongzhiForm.money" autocomplete="off" placeholder="充值金额"></el-input>
            </el-form-item>
            <el-form-item label-width="120px">
              <el-radio-group v-model="chongzhiForm.radio">
                <el-radio style="margin-bottom: 30px" label="微信支付">
                  <el-image
                    style="width: 60px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/weixin.png')"
                    fit="fill"></el-image>
                    <span style="display: inline-block;margin-left: 10px">微信支付</span>
                </el-radio>
                <el-radio label="支付宝支付">
                  <el-image
                    style="width: 60px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/zhifubao.png')"
                    fit="fill"></el-image>
                    <span style="display: inline-block;margin-left: 10px">支付宝支付</span>
                </el-radio>
                <el-radio label="中国建设银行支付">
                  <el-image
                    style="width: 120px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/jianshe.png')"
                    fit="fill"></el-image>
                </el-radio>
                <el-radio label="中国农业银行支付">
                  <el-image
                    style="width: 126px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/nongye.png')"
                    fit="fill"></el-image>
                </el-radio>
                <el-radio label="中国银行支付">
                  <el-image
                    style="width: 140px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/zhongguo.png')"
                    fit="fill"></el-image>
                </el-radio>
                <el-radio label="交通银行支付">
                  <el-image
                    style="width: 120px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/jiaotong.png')"
                    fit="fill"></el-image>
                </el-radio>
              </el-radio-group>
            </el-form-item>
          </el-form>
          <div slot="footer" class="dialog-footer">
            <el-button @click="dialogFormVisibleMoney = false">取 消</el-button>
            <el-button type="primary" @click="chongzhi">确认充值</el-button>
          </div>
        </el-dialog>
        <el-dialog title="会员购买" :visible.sync="dialogFormVisibleVip" width="726px" center>
          <el-form :model="chongzhiForm">
            <el-form-item label="会员卡" label-width="120px">
              <el-input readonly autocomplete="off" value="￥199/年"></el-input>
            </el-form-item>
            <el-form-item label-width="120px">
              <el-radio-group v-model="chongzhiForm.radio">
                <el-radio style="margin-bottom: 30px" label="微信支付">
                  <el-image
                    style="width: 60px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/weixin.png')"
                    fit="fill"></el-image>
                    <span style="display: inline-block;margin-left: 10px">微信支付</span>
                </el-radio>
                <el-radio label="支付宝支付">
                  <el-image
                    style="width: 60px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/zhifubao.png')"
                    fit="fill"></el-image>
                    <span style="display: inline-block;margin-left: 10px">支付宝支付</span>
                </el-radio>
                <el-radio label="中国建设银行支付">
                  <el-image
                    style="width: 120px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/jianshe.png')"
                    fit="fill"></el-image>
                </el-radio>
                <el-radio label="中国农业银行支付">
                  <el-image
                    style="width: 126px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/nongye.png')"
                    fit="fill"></el-image>
                </el-radio>
                <el-radio label="中国银行支付">
                  <el-image
                    style="width: 140px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/zhongguo.png')"
                    fit="fill"></el-image>
                </el-radio>
                <el-radio label="交通银行支付">
                  <el-image
                    style="width: 120px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/jiaotong.png')"
                    fit="fill"></el-image>
                </el-radio>
              </el-radio-group>
            </el-form-item>
          </el-form>
          <div slot="footer" class="dialog-footer">
            <el-button @click="dialogFormVisibleVip = false">取 消</el-button>
            <el-button type="primary" @click="chongzhivip">确认支付</el-button>
          </div>
        </el-dialog>
      </el-tab-pane>
      <el-tab-pane label="我的收藏"></el-tab-pane>
    </el-tabs>
</div>
</template>

<script>
  import config from '@/config/config'
  import Vue from 'vue'
  export default {
    //数据集合
    data() {
      return {
        title: '个人中心',
        baseUrl: config.baseUrl,
        sessionForm: {},
        rules: {},
        chongzhiForm: {
          money: '',
          radio: ''
        },
        disabled: false,
        dialogFormVisibleMoney: false,
        dialogFormVisibleVip: false,
        uploadUrl: config.baseUrl + 'file/upload',
        imageUrl: '',
        headers: {Token: localStorage.getItem('Token')},
        userTableName: localStorage.getItem('UserTableName'),
        dynamicProp: {}
      }
    },
    created() {
      if ('aixinrenshi' == this.userTableName) {
        this.$set(this.sessionForm, 'zhanghao', null);
      }
      if ('aixinrenshi' == this.userTableName) {
        this.$set(this.sessionForm, 'mima', null);
      }
      if ('aixinrenshi' == this.userTableName) {
        this.$set(this.sessionForm, 'xingming', null);
      }
      if ('aixinrenshi' == this.userTableName) {
        this.$set(this.sessionForm, 'xingbie', null);
      }
      if ('aixinrenshi' == this.userTableName) {
        this.$set(this.sessionForm, 'nianling', null);
      }
      if ('aixinrenshi' == this.userTableName) {
        this.$set(this.sessionForm, 'touxiang', null);
      }
      if ('aixinrenshi' == this.userTableName) {
        this.$set(this.sessionForm, 'shoujihao', null);
      }
      if ('yuangong' == this.userTableName) {
        this.$set(this.sessionForm, 'yuangonggonghao', null);
      }
      if ('yuangong' == this.userTableName) {
        this.$set(this.sessionForm, 'mima', null);
      }
      if ('yuangong' == this.userTableName) {
        this.$set(this.sessionForm, 'yuangongxingming', null);
      }
      if ('yuangong' == this.userTableName) {
        this.$set(this.sessionForm, 'xingbie', null);
      }
      if ('yuangong' == this.userTableName) {
        this.$set(this.sessionForm, 'zhaopian', null);
      }
      if ('yuangong' == this.userTableName) {
        this.$set(this.sessionForm, 'yuangongdianhua', null);
      }
      if ('houqinrenyuan' == this.userTableName) {
        this.$set(this.sessionForm, 'houqingonghao', null);
      }
      if ('houqinrenyuan' == this.userTableName) {
        this.$set(this.sessionForm, 'mima', null);
      }
      if ('houqinrenyuan' == this.userTableName) {
        this.$set(this.sessionForm, 'houqinxingming', null);
      }
      if ('houqinrenyuan' == this.userTableName) {
        this.$set(this.sessionForm, 'xingbie', null);
      }
      if ('houqinrenyuan' == this.userTableName) {
        this.$set(this.sessionForm, 'zhaopian', null);
      }
      if ('houqinrenyuan' == this.userTableName) {
        this.$set(this.sessionForm, 'shouji', null);
      }

      if ('aixinrenshi' == this.userTableName) {
        this.$set(this.rules, 'zhanghao', [{ required: true, message: '请输入账号', trigger: 'blur' }]);
      }
      if ('aixinrenshi' == this.userTableName) {
        this.$set(this.rules, 'mima', [{ required: true, message: '请输入密码', trigger: 'blur' }]);
      }
      if ('aixinrenshi' == this.userTableName) {
        this.$set(this.rules, 'xingming', [{ required: true, message: '请输入姓名', trigger: 'blur' }]);
      }
			if ('aixinrenshi' == this.userTableName) {
        this.$set(this.rules, 'nianling', [{ required: false, validator: this.$validate.isIntNumer, trigger: 'blur' }]);
      }
			if ('aixinrenshi' == this.userTableName) {
        this.$set(this.rules, 'shoujihao', [{ required: false, validator: this.$validate.isMobile, trigger: 'blur' }]);
      }
      if ('yuangong' == this.userTableName) {
        this.$set(this.rules, 'yuangonggonghao', [{ required: true, message: '请输入员工工号', trigger: 'blur' }]);
      }
      if ('yuangong' == this.userTableName) {
        this.$set(this.rules, 'mima', [{ required: true, message: '请输入密码', trigger: 'blur' }]);
      }
      if ('yuangong' == this.userTableName) {
        this.$set(this.rules, 'yuangongxingming', [{ required: true, message: '请输入员工姓名', trigger: 'blur' }]);
      }
			if ('yuangong' == this.userTableName) {
        this.$set(this.rules, 'yuangongdianhua', [{ required: false, validator: this.$validate.isMobile, trigger: 'blur' }]);
      }
      if ('houqinrenyuan' == this.userTableName) {
        this.$set(this.rules, 'houqingonghao', [{ required: true, message: '请输入后勤工号', trigger: 'blur' }]);
      }
      if ('houqinrenyuan' == this.userTableName) {
        this.$set(this.rules, 'mima', [{ required: true, message: '请输入密码', trigger: 'blur' }]);
      }
      if ('houqinrenyuan' == this.userTableName) {
        this.$set(this.rules, 'houqinxingming', [{ required: true, message: '请输入后勤姓名', trigger: 'blur' }]);
      }
			if ('houqinrenyuan' == this.userTableName) {
        this.$set(this.rules, 'shouji', [{ required: false, validator: this.$validate.isMobile, trigger: 'blur' }]);
      }

      this.init();
      this.getSession();
    },
    //方法集合
    methods: {
      init() {
        if ('aixinrenshi' == this.userTableName) {
          this.dynamicProp.xingbie = '男,女'.split(',');
        }
        if ('yuangong' == this.userTableName) {
          this.dynamicProp.xingbie = '男,女'.split(',');
        }
        if ('houqinrenyuan' == this.userTableName) {
          this.dynamicProp.xingbie = '男,女'.split(',');
        }
      },
      getSession() {
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.sessionForm = res.data.data;
            localStorage.setItem('userid', res.data.data.id);
            if(res.data.data.vip) {
                localStorage.setItem('vip', res.data.data.vip);
            }
            if(res.data.data.touxiang) {
                localStorage.setItem('headportrait', res.data.data.touxiang);
            } else if(res.data.data.headportrait) {
                localStorage.setItem('headportrait', res.data.data.headportrait);
            }
          }
        });
      },
      onSubmit(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.$http.post(this.userTableName + '/update', this.sessionForm).then(res => {
              if (res.data.code == 0) {
                this.$message({
                  message: '更新成功',
                  type: 'success',
                  duration: 1500
                });
              }
            });
          } else {
            return false;
          }
        });
      },
      aixinrenshitouxiangHandleAvatarSuccess(res, file) {
        if (res.code == 0) {
          if ('aixinrenshi' == this.userTableName) {
            this.sessionForm.touxiang = 'upload/' + res.file;
          }
        }
      },
      yuangongzhaopianHandleAvatarSuccess(res, file) {
        if (res.code == 0) {
          if ('yuangong' == this.userTableName) {
            this.sessionForm.zhaopian = 'upload/' + res.file;
          }
        }
      },
      houqinrenyuanzhaopianHandleAvatarSuccess(res, file) {
        if (res.code == 0) {
          if ('houqinrenyuan' == this.userTableName) {
            this.sessionForm.zhaopian = 'upload/' + res.file;
          }
        }
      },
      chongzhi() {
        if (this.chongzhiForm.money == '') {
          this.$message({
            message: '请输入充值金额',
            type: 'error',
            duration: 1500
          });
          return;
        }
        if (this.chongzhiForm.money <= 0) {
          this.$message({
            message: '请输入正确的充值金额',
            type: 'error',
            duration: 1500
          });
          return;
        }
        if (this.chongzhiForm.radio == '') {
          this.$message({
            message: '请选择充值方式',
            type: 'error',
            duration: 1500
          });
          return;
        }
        this.sessionForm.money = parseInt(this.sessionForm.money) + parseInt(this.chongzhiForm.money);
        this.$http.post(this.userTableName + '/update', this.sessionForm).then(res => {
          if (res.data.code == 0) {
            this.$message({
              message: '充值成功',
              type: 'success',
              duration: 1500,
              onClose: () => {
                this.dialogFormVisibleMoney = false;
              }
            });
          }
        });
      },
      chongzhivip() {
        this.chongzhiForm.money == 199;
        if (this.chongzhiForm.radio == '') {
          this.$message({
            message: '请选择支付方式',
            type: 'error',
            duration: 1500
          });
          return;
        }
        if(this.sessionForm.vip == '是') {
          this.$message({
            message: '您已是我们的尊贵会员。',
            type: 'success',
            duration: 1500
          });
          return;
        }
        
        this.sessionForm.vip = "是"
        this.$http.post(this.userTableName + '/update', this.sessionForm).then(res => {
          if (res.data.code == 0) {
            this.$message({
              message: '会员购买成功',
              type: 'success',
              duration: 1500,
              onClose: () => {
                localStorage.setItem('vip', this.sessionForm.vip);
                this.dialogFormVisibleVip = false;
              }
            });
          }
        });
      },
      handleClick(tab, event) {
        switch(event.target.outerText) {
          case '个人中心':
            tab.$router.push('/index/center');
            break;
          case '我的收藏':
            localStorage.setItem('storeupType', 1);
            tab.$router.push('/index/storeup');
            break;
        }

        this.title = event.target.outerText;
      },
      logout() {
        localStorage.clear();
        Vue.http.headers.common['Token'] = "";
        this.$router.push('/index/home');
        this.activeIndex = '0'
        localStorage.setItem('keyPath', this.activeIndex)
        this.$forceUpdate()
        this.$message({
            message: '登出成功',
            type: 'success',
            duration: 1500,
        });
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .center-preview {
  
    .el-tabs {
      & /deep/ .el-tabs__header {
        .el-tabs__nav-wrap {
          margin: 0;
  
          &::after {
            content: none;
          }
        }
  
        .el-tabs__active-bar {
          display: none !important;
        }
      }
  
      .center-preview-pv {
        .el-date-editor.el-input {
          width: auto;
        }
  
        .balance {
          .el-input {
            width: auto;
          }
        }
      }
    }
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header {
	padding: 0;
	margin: 0;
	background: #ECECEC;
	width: 180px;
	border-color: #eee;
	border-width: 0 1px 0 0;
	position: relative;
	float: left;
	border-style: solid;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item {
  	border-radius: 35px;
  	padding: 0 10px;
  	margin: 10px 0;
  	color: #565656;
  	background: #BDBDBD;
  	font-weight: 500;
  	font-size: 14px;
  	line-height: 40px;
  	position: relative;
  	text-align: center;
  	height: 40px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item:hover {
  	border-radius: 35px;
  	padding: 0 10px;
  	margin: 10px 0;
  	color: #fff;
  	background: #FDB930;
  	font-weight: 500;
  	font-size: 14px;
  	line-height: 40px;
  	position: relative;
  	text-align: center;
  	height: 40px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item.is-active {
  	border-radius: 35px;
  	padding: 0 10px;
  	margin: 10px 0;
  	color: #fff;
  	background: #FDB930;
  	font-weight: 500;
  	font-size: 14px;
  	line-height: 40px;
  	position: relative;
  	text-align: center;
  	height: 40px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__content .el-tab-pane {
  	padding: 10px;
  	background: #fff;
  }
  
  .center-preview-pv .el-form-item /deep/ .el-form-item__label {
  	padding: 0 10px 0 0;
  	color: #000;
  	font-weight: 500;
  	width: 80px;
  	font-size: 14px;
  	line-height: 40px;
  	text-align: right;
  }
  
  .center-preview-pv .el-form-item .el-form-item__content {
    margin-left: 80px;
  }
  
  .center-preview-pv .el-input /deep/ .el-input__inner {
  	border: 1px solid;
  	border-radius: 0;
  	padding: 0 12px;
  	box-shadow: 0 0 0px rgba(64, 158, 255, .5);
  	outline: none;
  	color: #000;
  	border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
  	width: 400px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv .el-select /deep/ .el-input__inner {
  	border: 1px solid;
  	border-radius: 0;
  	padding: 0 12px;
  	box-shadow: 0 0 0px rgba(64, 158, 255, .5);
  	outline: none;
  	color: #000;
  	border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
  	width: 400px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv .el-date-editor /deep/ .el-input__inner {
  	border: 1px solid;
  	border-radius: 0;
  	padding: 0 10px 0 30px;
  	box-shadow: 0 0 0px rgba(64, 158, 255, .5);
  	outline: none;
  	color: #000;
  	border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
  	width: 200px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv /deep/ .avatar-uploader-icon {
  	border: 1px dashed rgba(64, 158, 255, 1);
  	cursor: pointer;
  	border-radius: 0;
  	color: #3226BB;
  	border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
  	width: 100px;
  	font-size: 32px;
  	line-height: 100px;
  	text-align: center;
  	height: 100px;
  }
  
  .center-preview-pv .el-form-item.balance /deep/ .el-input__inner {
  	border: 1px solid ;
  	border-radius: 0;
  	padding: 0 12px;
  	box-shadow: 0 0 0px rgba(64, 158, 255, .5);
  	outline: none;
  	color: rgba(64, 158, 255, 1);
  	border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
  	display: inline-block;
  	width: 200px;
  	font-size: 14px;
  	height: 40px;
  }
</style>
