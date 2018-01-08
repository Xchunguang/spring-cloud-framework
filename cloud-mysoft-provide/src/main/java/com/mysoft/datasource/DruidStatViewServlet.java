package com.mysoft.datasource;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
 
import com.alibaba.druid.support.http.StatViewServlet;
 
/**
 * druid数据源状态监�?.
 * @author Administrator
 *
 */
 
@WebServlet(urlPatterns="/druid/*",
           initParams={
                   @WebInitParam(name="allow",value="172.20.13.133,127.0.0.1"),// IP白名�? (没有配置或�?�为空，则允许所有访�?)
                    @WebInitParam(name="deny",value="192.168.1.73"),// IP黑名�? (存在共同时，deny优先于allow)
                    @WebInitParam(name="loginUsername",value="admin"),// 用户�?
                    @WebInitParam(name="loginPassword",value="123456"),// 密码
                    @WebInitParam(name="resetEnable",value="false")// 禁用HTML页面上的“Reset All”功�?
           }
)
public class DruidStatViewServlet extends StatViewServlet{
   
}