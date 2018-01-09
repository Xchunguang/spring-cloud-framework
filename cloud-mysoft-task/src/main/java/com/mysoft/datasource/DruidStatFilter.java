package com.mysoft.datasource;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
 
import com.alibaba.druid.support.http.WebStatFilter;
 
/**
 * druid过滤�?.
 * @author Administrator
 *
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
    initParams={
             @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
     }
)
public class DruidStatFilter extends WebStatFilter{
 
}