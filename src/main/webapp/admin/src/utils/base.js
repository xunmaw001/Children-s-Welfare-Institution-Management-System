const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm2i051/",
            name: "ssm2i051",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm2i051/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "儿童福利院管理系统"
        } 
    }
}
export default base
