# 父项目用来管理模块
- spring cloud 版本Brixton.SR5
- spring boot 版本 1.4.0.RELEASE

# 技术实现
- Spring Cloud Config做集群配置
- Netflix Eureka 服务治理
- Netflix Zuul 路由配置
- Netflix Ribbon 负载均衡
- Netflix Hystrix 熔断器
- Netflix Feign 声明式的web service客户端
- Hystrix Dashboard 监控面板
- Netflix Turbine 聚合器
- Spring Data Jpa ORM
- Druid 数据源与监控

# 使用方法
- 若为单机机运行添加host:C:\Windows\System32\drivers\etc\hosts

		127.0.0.1 slave1 slave2 gateway feign
	
- 修改cloud-mysoft-config/src/main/resource/下的配置文件
	
	- 其中application.yml是config配置
	- /shared文件夹下为各个项目配置
	
- 运行cloud-mysoft-config配置总线，<a href="https://github.com/Xchunguang/spring-cloud-framework/blob/master/cloud-mysoft-config">详情</a>
- 运行cloud-mysoft-eureka实现服务治理，<a href="https://github.com/Xchunguang/spring-cloud-framework/tree/master/cloud-mysoft-eureka">详情</a>
- 运行cloud-mysoft-provide提供服务，<a href="https://github.com/Xchunguang/spring-cloud-framework/tree/master/cloud-mysoft-provide">详情</a>
- 运行cloud-mysoft-customer消费服务，<a href="https://github.com/Xchunguang/spring-cloud-framework/blob/master/cloud-mysoft-customer">详情</a>
- 运行cloud-mysoft-api-gateway向外提供统一REST API ，<a href="https://github.com/Xchunguang/spring-cloud-framework/blob/master/cloud-mysoft-api-gateway">详情</a>
- 运行cloud-mysoft-hystrix-dashboard对hystrix提供监控可视化界面，<a href="https://github.com/Xchunguang/spring-cloud-framework/tree/master/cloud-mysoft-hystrix-dashboard">详情</a>
- 运行cloud-mysoft-turbine监控集群服务，<a href="https://github.com/Xchunguang/spring-cloud-framework/tree/master/cloud-mysoft-turbine">详情</a>

