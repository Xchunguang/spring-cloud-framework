# Hystrix监控
除了隔离依赖服务的调用以外，Hystrix还提供了近实时的监控，Hystrix会实时、累加地记录所有关于HystrixCommand的执行信息，包括每秒执行多少请求多少成功，多少失败等。Netflix通过hystrix-metrics-event-stream项目实现了对以上指标的监控。

- 使用过程：
	
	- 启动cloud-mysoft-config
	- 启动cloud-mysoft-eureka
	- 启动cloud-mysoft-provide
	- 启动cloud-mysoft-customer
	- 访问：http://localhost:8022/feign/1		制造访问记录
	- 访问：http://localhost:8022/hystrix.stream		将看到监控记录并不断在刷新
	- 启动cloud-mysoft-hystrix-dashboard
	- 访问：http://localhost:8030/hystrix.stream		会看到页面
	- 在输入框中输入http://localhost:8022/hystrix.stream ，并随意写一个title即可看到监控图形，和熔断器的状态
	- 可以关闭服务提供者cloud-mysoft-provide，多次刷新http://localhost:8022/feign/1，测试熔断器状态，当多次请求失败后熔断器开启，并输出定义好的fallback：cloud-mysoft-customer/src/main/hystrix/...
	- 可以将监控记录进行持久化