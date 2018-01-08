# spring cloud config

- spring cloud项目使用config需在bootstrap.yml中配置spring.config信息，亦可指定为git地址方便版本控制。
	
		spring:
		 application:
		  name: *****
		 cloud:
		  config:
		   uri: http://localhost:8888
		   fail-fast: true
		   password: root
		   username: user
		   
- 所有使用config的项目需要引入依赖：否则无法使用config

		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-config</artifactId>
		</dependency>