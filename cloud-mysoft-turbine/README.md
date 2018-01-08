# Turbine监控
在复杂的分布式系统中，相同服务的节点经常需要部署上百甚至上千个，很多时候，运维人员希望能够把相同服务的节点状态以一个整体集群的形式展现出来，这样可以更好的把握整个系统的状态。 为此，Netflix提供了一个开源项目（Turbine）来提供把多个hystrix.stream的内容聚合为一个数据源供Dashboard展示。

# 使用方法

	- 启动cloud-mysoft-config
	- 启动cloud-mysoft-eureka
	- 启动cloud-mysoft-provide
	- 启动cloud-mysoft-customer
	- 启动cloud-mysoft-hystrix-dashboard
	- 启动cloud-mysoft-turbine
	- 访问：http://localhost:8022/feign/1		制作访问记录
	- 访问：http://localhost:8031/turbine.stream		查看到监控数据，并不断刷新
	- 同cloud-mysoft-hystrix-dashboard一样，将数据放到Dashboard上展示：
	
		- 访问http://localhost:8030/hystrix.stream 
		- 将http://localhost:8031/turbine.stream输入到其上的输入框，并随意指定一个Title，即可查看到所有监控内接口的情况
		- 监控哪些服务在配置中：turbine.appConfig  配置，逗号隔开