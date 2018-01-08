# 服务提供者
spring cloud使用spring Data jpa继承druid数据源和监控

### 使用方法
- 修改cloud-mysoft-provide.yml中数据库连接信息
- 执行sql创建表
- 运行ProvideApplication.java
- 访问localhost:8000/1 实现REST Api访问
- 访问localhost:8000/druid/index.html 输入账号admin，密码123456，查看druid监控信息