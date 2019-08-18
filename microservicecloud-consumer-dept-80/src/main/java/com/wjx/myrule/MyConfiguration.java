package com.wjx.myrule;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name="microservicecloud-dept", configuration = MySelfRule.class) //在启动该微服务的时候就能去加载我们自定义的Ribbon配置类，使配置生效
public class MyConfiguration {

}
