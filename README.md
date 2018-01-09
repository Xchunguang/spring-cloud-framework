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
- 若为单机运行添加host:C:\Windows\System32\drivers\etc\hosts

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


# RabbitMQ
- RabbitMQ window安装和使用

	- 安装<a href="http://www.erlang.org/downloads">Erlang</a>
	- 安装<a href="http://www.rabbitmq.com/download.html">RabbitMQ</a>
	- RabbitMQ server安装之后会自动注册成为服务
	- 注意设置环境变量RABBITMQ_BASE为一个不含中文的路径

- Rabbit管理

	可以通过访问配置文件进行管理，也可以通过web进行管理。通过web进行管理：
	
		执行：rabbitmq-plugins enable rabbitmq_management

	重启服务，打开浏览器http://localhost:15672,使用用户名guest密码guest登录，可看到管理界面。

		查看用户：rabbitmqctl.bat list_users
		创建用户：rabbitmqctl.bat add_user username password

- spring cloud集成RabbitMQ与spring cloud bus

	- 配置总线添加依赖：

			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-starter-bus-amqp</artifactId>
			</dependency>

	- 配置文件中添加RibbonMQ配置：

			spring:
			 cloud:
			  bus:
			   trace:
			    enabled:true
			 rabbitmq:
			   host: 10.11.85.21
			   port: 5672
			   username: root
			   password: 123456

	- 启动配置总线：发现控制台输出
	 
			Mapped "{[/bus/refresh],methods=[POST]}"

	- 修改配置，访问http://localhost:8888/index.html，点击按钮，实际上就是发送一个post请求到http://localhost:8888/bus/refresh ，在总线上的服务配置都会受到消息并更新
	- 查看RabbitMQ上的服务：

			访问：http://localhost:15672/#/connections
			可以查看到当前总线上的链接数和对应ip端口
