package com.mysoft.hystrix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mysoft.client.UserClient;
import com.mysoft.module.User;

/**
 * 熔断器，当接口出现问题时调用
 * @author xuchg1
 *
 */
@Component
public class UserHystrix implements UserClient{
	private static final Logger LOGGER = LoggerFactory.getLogger(UserClient.class);
	@Override
	public User findById(Long id) {
		UserHystrix.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
		User user = new User();
		user.setUserid(-1);
		user.setUsername("接口出错");
		return user;
	}

}
