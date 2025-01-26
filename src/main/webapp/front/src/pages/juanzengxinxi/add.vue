<template>
<div :style='{"width":"1200px","padding":"20px","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"10px auto","position":"relative"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' label="捐赠编号" prop="juanzengbianhao">
              <el-input v-model="ruleForm.juanzengbianhao" placeholder="捐赠编号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' label="捐赠名称" prop="juanzengmingcheng">
            <el-input v-model="ruleForm.juanzengmingcheng" 
                placeholder="捐赠名称" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}'  label="捐赠类型" prop="juanzengleixing">
            <el-select v-model="ruleForm.juanzengleixing" placeholder="请选择捐赠类型" >
              <el-option
                  v-for="(item,index) in juanzengleixingOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' label="捐赠数量" prop="juanzengshuliang">
            <el-input v-model="ruleForm.juanzengshuliang" 
                placeholder="捐赠数量" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' label="账号" prop="zhanghao">
            <el-input v-model="ruleForm.zhanghao" 
                placeholder="账号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' label="姓名" prop="xingming">
            <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' label="手机号" prop="shoujihao">
            <el-input v-model="ruleForm.shoujihao" 
                placeholder="手机号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' label="捐赠时间" prop="juanzengshijian" >
              <el-date-picker
                  format="yyyy 年 MM 月 dd 日"
                  value-format="yyyy-MM-dd"
                  v-model="ruleForm.juanzengshijian" 
                  type="date"
                  placeholder="捐赠时间">
              </el-date-picker> 
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0 40px","margin":"0 20px 0 0","outline":"none","color":"#fff","borderRadius":"28px","background":"#FDB930","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0 40px","margin":"0","outline":"none","color":"#565656","borderRadius":"28px","background":"#BEBEBE","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          juanzengbianhao: this.getUUID(),
          juanzengmingcheng: '',
          juanzengleixing: '',
          juanzengshuliang: '',
          zhanghao: '',
          xingming: '',
          shoujihao: '',
          juanzengshijian: '',
        },
        juanzengleixingOptions: [],
        rules: {
          juanzengbianhao: [
          ],
          juanzengmingcheng: [
            { required: true, message: '捐赠名称不能为空', trigger: 'blur' },
          ],
          juanzengleixing: [
          ],
          juanzengshuliang: [
            { required: true, message: '捐赠数量不能为空', trigger: 'blur' },
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          zhanghao: [
          ],
          xingming: [
          ],
          shoujihao: [
          ],
          juanzengshijian: [
          ],
          sfsh: [
          ],
          shhf: [
          ],
        },
      };
    },
    computed: {



    },
    created() {
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.ruleForm.juanzengshijian = this.getCurDate()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='juanzengbianhao'){
              this.ruleForm.juanzengbianhao = obj[o];
              continue;
            }
            if(o=='juanzengmingcheng'){
              this.ruleForm.juanzengmingcheng = obj[o];
              continue;
            }
            if(o=='juanzengleixing'){
              this.ruleForm.juanzengleixing = obj[o];
              continue;
            }
            if(o=='juanzengshuliang'){
              this.ruleForm.juanzengshuliang = obj[o];
              continue;
            }
            if(o=='zhanghao'){
              this.ruleForm.zhanghao = obj[o];
              continue;
            }
            if(o=='xingming'){
              this.ruleForm.xingming = obj[o];
              continue;
            }
            if(o=='shoujihao'){
              this.ruleForm.shoujihao = obj[o];
              continue;
            }
            if(o=='juanzengshijian'){
              this.ruleForm.juanzengshijian = obj[o];
              continue;
            }
          }
        }
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if(json.zhanghao!=''&&json.zhanghao){
                this.ruleForm.zhanghao = json.zhanghao
            }
            if(json.xingming!=''&&json.xingming){
                this.ruleForm.xingming = json.xingming
            }
            if(json.shoujihao!=''&&json.shoujihao){
                this.ruleForm.shoujihao = json.shoujihao
            }
          }
        });
        this.juanzengleixingOptions = "物资,钱款".split(',')
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('juanzengxinxi/detail/${id}', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

        //更新跨表属性
        var crossuserid;
        var crossrefid;
        var crossoptnum;
        this.$refs["ruleForm"].validate(valid => {
          if(valid) {
            if(this.type=='cross'){
                 var statusColumnName = localStorage.getItem('statusColumnName');
                 var statusColumnValue = localStorage.getItem('statusColumnValue');
                 if(statusColumnName && statusColumnName!='') {
                     var obj = JSON.parse(localStorage.getItem('crossObj'));
                     if(!statusColumnName.startsWith("[")) {
                         for (var o in obj){
                             if(o==statusColumnName){
                                 obj[o] = statusColumnValue;
                             }
                         }
                         var table = localStorage.getItem('crossTable');
                         this.$http.post(table+'/update', obj).then(res => {});
                     } else {
                            crossuserid=Number(localStorage.getItem('userid'));
                            crossrefid=obj['id'];
                            crossoptnum=localStorage.getItem('statusColumnName');
                            crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                     }
                 }
            }
            if(crossrefid && crossuserid) {
                 this.ruleForm.crossuserid=crossuserid;
                 this.ruleForm.crossrefid=crossrefid;
                 var params = {
                     page: 1,
                     limit: 10,
                     crossuserid:crossuserid,
                     crossrefid:crossrefid,
                 }
                 this.$http.get('juanzengxinxi/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算


                          this.$http.post('juanzengxinxi/add', this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  this.$message({
                                      message: '操作成功',
                                      type: 'success',
                                      duration: 1500,
                                      onClose: () => {
                                          this.$router.go(-1);
                                      }
                                  });
                              } else {
                                  this.$message({
                                      message: res.data.msg,
                                      type: 'error',
                                      duration: 1500
                                  });
                              }
                          });
                     }
                 });
             } else {


                  this.$http.post('juanzengxinxi/add', this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          this.$message({
                              message: '操作成功',
                              type: 'success',
                              duration: 1500,
                              onClose: () => {
                                  this.$router.go(-1);
                              }
                          });
                      } else {
                          this.$message({
                              message: res.data.msg,
                              type: 'error',
                              duration: 1500
                          });
                      }
                  });
             }
          }
        });
      },
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
      // 返回
      back() {
        this.$router.go(-1);
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #000;
	  font-weight: 500;
	  width: 80px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
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
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid ;
	  border-radius: 0;
	  padding: 0 10px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #000;
	  border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
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
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  border: 1px dashed rgba(64, 158, 255, 1);
	  cursor: pointer;
	  border-radius: 6px;
	  color: #3226BB;
	  border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px dashed rgba(64, 158, 255, 1);
	  cursor: pointer;
	  border-radius: 6px;
	  color: #3226BB;
	  border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px dashed rgba(64, 158, 255, 1);
	  cursor: pointer;
	  border-radius: 6px;
	  color: #3226BB;
	  border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid ;
	  border-radius: 0;
	  padding: 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #000;
	  border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
	  width: 400px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
