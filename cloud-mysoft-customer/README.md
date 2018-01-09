# spring cloud消费者

- 使用feign实现web Service
- feign集成ribbon实现负载均衡
- 提供hystrix监控：http://<ip>:<port>/htstrix.stream

# 断路器测试

- 运行cloud-mysoft-config
- 运行cloud-mysoft-eureka
- 运行cloud-mysoft-provide
- 运行cloud-mysoft-customer
- 访问:http://localhost:8022/feign/1		消费者调用提供者服务，返回user信息
- 停止cloud-mysoft-provide		停止提供者
- 再次访问 ，返回接口错误，即执行了cloud-mysoft-customer/src/main/java/com/mysoft/hystrix/UserHystrix.java
- 从监控查看：运行cloud-mysoft-hystrix-dashboard
- 运行cloud-mysoft-turbine
- 将聚合器turbine中的监控stream配置到dashboard中（查看cloud-mysoft-turbine/README.md），可以看到一项监控Circuit:Closed
- 多次访问已经产生错误的接口http://localhost:8022/feign/1     通常需要几十次
- 发现Circuit:Open
