# Kyrie Blog
## 个人博客系统
Kyrie Blog是由SpringBoot1.5 + MyBatis + Thymeleaf等技术实现的个人网站。本项目在这个blog的基础上做了单元测试、集成测试、系统测试等。



### 技术栈
#### 后端
* 核心框架：SpringBoot
* 持久层框架：MyBatis
* 模板框架：Thymeleaf
* 分页插件：PageHelper
* 缓存框架：Ehcache
* Markdown：Commonmark

#### 前端
* JS框架：Jquery
* CSS框架：Bootstrap
* 富文本编辑器：editor.md
* 文件上传：dropzone
* 弹框插件：sweetalert

#### 第三方
* 七牛云（文件上传）
* 百度统计

### 预览效果
#### 前端效果
![index](http://caozongpeng.oss-cn-shenzhen.aliyuncs.com/image/blog/index.png)

![archives](http://caozongpeng.oss-cn-shenzhen.aliyuncs.com/image/blog/archives.png)

![detail](http://caozongpeng.oss-cn-shenzhen.aliyuncs.com/image/blog/detail.png)

![category](http://caozongpeng.oss-cn-shenzhen.aliyuncs.com/image/blog/category.png)

![about](http://caozongpeng.oss-cn-shenzhen.aliyuncs.com/image/blog/about.png)

#### 后端效果
![adminlogin](http://caozongpeng.oss-cn-shenzhen.aliyuncs.com/image/blog/adminlogin.png)

![adminindex](http://caozongpeng.oss-cn-shenzhen.aliyuncs.com/image/blog/adminindex.png)

![articlepublish](http://caozongpeng.oss-cn-shenzhen.aliyuncs.com/image/blog/articlepublish.png)

![articlemanager](http://caozongpeng.oss-cn-shenzhen.aliyuncs.com/image/blog/articlemanager.png)

![filemanager](http://caozongpeng.oss-cn-shenzhen.aliyuncs.com/image/blog/filemanager.png)

![setting](http://caozongpeng.oss-cn-shenzhen.aliyuncs.com/image/blog/setting.png)

### 安装
下载源码，执行sql文件，然后修改application-dev.yml文件中连接数据库的用户名、密码。运行项目即可。

前端访问地址：http://localhost:8888

后台访问地址：http://localhost:8888/admin 用户名：admin 密码：123456

### 更新日志
2018-08-04发布第一个版本
