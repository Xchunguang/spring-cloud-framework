# api gateway
通过API Gateway，可以统一向外部系统提供REST API。Spring Cloud中使用Zuul作为API Gateway。Zuul提供了动态路由、监控、回退、安全等功能。

# 使用

- 启动cloud-mysoft-config
- 启动cloud-mysoft-eureka
- 启动cloud-mysoft-provide
- 启动cloud-mysoft-api-gateway
- 访问http://localhost:8050/cloud-mysoft-customer/1  ，返回结果与 访问  http://localhost:8022/feign/1  的结果一致
- 配置自定义路由zuul.routers,见cloud-mysoft-api-gateway.yml
- 访问http://localhost:8050/user/1   返回结果与访问http://localhost:8022/feign/1  结果一致